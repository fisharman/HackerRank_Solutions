import java.util.*;
public class Solution {

    public static void partition(Integer[] ar) {

        // call recursion on left then right

        List<Integer> list = new ArrayList<Integer>(Arrays.asList(ar));
        quickSort(list);

    }

    public static List<Integer> quickSort(List<Integer> ar){

        if (ar == null || ar.size() <=1)
            return ar;

        List<Integer> pivot = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        pivot.add(ar.get(0));

        for (int i = 1; i < ar.size(); i++){
            if (ar.get(i) < pivot.get(0))
                left.add(ar.get(i));
            else if (ar.get(i) > pivot.get(0))
                right.add(ar.get(i));
            else
                pivot.add(ar.get(i));
        }

        left = quickSort(left);
        right = quickSort(right);

        List<Integer> combined = new ArrayList<>();

        combined.addAll(left);
        combined.addAll(pivot);
        combined.addAll(right);
        printArray(combined.toArray(new Integer[combined.size()]));

        return combined;
    }

    public static void printArray(Integer[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] ar = new Integer[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}