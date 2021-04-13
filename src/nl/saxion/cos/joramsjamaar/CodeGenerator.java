package nl.saxion.cos.joramsjamaar;

import nl.saxion.cos.joramsjamaar.model.DataType;
import nl.saxion.cos.joramsjamaar.model.Symbol;

import java.util.HashMap;

public class CodeGenerator extends ParlementBaseVisitor<DataType>
{
    private JasminBytecode jasminCode;
    private HashMap<String, Symbol> hashList = new HashMap<>();
    private String className;

    private int loopCounter = 0;
    private int eqCounter = 0;
    private int ifCounter = 0;

    /**
     * Loads a symbol to the stack
     * <p>
     * Pushes a var to local by loading it
     *
     * @param s Symbol to pull
     * @return DataType of symbol
     */
    private DataType loadSymbol(Symbol s)
    {
        switch (s.getType())
        {
            case STRING:
                jasminCode.add("aload " + s.getLocalSlot());
                return DataType.STRING;

            case INT:
                jasminCode.add("iload " + s.getLocalSlot());
                return DataType.INT;

            case BOOLEAN:
                jasminCode.add("iload " + s.getLocalSlot());
                return DataType.BOOLEAN;
        }

        return null;
    }

    /**
     * Stores a symbol
     * <p>
     * Pops local var and stores it
     *
     * @param s Symbol to store
     * @return DataType of symbol
     */
    private DataType storeSymbol(Symbol s)
    {
        switch (s.getType())
        {
            case STRING:
                jasminCode.add("astore " + s.getLocalSlot());
                return DataType.STRING;

            case INT:
                jasminCode.add("istore " + s.getLocalSlot());
                return DataType.INT;

            case BOOLEAN:
                jasminCode.add("istore " + s.getLocalSlot());
                return DataType.BOOLEAN;
        }

        return null;
    }

    /**
     * Constructs a code generator.
     */
    public CodeGenerator(JasminBytecode jasminCode, String className)
    {
        this.jasminCode = jasminCode;
        this.className = className;
    }

    /**
     * Print Statement
     * <p>
     * Wraps expression in a System.out.println method and invokes it
     */
    @Override
    public DataType visitPrintStmt(ParlementParser.PrintStmtContext ctx)
    {
        jasminCode.add("getstatic java/lang/System/out Ljava/io/PrintStream;");

        DataType d = visit(ctx.expression());

        switch (d)
        {
            case STRING:
                jasminCode.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
                break;

            case INT:
                jasminCode.add("invokevirtual java/io/PrintStream/println(I)V");
                break;

            default:
                assert false;
        }

        return null;
    }

    @Override
    public DataType visitExParentheses(ParlementParser.ExParenthesesContext ctx)
    {
        return visit(ctx.expression());
    }

    /**
     * Assigns data to a variable
     * <p>
     * Visits the expression and stores the symbol
     */
    @Override
    public DataType visitAssigment(ParlementParser.AssigmentContext ctx)
    {
        Symbol s = hashList.get(ctx.IDENTIFIER().getText());

        visit(ctx.expression());

        return storeSymbol(s);
    }

    /**
     * Declares a variable
     * <p>
     * When a variable is declared it gets stored as a symbol.
     * If the declaration also includes an assignment
     * the variable gets data assigned to it and the symbol gets updated
     */
    @Override
    public DataType visitDeclaration(ParlementParser.DeclarationContext ctx)
    {
        Symbol s;

        if (ctx.T_INT() != null)
        {
            s = new Symbol(ctx.IDENTIFIER().getText(), DataType.INT);
        }
        else if (ctx.T_STRING() != null)
        {
            s = new Symbol(ctx.IDENTIFIER().getText(), DataType.STRING);
        }
        else if (ctx.T_BOOLEAN() != null)
        {
            s = new Symbol(ctx.IDENTIFIER().getText(), DataType.BOOLEAN);
        }
        else
        {
            return null;
        }

        hashList.put(s.getName(), s);

        if (ctx.val != null)
        {

            visit(ctx.val);

            return storeSymbol(s);
        }

        return null;
    }

