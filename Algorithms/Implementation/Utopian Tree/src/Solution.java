/*
 * time: o(1)
 */

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		//int t = 3;
		//int[] temp = {0,1,4};
		for (int i = 0; i < t; i++){
			int n = in.nextInt();
			int shift = (n + n%2)/2;
								
			System.out.println(~((~1) << shift)-n%2);
			// >> 2 divide the cycle by 2 to figure out the number of years. if cycle is odd, shift 0 onto the end
			// System.out.println(~(~1 << (n >> 2)) << n%2);
			
		}
		in.close();
	}

}
