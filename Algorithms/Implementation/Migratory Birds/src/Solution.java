import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	
	/*
	 * test input
	 * 6
	 * 1 4 4 4 5 3
	 */
	/*
	 * Time Complexity
	 * Data Input: O(n) + O(log N)
	 * Sort: O(log N)
	 */
	
	
	public static <K extends Comparable<K>,V extends Comparable<V>> SortedMap<K,V> 
		sortByValues(final Map<K,V> map){ 
		/*
		 * K,V is only in the scope of this method. K,V extends Comparable<V> is bounded type parameter. it allows K,V to invoke methods in Comparable<V>
		 * final Map<K,V> stops maps from being reassigned 
		 * takes in original map and returns a sorted version based on the value
		 */
		 
		Comparator<K> vCompare = new Comparator<K>()
		{ // switching to V will not work?
			
			public int compare (K k1, K k2){
				int rt = map.get(k1).compareTo(map.get(k2));
				if (rt == 0){
					rt = k2.compareTo(k1);
					return rt;
				}
				return rt;
			}
		};
		
		SortedMap<K,V> valueMap = new TreeMap<>(vCompare);
		valueMap.putAll(map);
		return valueMap;
		
	}
	
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];        
        TreeMap<Integer,Integer> count = new TreeMap<>();
        
        // your code goes here
        // 1. read key. if key does not exist, set value as one and put
    	// 2. if key does exist. increase value and place back in map
        
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            if (count.get(types[types_i]) == null){
            	count.put(types[types_i], 1);
            }
            else{
            	int oldValue = count.get(types[types_i]);
            	count.put(types[types_i], ++oldValue);
            }
            
        }
        in.close();
        
        count = new TreeMap<>(sortByValues(count));
        System.out.println(count.lastKey());
        

    }
}
