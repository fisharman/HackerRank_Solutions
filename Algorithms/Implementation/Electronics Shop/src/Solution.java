/*
10 2 3
3 1
5 2 8 
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
class reverseComparator implements Comparator<Integer>{
    
	public int compare(Integer n1, Integer n2){
		return n1.compareTo(n2)*-1;
    }
}

 
public class Solution {
    
	/*
    static int getMoneySpent(AbstractCollection<Integer> keyboards, AbstractCollection drives, int s){
        // Complete this function
        return 0;
    }*/
    
    static int getMoneySpent(AbstractCollection<Integer> keyboards, AbstractCollection<Integer> drives, int s){
        // Complete this function
        //
    	int max = -1;
    	
    	for (int i : keyboards){
    		for (int j : drives){
    			// could be optimized so that j stops incrementing when i+j > s and break loop
    			// so a smaller i can be attempted with the same j
    			if (i+j == s) return s;
    			if (i + j > s) break;
    			max = i+j > max ? i+j : max;
    		}
    	}
    		  	
    	return max;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        
        TreeSet<Integer> keyboards = new TreeSet<>(new reverseComparator());
        // int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            int temp = in.nextInt();
        	if (temp < s) keyboards.add(temp);
        }
                     
        TreeSet<Integer> drives = new TreeSet<>();
        // int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            int temp = in.nextInt();
        	if (temp < s) drives.add(temp);            
        }
        in.close();
        
        // Another method to reverse set
        //NavigableSet<Integer> nsTree = drives.descendingSet();
        
        
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
