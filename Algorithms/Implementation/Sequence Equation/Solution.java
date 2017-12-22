import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	List<Integer> pn = new ArrayList<>(51);
    	pn.add(null);
    	
    	for (int i = 0; i < n; i++)
    		pn.add(in.nextInt());
    	
    	for (int i = 1; i <= n; i++)
    	{
    		int firstIndex = pn.indexOf(i);
    		System.out.println(pn.indexOf(firstIndex));
    	}
    	
    	in.close();
    }
}