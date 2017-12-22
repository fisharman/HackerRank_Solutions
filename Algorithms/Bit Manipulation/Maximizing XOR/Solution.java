import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        in.close();

        int xord = l^r;
        int sigDiffBit = Integer.SIZE - Integer.numberOfLeadingZeros(xord) - 1;

        // shift 1 by sigDiffBit positions
        System.out.println((1 << sigDiffBit + 1) - 1);

    }
}