import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void solve (int m, List<Integer> cream){
        // create a sorted list of ice cream prices
        // start from unsorted list, pick first element and search for a match
        // if no match start with next element
        List<Integer> unsortedCream = new ArrayList<Integer>(cream);
        Collections.sort(cream);

        for (int i = 0; i < cream.size(); i++){
            int key = m - unsortedCream.get(i);
            int position = Collections.binarySearch(cream, key);
            if (position > 0){
                // search for index

                int j = 0;
                for (int element : unsortedCream){
                    if (i != j && key == element)
                        break;
                    j++;
                }


                if (i < j) {
                    System.out.print(i + 1 + " ");
                    System.out.println(j + 1);
                }
                else{
                    System.out.print(j + 1 + " ");
                    System.out.println(i + 1);
                }


                break;
            }
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of tests

        for (int i = 0; i < t; i++){
            int m = in.nextInt(); // money pool
            int n = in.nextInt(); // flavors
            List<Integer> cream = new ArrayList<>();
            for (int j = 0; j < n; j++){
                cream.add(in.nextInt());
            }
            solve(m, cream);
        }

    }
}
