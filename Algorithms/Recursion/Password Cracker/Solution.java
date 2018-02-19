import java.util.*;

public class Solution {

    public static boolean solve (Set<String> pwSet, String loginAttempt, StringBuilder output, Map<String, Boolean> map){
        boolean result = false;

        if (loginAttempt.length() == 0){
            System.out.println(output);
            return true;
        }

        if (map.get(loginAttempt) != null)
        {
            return map.get(loginAttempt);
        }

        for (String s: pwSet){
            // reduce the login attempt by the word if it is a match and recursively calls the method
            if (s.length() <= loginAttempt.length() && loginAttempt.substring(0, s.length()).equals(s)) {
                StringBuilder newOutput = new StringBuilder(output);
                newOutput.append(loginAttempt.substring(0, s.length()) + " ");
                result = solve(pwSet, loginAttempt.substring(s.length()), newOutput, map);
            }

            if (result){
                map.put(loginAttempt,true);
                return true;
            }

        }
        map.put(loginAttempt, false);

        return false;

    }

    private static void check(Set<String> pwSet, StringBuilder loginAttempt){

    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++){
            int n = in.nextInt();
            Set<String> pwSet = new HashSet<>(n);

            for (int j = 0; j < n; j++){
                pwSet.add(in.next());
            }
            in.nextLine();
            String loginAttempt = in.nextLine();

            if (!solve(pwSet, loginAttempt, new StringBuilder(), new HashMap<String, Boolean>()))
                System.out.println("WRONG PASSWORD");
        }


    }
}
