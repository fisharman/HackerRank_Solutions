import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	
    	for (int i = 0; i < t; i++){
    		int count = 0;
    		int input = in.nextInt();
    		int number = input;
    		
    		
    		while(number > 0){
    			int digit = number % 10;
    			if (digit > 0 && input % digit == 0)
    				count++;
    			number = number / 10;
    		}
    		System.out.println(count);
    
    	}
    	in.close();
    }
}