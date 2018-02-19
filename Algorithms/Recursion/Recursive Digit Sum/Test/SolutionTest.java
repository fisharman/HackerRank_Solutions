import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    String input8, input9;

    @Before
    public void readFile() throws Exception{
        input8 = new Scanner(new File("test/Res/input08.txt")).useDelimiter("\\Z").next();
        input9 = new Scanner(new File("test/Res/input09.txt")).useDelimiter("\\Z").next();
        // System.out.println(content);
    }

    @Test
    public void testInput8(){
        String[] input = input8.split(" ");
        assertEquals(Solution.superDigit(input[0],Integer.parseInt(input[1])), 4);
    }

    @Test
    public void testInput9(){
        String[] input = input9.split(" ");
        assertEquals(Solution.superDigit(input[0],Integer.parseInt(input[1])), 9);
    }

    @Test
    public void testK3(){

        assertEquals(Solution.superDigit("148",3), 3);
    }

    @Test
    public void testK1(){
        assertEquals(Solution.superDigit("9875",1), 2);
    }

}
