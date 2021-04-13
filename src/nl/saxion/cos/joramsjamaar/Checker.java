package nl.saxion.cos.joramsjamaar;

import nl.saxion.cos.joramsjamaar.model.DataType;
import nl.saxion.cos.joramsjamaar.model.Scope;
import nl.saxion.cos.joramsjamaar.model.Symbol;

public class Checker extends ParlementBaseVisitor<DataType>
{

    private Scope scope = new Scope();

    @Override
    public DataType visitDeclaration(ParlementParser.DeclarationContext ctx)
    {

        String identifier = ctx.IDENTIFIER().getText();

        if (scope.get(identifier) != null)
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
            DataType d = visit(ctx.val);

            if (!d.equals(s.getType())) {
                throw new CompilerException(
                    String.format(
                        "Line %d:%d: Trying to assign different datatype to variable '%s'.",
                        ctx.getStart().getLine(),
                        ctx.getStart().getCharPositionInLine(),
                        identifier
                    )
                );
            }

            s.setUsed(true);
        }

        scope.add( identifier, s );

        return s.getType();
    }

    @Override
    public DataType visitExGreaterThanOp(ParlementParser.ExGreaterThanOpContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: DataTypes must be of type int to compare",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExLessThanOp(ParlementParser.ExLessThanOpContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: DataTypes must be of type int to compare",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExIdentifier(ParlementParser.ExIdentifierContext ctx)
    {
        String identifier = ctx.IDENTIFIER().getText();
        Symbol s = scope.get(identifier);

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
    public DataType visitAssigment(ParlementParser.AssigmentContext ctx)
    {
        String identifier = ctx.IDENTIFIER().getText();
        Symbol s = scope.get(identifier);

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

        DataType d = visit(ctx.expression());

        if (!d.equals(s.getType())) {
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Trying to assign different datatype to variable '%s'.",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine(),
                    identifier
                )
            );
        }

        return super.visitAssigment(ctx);
    }

    @Override
    public DataType visitLoop(ParlementParser.LoopContext ctx)
    {
        this.scope = scope.newScope();

        if (visit(ctx.times) != DataType.INT)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: Invalid loop times expression. Expression should evaluate to integer to indicate number of times to loop.",
                    ctx.times.getStart().getLine(),
                    ctx.times.getStart().getCharPositionInLine()
                )
            );

        this.scope = scope.getParentScope();

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

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                String.format(
                    "Line %d:%d: DataTypes must be of type int to compare",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
                )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExMulOp(ParlementParser.ExMulOpContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                    String.format(
                            "Line %d:%d: DataTypes must be of type int to compare",
                            ctx.getStart().getLine(),
                            ctx.getStart().getCharPositionInLine()
                    )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExSubOp(ParlementParser.ExSubOpContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                    String.format(
                            "Line %d:%d: DataTypes must be of type int to compare",
                            ctx.getStart().getLine(),
                            ctx.getStart().getCharPositionInLine()
                    )
            );

        return visit(ctx.left);
    }

    @Override
    public DataType visitExAddOp(ParlementParser.ExAddOpContext ctx)
    {
        DataType left = visit(ctx.left);
        DataType right = visit(ctx.right);

        if (left != DataType.INT  || right != DataType.INT)
            throw new CompilerException(
                    String.format(
                            "Line %d:%d: DataTypes must be of type int to compare",
                            ctx.getStart().getLine(),
                            ctx.getStart().getCharPositionInLine()
                    )
            );

        return visit(ctx.left);
    }
}
