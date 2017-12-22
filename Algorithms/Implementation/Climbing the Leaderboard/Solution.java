/*
 * time: o(m*log n). o(n*log(n)+m*log(n))
 * space: o(n)
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class reverseOrder implements Comparator<Integer>{
	public int compare(Integer o1, Integer o2){
		return o2.compareTo(o1);
	}
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        TreeSet<Integer> leaderBoard = new TreeSet<>(new reverseOrder());
        
 
        for(int scores_i=0; scores_i < n; scores_i++){
            leaderBoard.add(in.nextInt());
        }
        // convert set to list
        List<Integer> leaderBoardList = new ArrayList<>(leaderBoard);
        
        int m = in.nextInt();

        for(int alice_i=0; alice_i < m; alice_i++){	
        	int temp = Collections.binarySearch(leaderBoardList, in.nextInt(), new reverseOrder());
        	System.out.println(temp < 0 ? temp*-1 : temp +1);
        	        	
        }
        in.close();
        
    }
}
