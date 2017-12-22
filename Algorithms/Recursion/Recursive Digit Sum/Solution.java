//Algorithms/Recursion/The Power Sum

import java.util.Scanner;

public class Solution {


    private static int superDigit(int n, int k){
        //return single digit
        return 1;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // integer to be expressed
        int k = in.nextInt(); // power for expression
        in.close();

        superDigit(n, k);
        // System.out.println(findUnique(x,n,1));

    }
}