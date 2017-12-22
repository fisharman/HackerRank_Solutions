/*
 * given: array of numbers
 * solution: import the numbers into a map sorted by the value. subtract the biggest value from total # of int
 */

import java.util.*;


// method 1: generic comparator class that will compare the values in reverse natural order
// method 2: generic method with anonymous comparator class that generates a new map in reverse natural order


class byValueComparator<k extends Comparable<k>, v extends Comparable<v>> implements Comparator<k>{

	private Map<k,v> map = new TreeMap<k,v>();

	public byValueComparator(Map<k,v> map){
		this.map = map;
	}
	
	public int compare(k k1, k k2){
		if (map.get(k1).compareTo(map.get(k2)) !=0 )
			return map.get(k1).compareTo(map.get(k2))*-1;
		else
			return k1.compareTo(k2)*-1;
	}
	
}


public class Solution {
	
	public static <k extends Comparable<k>, v extends Comparable<v>>  Map<k,v> sortByValue(Map<k,v> inputMap){
		
		Comparator<k> byValue = new Comparator<k>(){
			public int compare(k k1, k k2){
				if (inputMap.get(k1).compareTo(inputMap.get(k2)) !=0 )
					return inputMap.get(k1).compareTo(inputMap.get(k2))*-1;
				else
					return k1.compareTo(k2)*-1;
			}
		};
		
		
		Map<k, v> valueSorted = new TreeMap<>(byValue);
		valueSorted.putAll(inputMap);
		return valueSorted;
	}
	
	
	public static void main(String[] args){
		Map<Integer, Integer> tally = new TreeMap<>();
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++){
			int temp = in.nextInt();
			if (tally.get(temp) == null){
				tally.put(temp, 1);
			}
			else
				tally.put(temp, Integer.sum(tally.get(temp),1));
		}
		in.close();
			
		// Map<Integer,Integer> valueSorted = sortByValue(tally);
		SortedMap<Integer,Integer> valueSorted = new TreeMap<>(new byValueComparator<Integer,Integer>(tally));
		valueSorted.putAll(tally);
		
		System.out.println(n-valueSorted.firstKey());	
		
		
	}
	
}
