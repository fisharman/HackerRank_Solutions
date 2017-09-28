/*
 * Time: O(n)
 * Space: O(n)
 */

import java.io.*;
import java.util.*;

class calcValley{
	private int valley;
	private int isValley;
	private Deque<Character> stack;
	
	calcValley(){
		valley = 0;
		isValley = 0;
		stack = new ArrayDeque<>();
	}
	
	public void add(Character c){
		if (c != 'U' && c != 'D')
			System.out.println("Invalid Input");
		
		if (stack.size() == 0){
			if (c == 'D') isValley++;
			stack.push(c);
		}
		else if (c.equals(stack.peek())){
			stack.push(c);
		}
		else{
			stack.pop();
			if (stack.size() == 0 && isValley > 0){
				isValley = 0;
				valley++;
			}
		}
	}
	
	public int getValley(){
		return valley;
	}	
	 
}

public class Solution {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	calcValley cv = new calcValley();
    	int n = in.nextInt();
    	String temp = in.next();
    	for (int i = 0; i < n; i++){
    		cv.add(temp.charAt(i));
    	}
    	in.close();
    	System.out.println(cv.getValley());
    }
    
}