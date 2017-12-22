import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	List<Integer> sticks = new LinkedList<>();
    	Scanner in = new Scanner(System.in);
    	
    	int n = in.nextInt();
    	
    	for (int i = 0; i < n; i++)
    		sticks.add(in.nextInt());
    	
    	
    	while (sticks.size() > 0){
    		int smallestStick = 0;

    		Collections.sort(sticks);
    		smallestStick = sticks.get(0);    		
    		System.out.println(sticks.size());
    		while (sticks.remove((Integer)smallestStick)); // Casted to Object
    	}
    	
    }
}