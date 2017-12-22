/*
 * time: o(n)
 */

import java.util.*;
import static java.lang.Math.*;

public class Solution {

	static int likes = 0;
	
	/* doesn't work...
	public static int recursiveAdLikes(int n){
		
		if (n == 1){
			return 2;
		}
		else{
			return (int) floor(recursiveAdLikes(n-1)*3/2);
		}
			
		
	}
	*/
	
	public static int adLikes(int n){
		int likes = 0;
		int seed = 5;
		
		
		for (int i = 0; i < n; i++){
			likes += floor(seed/2);
			seed = (int)floor(seed/2)*3;
		}
		
		return likes;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		System.out.println(adLikes(n));	
	}

}
