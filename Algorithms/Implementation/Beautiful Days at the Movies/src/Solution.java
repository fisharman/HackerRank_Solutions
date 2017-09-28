/*
 * time: o(n log n) number gets smaller by 10 every iteration
 */

import java.io.*;
import java.util.*;

public class Solution {

	// iterative way. how to do with recursion?
	public static int reversed(int n){
		int reverseNum = 0;
		while (n != 0){
			reverseNum = reverseNum*10;
			reverseNum = reverseNum+n%10;
			n = n/10;
		}
		
		return reverseNum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		int k = in.nextInt();
		int beautiful = 0;
		
		in.close();
		for (int s = i; s <= j; s++){
			if (Math.abs(s - reversed(s))%k == 0)
				beautiful++;
		}
		System.out.println(beautiful);
		
	}

}
