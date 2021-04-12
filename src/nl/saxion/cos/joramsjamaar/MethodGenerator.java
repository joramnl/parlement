package nl.saxion.cos.joramsjamaar;

public class MethodGenerator extends ParlementBaseVisitor<Void>
{

    private JasminBytecode jasminBytecode;
    private CodeGenerator codeGenerator;

    public MethodGenerator(JasminBytecode jasminBytecode, CodeGenerator codeGenerator)
    {
        this.jasminBytecode = jasminBytecode;
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visitFunction(ParlementParser.FunctionContext ctx)
    {
        jasminBytecode.add(".method public static " + ctx.IDENTIFIER().getText() + "()V");

        jasminBytecode.add(".limit stack 99");
        jasminBytecode.add(".limit locals 99");  // NOTE: The args-parameter is a local too
        jasminBytecode.add("");

        for (ParlementParser.StatementContext s : ctx.statement())
        {
            codeGenerator.visit(s);
        }

        jasminBytecode.add("return");
        jasminBytecode.add(".end method");

        return null;
    }

}
