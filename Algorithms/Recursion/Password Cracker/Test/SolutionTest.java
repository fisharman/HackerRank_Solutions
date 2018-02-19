import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class SolutionTest {


    private ArrayList<Set<String>> pwList = new ArrayList<>();
    private ArrayList<String> loginAttempt = new ArrayList<>();

    @Before
    public void readFile() throws Exception{
        String input02 = new Scanner(new File("test/Res/input02.txt")).useDelimiter("\\Z").next();

        Scanner in = new Scanner (input02);
        int t = in.nextInt();

        for (int i = 0; i < t; i++){
            int n = in.nextInt();
            Set<String> pwSet = new HashSet<>(n);

            for (int j = 0; j < n; j++){
                pwSet.add(in.next());
            }
            pwList.add(pwSet);
            in.nextLine();
            String attempt = in.nextLine();
            loginAttempt.add(attempt);

        }
        // System.out.println(input02);
    }

    @Test
    public void testInput8(){
            int i = 0;

            assertFalse(Solution.solve(pwList.get(i), loginAttempt.get(i++), new StringBuilder(), new HashMap<String, Boolean>()));
            assertTrue(Solution.solve(pwList.get(i), loginAttempt.get(i++), new StringBuilder(), new HashMap<String, Boolean>()));
            assertTrue(Solution.solve(pwList.get(i), loginAttempt.get(i++), new StringBuilder(), new HashMap<String, Boolean>()));
            assertFalse(Solution.solve(pwList.get(i), loginAttempt.get(i), new StringBuilder(), new HashMap<String, Boolean>()));
    }


}