    /**
     * Starts a loop which repeats itself X times
     *
     * Uses goto and labels to jump to different pieces of the code
     * Also decrements a counter
     */
    @Override
    public DataType visitLoop(ParlementParser.LoopContext ctx)
    {

        int loopNumber = loopCounter++;

        DataType d = visit(ctx.times); // Get amount of times it should loop (E.G. 10)

        assert d == DataType.INT; // Make sure it's an int...

        jasminCode.add("loop" + loopNumber + ":"); // Start loop

        jasminCode.add("ldc 1"); // Add 1 so we can subtract it later (should be 10 - 1)

        jasminCode.add("isub"); // Subtract (E.G. 9)

        jasminCode.add("dup");

        jasminCode.add("ldc 0"); // Counter should be greater than 0

        jasminCode.add("if_icmplt endloop" + loopNumber); // Is greater than 0? (E.G. 9 > 0). if not end loop

        for (ParlementParser.StatementContext s : ctx.statement())
        {
            visit(s); // Execute loop content
        }

        jasminCode.add("goto loop" + loopNumber); // Go to beginning of loop

        jasminCode.add("endloop" + loopNumber + ":"); // End loop

        return null;

    }

    /**
     * Skips an ifBlock if expression evaluates to false
     */
    @Override
    public DataType visitIfStmt(ParlementParser.IfStmtContext ctx)
    {
        boolean hasElse = ctx.ifFalse != null;

        int id = ifCounter++;                     // ID for this if statement

        visit(ctx.expression());                  // Run expression

        if (!hasElse)
        {
            jasminCode.add("ifeq endif" + id);          // If expression evaluates to false then end the if statement by going to the end label.
            visit(ctx.ifTrue);                          // If true, visit the if block
        } else {
            jasminCode.add("ifeq else" + id);           // If expression evaluates to false then go to the else statement
            visit(ctx.ifTrue);                          // If true, visit the if block
            jasminCode.add("goto endif" + id);    // Expression evaluated to true and code has been executed. Don't execute else block by going to the end.

            jasminCode.add("else" + id + ":");          // Else statement
            visit(ctx.ifFalse);                         // Visit else block.
        }

        jasminCode.add("endif" + id + ":");             // endifX label: indicates the end of the if/else statement

        return null;
    }

    /**
     * Loops over all statements in the ifBlock
     */
    @Override
    public DataType visitIfBlock(ParlementParser.IfBlockContext ctx)
    {

        // Could be multiple statements so loop through them all
        for (ParlementParser.StatementContext s
                : ctx.statement())
        {
            visit(s);  // Execute loop content
        }

        return null;
    }

    @Override
    public DataType visitExEqualOp(ParlementParser.ExEqualOpContext ctx)
    {
        int equalNumber = eqCounter++;

        jasminCode.add("");
        jasminCode.add("; Equal comparison #" + equalNumber);

        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("if_icmpeq eq" + equalNumber + "IsTrue");     // If equal jump to eqXIsTrue
        jasminCode.add("ldc 0");                                        // Not equal, so return 0
        jasminCode.add("goto endeq" + equalNumber);                     // End the comparison

        jasminCode.add("eq" + equalNumber + "IsTrue:");              // eqXIsTrue: If statement is true then we end here.
        jasminCode.add("ldc 1");                                        // Equal so return 1

        jasminCode.add("endeq" + equalNumber + ":");                    // End comparison

        jasminCode.add("");

        return DataType.INT;
    }

