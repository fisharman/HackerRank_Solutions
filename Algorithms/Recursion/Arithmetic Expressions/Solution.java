import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static boolean solve(ArrayList<Integer> operands, int idx, long sum, StringBuilder output, boolean[][] memo){
        // try solve with + / - / x
        StringBuilder solution = new StringBuilder(output);

        sum = sum % 101;

        if (sum == 0){
            for (int i = idx; i < operands.size(); i++){
                solution.append("*" + operands.get(i));
            }
            System.out.println(solution);
            return true;
        }

        if (idx == operands.size()){
            if (sum == 0){
                System.out.println(output);
                return true;
            }
            return false;
        }

        if(memo[101 + (int) sum][idx])
            return false;

        boolean done = false;

        solution.append("+" + operands.get(idx));
        done = solve(operands, idx + 1, sum + operands.get(idx), solution, memo);
        if (done){
            return done;
        }


        solution = new StringBuilder(output);
        solution.append("-" + operands.get(idx));
        done = solve(operands, idx + 1, sum - operands.get(idx), solution, memo);
        if (done){
            return done;
        }

        solution = new StringBuilder(output);
        solution.append("*" + operands.get(idx));
        done = solve(operands, idx + 1, sum * operands.get(idx), solution, memo);
        if (done){
            return done;
        }

        memo[101 + (int) sum % 101][idx] = true;

        return false;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        ArrayList<Integer> operands = new ArrayList<>();

        for (int i = 0; i < n; i++){
            operands.add(in.nextInt());
        }

        solve(operands, 1, operands.get(0), new StringBuilder("" + operands.get(0)), new boolean[2*101][operands.size()]);

    }
}
