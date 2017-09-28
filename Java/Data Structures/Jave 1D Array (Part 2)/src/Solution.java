import java.util.*;

public class Solution {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    	return isSolvable(leap,game, 1);
    	
    }
    
    private static boolean isSolvable(int leap, int[] game, int index){
    	if (index > game.length - 1)
    		return true;
    	if (index < 0)
    		return false;
    	if (game[index] == 1)
    		return false;
    	
    	game[index] = 1; // prevent infinite recursive loop?
    	
    	return (isSolvable(leap,game,index - 1)||isSolvable(leap,game, index + 1)||isSolvable(leap,game, index + leap));
    	  	
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
