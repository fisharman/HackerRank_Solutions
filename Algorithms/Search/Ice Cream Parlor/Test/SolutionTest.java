import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private ArrayList<String> inputList = new ArrayList<>();
    private ArrayList<String> outputList = new ArrayList<>();


    @Before
    public void readFile() throws Exception{
        System.setOut(new PrintStream(outContent));
        String[] inputFiles = {"input01", "input02"};
        String[] outputFiles = {"output01", "output02"};

        for (int i = 0; i < inputFiles.length; i++){
            // ArrayList<Integer> operands = new ArrayList<>();
            String input = new Scanner(new File("test/Res/" + inputFiles[i] +".txt")).useDelimiter("\\Z").next();
            inputList.add(input);


            String output = new Scanner(new File("test/Res/" + outputFiles[i] +".txt")).useDelimiter("\\Z").next();
            outputList.add(output);
        }

        // System.out.println(operandsList.get(0));
        // System.out.println(outputList.get(0));

    }

    @Test
    public void testInput01(){

        Scanner in = new Scanner (inputList.get(0));
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int m = in.nextInt(); // money pool
            int n = in.nextInt(); // flavors
            List<Integer> cream = new ArrayList<>();
            for (int j = 0; j < n; j++){
                cream.add(in.nextInt());
            }
            Solution.solve(m, cream);
        }
        assertEquals(outputList.get(0), outContent.toString().trim());

    }

    @Test
    public void testInput02(){

        Scanner in = new Scanner (inputList.get(1));
        int t = in.nextInt();
        for (int i = 0; i < t; i++){
            int m = in.nextInt(); // money pool
            int n = in.nextInt(); // flavors

            List<Integer> cream = new ArrayList<>();
            for (int j = 0; j < n; j++){
                cream.add(in.nextInt());
            }
            Solution.solve(m, cream);
        }
        assertEquals(outputList.get(1), outContent.toString().trim());
    }


}
