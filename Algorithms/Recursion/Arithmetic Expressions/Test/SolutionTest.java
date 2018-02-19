import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SolutionTest {


    private ArrayList<ArrayList<Integer>> operandsList = new ArrayList<>();
    private ArrayList<String> outputList = new ArrayList<>();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void readFile() throws Exception{
        System.setOut(new PrintStream(outContent));
        String[] inputFiles = {"input24", "input25", "input26", "input29", "input30"};
        String[] outputFiles = {"output24", "output25", "output26", "output29", "output30"};

        for (int i = 0; i < inputFiles.length; i++){
            ArrayList<Integer> operands = new ArrayList<>();
            String input = new Scanner(new File("test/Res/" + inputFiles[i] +".txt")).useDelimiter("\\Z").next();
            Scanner in = new Scanner (input);

            int n = in.nextInt();
            for (int j = 0; j < n; j++){
                operands.add(in.nextInt());
            }
            operandsList.add(operands);

            String output = new Scanner(new File("test/Res/" + outputFiles[i] +".txt")).useDelimiter("\\Z").next();
            outputList.add(output);
        }

        // System.out.println(operandsList.get(0));
        // System.out.println(outputList.get(0));

    }

    @Test
    public void testInput24(){


        Solution.solve(operandsList.get(0), 1, operandsList.get(0).get(0), new StringBuilder("" + operandsList.get(0).get(0)), new boolean[2*101][operandsList.get(0).size()]);
        assertEquals(outputList.get(0), outContent.toString().trim());
    }

    @Test
    public void testInput25(){

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();

        Solution.solve(operandsList.get(1), 1, operandsList.get(1).get(0), new StringBuilder("" + operandsList.get(1).get(0)), new boolean[2*101][operandsList.get(1).size()]);
        assertEquals(outputList.get(1), outContent.toString().trim());
    }

    @Test
    public void testInput26(){

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();

        Solution.solve(operandsList.get(2), 1, operandsList.get(2).get(0), new StringBuilder("" + operandsList.get(2).get(0)), new boolean[2*101][operandsList.get(2).size()]);
        assertEquals(outputList.get(2), outContent.toString().trim());
    }

    @Test
    public void testInput29(){

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();

        Solution.solve(operandsList.get(3), 1, operandsList.get(3).get(0), new StringBuilder("" + operandsList.get(3).get(0)), new boolean[2*101][operandsList.get(3).size()]);
        assertEquals(outputList.get(3), outContent.toString().trim());
    }

    @Test
    public void testInput30(){

        ByteArrayOutputStream outSpy = new ByteArrayOutputStream();

        Solution.solve(operandsList.get(4), 1, operandsList.get(4).get(0), new StringBuilder("" + operandsList.get(4).get(0)), new boolean[2*101][operandsList.get(4).size()]);
        assertEquals(outputList.get(4), outContent.toString().trim());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


}
