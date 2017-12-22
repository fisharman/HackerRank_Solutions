import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void mapAdd (Map<Integer, Integer> map, int input){
        map.put(input,map.getOrDefault(input,0) + 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++){
            mapAdd(map, in.nextInt());
        }

        for (int i = 0; i < 100; i++){
            System.out.print(map.getOrDefault(i,0) + " ");
        }
        System.out.println("");


    }
}
