package nl.saxion.cos.joramsjamaar;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Examples
{

    @Test
    void example1() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example1.p", "exampleOne");

        if (code != null) {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            assertArrayEquals(new String[]{
                    "Hello World!"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

    @Test
    void example2() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example2.p", "exampleTwo");


        if (code != null)
        {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            assertArrayEquals(new String[]{
                    "Hello World!"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

    @Test
    void example3() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example3.p", "exampleThree");


        if (code != null)
        {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            assertArrayEquals(new String[]{
                    "Hello World!",
                    "Hello World!",
                    "Hello World!",
                    "Hello World!",
                    "Hello World!"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

    @Test
    void example4() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example4.p", "exampleFour");


        if (code != null)
        {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            assertArrayEquals(new String[]{
                "1",
                "2",
                "3",
                "4",
                "5"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

    @Test
    void example5() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example5.p", "exampleFive");

        if (code != null)
        {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            for (String wafa : output)
                System.out.println(wafa);

            assertArrayEquals(new String[]{
                "1",
                "1",
                "1",
                "1",
                "1"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

    @Test
    void example6() throws Exception
    {
        Compiler c = new Compiler();
        JasminBytecode code = c.compileFile("exampleFiles/example6.p", "exampleSix");

        if (code != null)
        {
            AssembledClass aClass = AssembledClass.assemble(code);

            SandBox s = new SandBox();
            s.runClass(aClass);
            List<String> output = s.getOutput();

            for (String wafa : output)
                System.out.println(wafa);

            assertArrayEquals(new String[]{
                    "1",
                    "1",
                    "1",
                    "1",
                    "1"
            }, output.toArray());
        }
        else
        {
            fail("No code generated");
        }
    }

}
