package nl.saxion.cos.joramsjamaar;

public class MethodGenerator extends ParlementBaseVisitor<Void>
{

    private JasminBytecode jasminCode;
    private CodeGenerator codeGenerator;

    public MethodGenerator(JasminBytecode jasminBytecode, CodeGenerator codeGenerator)
    {
        this.jasminCode = jasminBytecode;
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visitFunction(ParlementParser.FunctionContext ctx)
    {
        jasminCode.add(".method public static " + ctx.IDENTIFIER().getText() + "()V");

        jasminCode.add(".limit stack 99");
        jasminCode.add(".limit locals 99");  // NOTE: The args-parameter is a local too
        jasminCode.add("");

        for (ParlementParser.StatementContext s : ctx.statement())
        {
            codeGenerator.visit(s);
        }

        jasminCode.add("return");
        jasminCode.add(".end method");

        return null;
    }
}
