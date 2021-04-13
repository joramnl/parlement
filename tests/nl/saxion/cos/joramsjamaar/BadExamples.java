package nl.saxion.cos.joramsjamaar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadExamples
{

    @Test
    void badExample1()
    {
        assertThrows(AssembleException.class, () -> {
            Compiler c = new Compiler();
            JasminBytecode code = c.compileFile("badExampleFiles/badExample1.p", "badExampleOne");
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
        });
    }

    @Test
    void badExample2()
    {
        assertThrows(AssembleException.class, () -> {
            Compiler c = new Compiler();
            JasminBytecode code = c.compileFile("badExampleFiles/badExample2.p", "badExampleTwo");
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
        });
    }

    @Test
    void badExample3()
    {
        assertThrows(AssembleException.class, () -> {
            Compiler c = new Compiler();
            JasminBytecode code = c.compileFile("badExampleFiles/badExample3.p", "badExampleThree");
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
        });
    }

    @Test
    void badExample4()
    {
        assertThrows(AssembleException.class, () -> {
            Compiler c = new Compiler();
            JasminBytecode code = c.compileFile("badExampleFiles/badExample4.p", "badExampleFour");
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
        });
    }

    @Test
    void badExample5()
    {
        assertThrows(AssembleException.class, () -> {
            Compiler c = new Compiler();
            JasminBytecode code = c.compileFile("badExampleFiles/badExample5.p", "badExampleFive");
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
        });
    }

}
