// Algorithms/Sorting/Big Sorting

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<String> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            list.add(in.next());
        }

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length())
                    return o1.length() < o2.length() ? -1 : 1;

                return o1.compareTo(o2);
            }
        });

        StringBuilder output = new StringBuilder();
        for (String s : list){
            output.append(s);
            output.append("\n");
        }
        System.out.print(output);
    }
}
