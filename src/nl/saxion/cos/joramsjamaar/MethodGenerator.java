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
    return null;
    }

}
