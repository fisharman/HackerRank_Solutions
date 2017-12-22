//Algorithms/Recursion/The Power Sum

import java.util.Scanner;

public class Solution {


    private static int findUnique(int x, int n, int num){
        if (Math.pow(num,n) < x){
            return findUnique(x, n, num + 1) + findUnique(x - (int)Math.pow(num,n), n, num + 1);
        }
        else if (Math.pow(num,n) == x){
            return 1;
        }
        else{
            return 0;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); // integer to be expressed
        int n = in.nextInt(); // power for expression
        in.close();

        System.out.println(findUnique(x,n,1));

    }
}