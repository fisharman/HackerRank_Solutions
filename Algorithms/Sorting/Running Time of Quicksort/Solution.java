import java.util.Scanner;

public class Solution {
    private static int qsSwap = 0;
    private static int insertSwap = 0;

    public static void insertionSortPart2(int[] ar)
    {
        // first element is already sorted
        // start from second element
        // outside loop incrementally iterate through each array element, assign to temp
        // shifts the element to the left until temp reach an element smaller than itself, if any


        for (int i = 1; i < ar.length; i++){
            int temp = ar[i];

            int j = i - 1;
            while (j >= 0 && temp < ar[j]){
                ar[j+1] = ar[j];
                j--;
                insertSwap++;
            }
            ar[j+1] = temp;

        }
    }

    public static void quicksort (int[] ar, int lo, int hi){

        if (lo < hi) {
            int pivot = partition(ar, lo, hi);
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
                qsSwap++;
            }

        }
        if (ar[hi] < ar[i+1]) {
            int temp = ar[hi];
            ar[hi] = ar[i+1];
            ar[i+1] = temp;

        }
        qsSwap++;
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
        int[] arIns = new int[n];
        for(int i=0;i<n;i++){
            arIns[i]=in.nextInt();
        }
        int[] arQS = arIns.clone();

        quicksort(arIns, 0, arIns.length - 1);
        insertionSortPart2(arQS);

        System.out.println(insertSwap-qsSwap);
    }
}