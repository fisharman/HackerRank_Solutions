import java.util.Scanner;

public class Solution {

    public static void insertionSortPart2(int[] ar)
    {
        // first element is already sorted
        // start from second element
        // outside loop incrementally iterate through each array element, assign to temp
        // shifts the element to the left until temp reach an element smaller than itself, if any

        int shiftCount = 0;

        if (ar.length == 1)
            printArray(ar);

        for (int i = 1; i < ar.length; i++){
            int temp = ar[i];

            int j = i - 1;
            while (j >= 0 && temp < ar[j]){
                ar[j+1] = ar[j];
                j--;
                shiftCount++;
            }
            ar[j+1] = temp;
            printArray(ar);

        }
        //System.out.println(shiftCount);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