    @Override
    public DataType visitExGreaterThanOp(ParlementParser.ExGreaterThanOpContext ctx)
    {

        int equalNumber = eqCounter++;

        jasminCode.add("");
        jasminCode.add("; greaterThan comparison #" + equalNumber);

        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("if_icmpgt greaterThan" + equalNumber + "IsTrue");        // If equal jump to eqXIsTrue
        jasminCode.add("ldc 0");                                                 // Not equal, so return 0
        jasminCode.add("goto endGreaterThan" + equalNumber);                     // End the comparison

        jasminCode.add("greaterThan" + equalNumber + "IsTrue:");                 // eqXIsTrue: If statement is true then we end here.
        jasminCode.add("ldc 1");                                                 // Equal so return 1

        jasminCode.add("endGreaterThan" + equalNumber + ":");                    // End comparison

        jasminCode.add("");

        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitExLessThanOp(ParlementParser.ExLessThanOpContext ctx)
    {

        int equalNumber = eqCounter++;

        jasminCode.add("");
        jasminCode.add("; lessThan comparison #" + equalNumber);

        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("if_icmplt lessThan" + equalNumber + "IsTrue");              // If less than jump to lessThanXIsTrue
        jasminCode.add("ldc 0");                                                    // greater than, so return 0
        jasminCode.add("goto endLessThan" + equalNumber);                           // End the comparison

        jasminCode.add("lessThan" + equalNumber + "IsTrue:");                       // lessThanXIsTrue: If statement is true then we end here.
        jasminCode.add("ldc 1");                                                    // less than so return 1

        jasminCode.add("endLessThan" + equalNumber + ":");                          // End comparison

        jasminCode.add("");

        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitExNotEqualOp(ParlementParser.ExNotEqualOpContext ctx)
    {
        int equalNumber = eqCounter++;

        jasminCode.add("");
        jasminCode.add("; Not Equal comparison #" + equalNumber);

        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("if_icmpne notEq" + equalNumber + "IsTrue");         // If equal jump to eqXIsTrue
        jasminCode.add("ldc 0");                                            // Equal, so return 0
        jasminCode.add("goto endNotEq" + equalNumber);                      // End the comparison

        jasminCode.add("notEq" + equalNumber + "IsTrue:");                  // notEqXIsTrue: If statement is true then we end here.
        jasminCode.add("ldc 1");                                            // Not equal so return 1

        jasminCode.add("endNotEq" + equalNumber + ":");                     // End comparison

        jasminCode.add("");

        return DataType.BOOLEAN;
    }

    /**
     * Uses a bitwise OR operator to compare the two expressions.
     *
     * This means if a bit equals 1 and the other one does not, the expression would still evaluate true
     *
     * E.G.
     * 1011100
     * 1111111
     * -------
     * 1111111
     */
    @Override
    public DataType visitExOrOp(ParlementParser.ExOrOpContext ctx)
    {
        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("ior");           // bitwise int OR (thanks c++ education)

        return DataType.BOOLEAN;
    }

    /**
     * Uses a bitwise AND operator to compare the two expressions.
     *
     * This means if a bit equals 1 and the other one does not, the expression would not evaluate true
     *
     * E.G.
     * 1011100
     * 1111111
     * -------
     * 1011100
     */
    @Override
    public DataType visitExAndOp(ParlementParser.ExAndOpContext ctx)
    {
        visit(ctx.left);
        visit(ctx.right);

        jasminCode.add("iand");         // bitwise int AND operator  (thanks c++ education)

        return DataType.BOOLEAN;
    }

    /**
     * Added to ignore the function call because it's being handled in MethodGenerator
     */
    @Override
    public DataType visitFunction(ParlementParser.FunctionContext ctx)
    {
        return null;
    }

    /**
     * Invokes a function by name
     */
    @Override
    public DataType visitInvokeFunction(ParlementParser.InvokeFunctionContext ctx)
    {

        jasminCode.add("invokestatic " + this.className + "/" + ctx.name.getText() + "()V");

        return null;
    }

    /**
     * Get's the associated variable and pushes it to the stack
     */
    @Override
    public DataType visitExIdentifier(ParlementParser.ExIdentifierContext ctx)
    {
        Symbol s = hashList.get(ctx.IDENTIFIER().getText());

        return loadSymbol(s);
    }

    /**
     * Pushes an integer to the stack
     */
    @Override
    public DataType visitExIntLiteral(ParlementParser.ExIntLiteralContext ctx)
    {
        jasminCode.add("ldc " + ctx.getText());

        return DataType.INT;
    }

    /**
     * Pushes a boolean to the stack
     */
    @Override
    public DataType visitExBoolLiteral(ParlementParser.ExBoolLiteralContext ctx)
    {
        if (ctx.getText().equals("true"))
        {
            jasminCode.add("ldc 1");
        }
        else
        {
            jasminCode.add("ldc 0");
        }

        return DataType.BOOLEAN;
    }

    /**
     * Pushes a string to the stack
     */
    @Override
    public DataType visitExStrLiteral(ParlementParser.ExStrLiteralContext ctx)
    {
        jasminCode.add("ldc " + ctx.STRING().getText());

        return DataType.STRING;
    }

    /**
     * Multiplies two variables
     */
    @Override
    public DataType visitExMulOp(ParlementParser.ExMulOpContext ctx)
    {
        visit(ctx.left);
        visit(ctx.right);
        jasminCode.add("imul");

        return DataType.INT;
    }

    /**
     * Adds two variables
     */
    @Override
    public DataType visitExAddOp(ParlementParser.ExAddOpContext ctx)
    {
        // Get first variable
        DataType a = visit(ctx.left);

        // Get second variable
        DataType b = visit(ctx.right);

        if (a != b)
            return null;

        if (a != DataType.INT)
            return null;

        jasminCode.add("iadd");

        return DataType.INT;
    }

    /**
     * Subtracts two variables
     */
    @Override
    public DataType visitExSubOp(ParlementParser.ExSubOpContext ctx)
    {
        // Get first variable
        visit(ctx.left);

        // Get second variable
        visit(ctx.right);

        jasminCode.add("isub");

        return null;
    }

    /**
     * Divides two variables
     */
    @Override
    public DataType visitExDivOp(ParlementParser.ExDivOpContext ctx)
    {
        // Get first variable
        visit(ctx.left);

        // Get second variable
        visit(ctx.right);

        jasminCode.add("idiv");

        return DataType.INT;
    }
}

