import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/* sample input
9
10 20 20 10 10 30 50 10 20
 */


public class Solution {

	
	// Solution 1: Use HashSet
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        HashSet<Integer> tracker = new HashSet<>();
        int pair = 0;
        
        for (int i = 0; i < n ; i++){
        	int c = in.nextInt();
        	if (tracker.remove(c)){
        		pair++;
        	}
        	else{
        		tracker.add(c);
        	}
        }
        in.close();
        System.out.println(pair);   
    }
   
    
}
