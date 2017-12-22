import java.util.*;

public class Solution {

	public static boolean canConvert(String s, String t, int k){
		int matchIdx = 0;
		
		// case 1
		// if string s can be erased entirely and rewritten with t. operation can be wasted on erase empty string
		if (s.length() + t.length() <= k){
			return true;
		}
		
		//determine the index of the string where they are the same
		for (int i = 0; i < s.length() && i < t.length(); i++){
			if (s.charAt(i) != t.charAt(i))
				break;
			matchIdx++;
		}
		
		// case 2
		// waste operation can only be done in groups of 2
		// if ((k - (s.length() - matchIdx + t.length() - matchIdx))%2 == 0 && k - (s.length() - matchIdx + t.length() - matchIdx) >= 0)
		// k is odd/even matches the odd/even of number of different digits 
		if (k - (s.length() - matchIdx + t.length() - matchIdx)%2 == k%2)
		{	
			return true;
		}
				
		return false;
	}
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        System.out.println(canConvert(s, t, k) ? "Yes" : "No");
    }
}
