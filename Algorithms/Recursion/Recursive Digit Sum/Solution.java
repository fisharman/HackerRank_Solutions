//Algorithms/Recursion/The Power Sum

import java.util.Scanner;

public class Solution {


    public static int superDigit(String n, int k){
        // if input has only one digit, then return that digit
        // if input has more than one digits, add them up digit by digit and call the method again

        if (n.length() == 1)
            return Integer.parseInt(n);

        long total = 0;

        for (int i = 0; i < n.length(); i++){
            total += Character.getNumericValue(n.charAt(i))*k;
        }

        return superDigit(String.valueOf(total), 1);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int k = in.nextInt();
        in.close();

        System.out.println(superDigit(n, k));

    }
}