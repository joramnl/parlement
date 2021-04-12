package nl.saxion.cos.joramsjamaar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompilerTest
{

    @Test
    void loopCountToTen() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testLoopFunction.p", "testLoopFunction");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "10"
        }, output.toArray());
    }

    @Test
    void printStatement() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testPrintStatement.p", "testPrintStatement");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Yay! It works!"
        }, output.toArray());
    }

    @Test
    void ifStatement() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testIfStatement.p", "testIfStatement");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Success! I am true!"
        }, output.toArray());
    }

    @Test
    void andIfStatement() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testAndIfStatement.p", "testAndIfStatement");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Success! I am true!"
        }, output.toArray());
    }

    @Test
    void orIfStatement() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testOrIfStatement.p", "testOrIfStatement");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Success! I am true!"
        }, output.toArray());
    }

    @Test
    void test() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileString("WILLIE WIL JE DIT OPLEZEN ALSJEBLIEFT 1 / \"test\"", "testOrIfStatement");

        if (code != null) {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            assertArrayEquals(new String[]{
                    "Success! I am true!"
            }, output.toArray());
        }
    }

    @Test
    void calculationOrder() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testCalculationOrder.p", "testCalculationOrder");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "23"
        }, output.toArray());
    }

    @Test
    void functionCallable() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("testFiles/testFunction.p", "testFunction");
        AssembledClass aClass = AssembledClass.assemble(code);

        SandBox s = new SandBox();
        s.runClass(aClass);
        List<String> output = s.getOutput();

        assertArrayEquals(new String[]{
                "Hello World!"
        }, output.toArray());
    }

}
