import java.util.Scanner;

public class Solution {


    public static void quicksort (int[] ar, int lo, int hi){

        if (lo < hi) {
            int pivot = partition(ar, lo, hi);
            printArray(ar);
            quicksort(ar, lo, pivot - 1);
            quicksort(ar, pivot + 1, hi);
        }

    }

    public static int partition(int[] ar, int lo, int hi) {

        int pivot = ar[hi];
        int i = lo - 1;

        for (int j = lo; j < hi; j++){
            if (ar[j] < pivot){
                i++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }
        if (ar[hi] < ar[i+1]) {
            int temp = ar[hi];
            ar[hi] = ar[i+1];
            ar[i+1] = temp;
        }
        return i+1;
    }

    public static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quicksort(ar, 0, ar.length - 1);
    }
}