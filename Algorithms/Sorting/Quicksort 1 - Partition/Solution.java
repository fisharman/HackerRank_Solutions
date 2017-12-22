import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void partition(int[] ar){
        // take first element
        // sort rest into left and right
        // print them in a single line

        List<Integer> equal = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        int midElement = ar[0];
        equal.add(ar[0]);

        for (int i = 1; i < ar.length; i++){
            if (ar[i] > midElement){
                // place right
                right.add(ar[i]);
            }
            else if (ar[i] < midElement){
                // place left
                left.add(ar[i]);
            }
            else{
                // place middle
                equal.add(ar[i]);
            }
        }

        for (Integer i : left){
            System.out.print(i + " ");
        }

        for (Integer i : equal){
            System.out.print(i + " ");
        }

        for (Integer i : right){
            System.out.print(i + " ");
        }

        System.out.println("");



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        in.close();

        partition(ar);
    }

}
