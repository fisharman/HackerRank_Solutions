/*
 * time: o(n). needs check every element in the Hashmap
 * space: o(n). storing every element in the HashMap
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

	public static int pick(int[] in){
		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < in.length; i++){
			
			Integer oldValue = map.get(in[i]);
			if (oldValue == null){
				map.put(in[i], 1);
			}
			else{
				map.put(in[i], ++oldValue);
			}
		}
		
		for (int i : map.keySet())
		{
			int temp = 0;
			int tempP1 = map.get(i);
			int tempM1 = map.get(i);
			
			if (map.get(i-1) != null)
				tempM1 += map.get(i-1);
			if (map.get(i+1) != null)
				tempP1 += map.get(i+1);
			
			temp = tempP1 < tempM1 ? tempM1 : tempP1;
			max = max < temp ? temp : max;
			
		}
		
		return max;
		
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        in.close();
        System.out.println(pick(a));
    }
    
}