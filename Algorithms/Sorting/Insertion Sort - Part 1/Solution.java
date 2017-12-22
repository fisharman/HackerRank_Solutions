import java.util.Scanner;

public class Solution {

    public static void insertIntoSorted(int[] ar) {

        int temp = ar[ar.length - 1];
        int idx = ar.length - 2;

        while (idx >= 0 && temp < ar[idx]) {
            ar[idx + 1] = ar[idx];
            idx--;
            printArray(ar);
        }
        ar[idx + 1] = temp;

        printArray(ar);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }


}
