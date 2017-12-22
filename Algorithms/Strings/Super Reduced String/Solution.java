import java.util.*;

public class Solution {

    static String super_reduced_string(String s){
        
    
    	Deque<Character> stack = new ArrayDeque<>();
    	for (int i = 0; i < s.length(); i++){
    		// if peeking returns valid value, compare with current char
    		// if same, pop and move to next char
    		// if null or different, push in current char
    		
    		// if stack size at end is empty. print empty string
    		// else build a string using remove last to keep order
    		// or use descendingIterator
    		if (stack.peek() == null || stack.peek() != s.charAt(i))
    		{
    			stack.addFirst(s.charAt(i));
    		}
    		else {
    			stack.removeFirst();
    		}
    	}
    	
    	if (stack.size() == 0)
    		return "Empty String";
    	else {
    		StringBuilder temp = new StringBuilder(stack.size());
    		int length = stack.size();
    		for (int i = 0; i < length; i++) {
    			temp.append(stack.removeLast());
    		}
    		
    		return temp.toString();
    	}
    		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
    
}