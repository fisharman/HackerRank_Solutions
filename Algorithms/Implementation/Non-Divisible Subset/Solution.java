/*
 * Time Complexity O(n log n)
 * Space Complexity O(n)
 */

import java.util.*;

public class Solution {
	
	public static int calcSetSize(Map<Integer, Integer> reminders, int k){
		int setSize = 0; // returns size of 1 when any two in set S will be divisible by k
		
		if (k == 0)
			return 1;
		
		if (k == 1)
			return 1;
				
		// special case if reminder is 0
		if (reminders.get(0) > 0){
			setSize += 1;
		}
		reminders.remove(0);
		
		// special case if k is even
		if (k%2 == 0 && reminders.get(k/2) > 0){
			setSize += 1;
			//reminders.remove(k/2);
		}
			
		// iterate through the keys in map, adds the reminder with highest frequency
		for (Map.Entry<Integer,Integer> entry : reminders.entrySet()){
			if (entry.getKey() >= k/2 + k%2)
				break;
			
			if (entry.getValue() >= reminders.get(k - entry.getKey())){
				setSize += entry.getValue();
			}else{
				setSize += reminders.get(k - entry.getKey());
			}
			
		}
		
		return setSize;
					
	}
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
	
		int n = in.nextInt();
		int k = in.nextInt();
		
		Map<Integer, Integer> reminders = new HashMap<>(k);
		
		// initialize map with all 0
		for (int i = 0; i < k; i++){
			reminders.put(i, 0);
		}
		
		// calculates the reminders of the array and puts them into the map
		for (int i = 0; i < n; i++){
			int temp = in.nextInt()%k;
			
			reminders.put(temp, Integer.sum(reminders.get(temp),1));
		}
		in.close();
		System.out.println(calcSetSize(reminders, k));
		
	}
}