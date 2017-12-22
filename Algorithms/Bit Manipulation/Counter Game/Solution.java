//Algorithms/Bit Manipulation/Counter Game

import java.util.Scanner;

public class Solution {

    private static boolean isPwrOfTwo(long l){
        return l != 0 && ((l&(l-1)) == 0);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();


        boolean isLouise = false;

        for (int i = 0; i < t; i++){
            isLouise = false;
            long n = in.nextLong();
            while (Long.compareUnsigned(n, 1) > 0){
                if (isPwrOfTwo(n)){
                    // if n is a power of 2, reduce by half
                    n = n>>>1;
                    isLouise ^= true;

                }
                else{
                    // if n is not power of 2, reduce by largest power of 2 less than N
                    // remove most significant 1
                    // int shift = Long.SIZE - Long.numberOfLeadingZeros(n) - 1;
                    // System.out.println(Integer.toBinaryString(~(1 << shift)));
                    // n = n & ~(1 << shift);
                    n = n - Long.highestOneBit(n);
                    isLouise ^= true;
                }

            }
            System.out.println(isLouise? "Louise" : "Richard");
        }
        in.close();

    }
}