/*
 * Time: O(1). General case O(n) as need to iterate through all elements
 * Space: O(1). 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

	
	// make arrays with all possible variations of
	
	public static int lowestCost(int[][] s){
		int min = Integer.MAX_VALUE;
		
		List<Integer[][]> index = new ArrayList<>(8);
		index.add(new Integer[][]{{4,9,2},{3,5,7},{8,1,6}});
		index.add(new Integer[][]{{2,7,6},{9,5,1},{4,3,8}});
		index.add(new Integer[][]{{6,1,8},{7,5,3},{2,9,4}});
		index.add(new Integer[][]{{8,3,4},{1,5,9},{6,7,2}});
		index.add(new Integer[][]{{8,1,6},{3,5,7},{4,9,2}});
		index.add(new Integer[][]{{2,9,4},{7,5,3},{6,1,8}});
		index.add(new Integer[][]{{4,3,8},{9,5,1},{2,7,6}});
		index.add(new Integer[][]{{6,7,2},{1,5,9},{8,3,4}});
		
		for (Integer[][] count : index){			
			int temp = 0;
			
			for (int i = 0; i < s.length; i++){
				for (int j = 0; j < s[i].length; j++){
					temp += Math.abs(s[i][j]-count[i][j]);
				}
			}
			
			
			min = temp < min ? temp : min;
		}
		
		
		return min;
		
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        in.close();
        //  Print the minimum cost of converting 's' into a magic square
        System.out.println(lowestCost(s));
        
    }
}