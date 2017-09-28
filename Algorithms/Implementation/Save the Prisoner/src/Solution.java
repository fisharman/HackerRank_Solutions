/*
 * The first S - 1 sets the index of prisoner to start at 0 instead of 1. % operator will have 0 in the answer.
 * m - 1 covers that person with index m will get the candy
 * +1 returns the result to original ID
 */

import java.util.*;

public class Solution {

    static int saveThePrisoner(int n, int m, int s){   
    	return ((s-1)+(m-1))%n+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }
        in.close();
    }
}
