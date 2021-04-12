package nl.saxion.cos.joramsjamaar;

import nl.saxion.cos.joramsjamaar.model.Symbol;

import java.util.HashMap;

public class Checker extends ParlementBaseVisitor<DataType>
{

    private HashMap<String, Symbol> symbols = new HashMap<>();

    @Override
    public DataType visitDeclaration(ParlementParser.DeclarationContext ctx)
    {

        String identifier = ctx.IDENTIFIER().getText();

        if (symbols.get(identifier) != null)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Variable '%s' already declared",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    identifier
                )
            );

        Symbol s;

        if (ctx.T_INT() != null)
        {
            s = new Symbol(identifier, DataType.INT);
        }
        else if (ctx.T_BOOLEAN() != null)
        {
            s = new Symbol(identifier, DataType.BOOLEAN);
        }
        else if (ctx.T_STRING() != null)
        {
            s = new Symbol(identifier, DataType.STRING);
        }
        else {
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Couldn't define DataType for '%s'",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    identifier
                )
            );
        }

        if (ctx.val != null)
        {
            s.setUsed(true);
        }

        symbols.put( identifier, s );

        return s.getType();
    }

    @Override
    public DataType visitExIdentifier(ParlementParser.ExIdentifierContext ctx)
    {
        String identifier = ctx.IDENTIFIER().getText();
        Symbol s = symbols.get(identifier);

        if (s == null) {
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Variable '%s' is not declared",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    identifier
                )
            );
        }

        if (!s.isUsed()) {
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Variable '%s' is not assigned",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    identifier
                )
            );
        }

        return s.getType();
    }


    @Override
    public DataType visitIdentifiers(ParlementParser.IdentifiersContext ctx)
    {

        for (ParlementParser.FunctionIdentifierContext f : ctx.functionIdentifier())
        {
            visit(f);
        }

        return super.visitIdentifiers(ctx);
    }

    @Override
    public DataType visitFunctionIdentifier(ParlementParser.FunctionIdentifierContext ctx)
    {
//        ctx.T_BOOLEAN()

        return super.visitFunctionIdentifier(ctx);
    }

    @Override
    public DataType visitArguments(ParlementParser.ArgumentsContext ctx)
    {
        for (ParlementParser.ExpressionContext e : ctx.expression()) {
            visit(e);
        }

        return null;
    }

    @Override
    public DataType visitLoop(ParlementParser.LoopContext ctx)
    {
        if (visit(ctx.times) != DataType.INT)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Invalid loop times expression. Expression should evaluate to integer to indicate number of times to loop.",
                    ctx.times.getStart().getLine(),
                    ctx.times.getStart().getCharPositionInLine()
                )
            );

        return null;
    }

    @Override
    public DataType visitExStrLiteral(ParlementParser.ExStrLiteralContext ctx)
    {
        return DataType.STRING;
    }

    @Override
    public DataType visitExBoolLiteral(ParlementParser.ExBoolLiteralContext ctx)
    {
        return DataType.BOOLEAN;
    }

    @Override
    public DataType visitExIntLiteral(ParlementParser.ExIntLiteralContext ctx)
    {
        return DataType.INT;
    }

    @Override
    public DataType visitExDivOp(ParlementParser.ExDivOpContext ctx)
    {

        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.STRING  || right == DataType.STRING)
            throw new CompilerException(
                String.format(
                    "Error on line %d: Types do not match",
                    ctx.getStart().getLine()
                )
            );

        if (!left.equals(right))
            throw new CompilerException(
                String.format(
                    "Error on line %d: Cannot divide string",
                    ctx.getStart().getLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExMulOp(ParlementParser.ExMulOpContext ctx)
    {

        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.STRING  || right == DataType.STRING)
            throw new CompilerException(
                String.format(
                    "Error on line %d: Types do not match",
                    ctx.getStart().getLine()
                )
            );

        if (!left.equals(right))
            throw new CompilerException(
                String.format(
                    "Error on line %d: Cannot multiply string",
                    ctx.getStart().getLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExSubOp(ParlementParser.ExSubOpContext ctx)
    {DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.STRING  || right == DataType.STRING)
            throw new CompilerException(
                String.format(
                    "Error on line %d: Types do not match",
                    ctx.getStart().getLine()
                )
            );

        if (!left.equals(right))
            throw new CompilerException(
                String.format(
                    "Error on line %d: Cannot subtract string",
                    ctx.getStart().getLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExAddOp(ParlementParser.ExAddOpContext ctx)
    {

        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left == DataType.STRING  || right == DataType.STRING)
            throw new CompilerException(
                String.format(
                    "Error on line %d: Types do not match",
                    ctx.getStart().getLine()
                )
            );

        if (!left.equals(right))
            throw new CompilerException(
                String.format(
                    "Error on line %d: Cannot add string",
                    ctx.getStart().getLine()
                )
            );

        return visit(ctx.left);
    }
}
