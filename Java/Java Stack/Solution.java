import java.util.*;
class Solution{
	
	
	
	public static boolean checkBalanceStack(String input){
		Deque<Character> stack= new ArrayDeque<>();
		stack.clear();
		
		for (int i = 0; i < input.length(); i++){
			switch(input.charAt(i)){
			case '}':
				if (stack.peek() == null || stack.poll() != '{')
					return false;
				break;
			case ']':
				if (stack.peek() == null || stack.poll() != '[')
					return false;
				break;
			case ')':
				if (stack.peek() == null || stack.poll() != '(')
					return false;
				break;
			case '{':
				stack.offerFirst(input.charAt(i));
				break;
			case '[':
				stack.offerFirst(input.charAt(i));
				break;
			case '(':
				stack.offerFirst(input.charAt(i));
				break;
			default:
				break;
			}
		}
		return (stack.isEmpty() ? true : false);
	}
	
	
	public static boolean checkBalanceMap(Map<Character,Character> contentMap, String input){
		Deque<Character> stack= new ArrayDeque<>();
		stack.clear();
		
		for (int i = 0; i < input.length(); i++){
			char temp = input.charAt(i);
			
			if (contentMap.containsKey(temp))
				stack.offerFirst(temp);
			else if (contentMap.containsValue(temp)){
				if (stack.peek() == null || contentMap.get(stack.poll()) != temp)
					return false;
 			}
			// else statement can be added here if special characters needs to be dealt with
		}
		return (stack.isEmpty() ? true : false);
	}
	
   public static void main(String []argh)
   {
	   Map<Character, Character> contentMap = new HashMap<>();
	   contentMap.put('{', '}');
	   contentMap.put('[', ']');
	   contentMap.put('(', ')');
	   
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         System.out.println(checkBalanceMap(contentMap, input) ? "true" : "false");
      }
      sc.close();
      
   }
}