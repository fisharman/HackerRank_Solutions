import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
    		// subtract the same letter found in second string as they do not require replacement
    		// as the length of the letters are the same, the remaining positive number will cancel out negative number
    		// therefore only need to add up the positive numbers
    	
    	
        // check length of S. return -1 for uneven number
    		if (s.length() % 2 == 1)
    			return -1;
    		
    		Map<Character, Integer> map = new HashMap<>();
    		int value = 0;
    		
    		
    		
    		for (int i = 0; i < s.length()/2; i++) {		
    			char temp = s.charAt(i);
    			
    			map.put(temp, map.getOrDefault(temp, 0) + 1);
    		}
    		
    		for (int i = s.length()/2; i < s.length(); i++){
    			char temp = s.charAt(i);
    			
    			map.put(temp, map.getOrDefault(temp, 0) - 1);
    		}
    		
    		  		
    		
    		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    			if (entry.getValue() > 0)
    				value += entry.getValue();
    		}
    		
    		return value;
    		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
        in.close();
    }
}