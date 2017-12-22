import java.util.*;

public class Solution {


    public static void mapAdd (Map<Integer, List<String>> map, int key, String value){
       // if array does not exist, create new linked link and add to list
        // else add to list
        if (map.containsKey(key)){
            map.get(key).add(value);
        }
        else{
            List<String> valueList = new ArrayList<>();
            valueList.add(value);
            map.put(key,valueList);
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, List<String>> map = new HashMap<>();

        int n = in.nextInt();
        for (int i = 0; i < n/2; i++){
            mapAdd(map, in.nextInt(),  "-");
            in.nextLine();
        }

        for (int i = n/2; i < n; i++){
            mapAdd(map, in.nextInt(), in.next());
            if (in.hasNext())
                in.nextLine();
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++){
            if (map.containsKey(i)){
                List<String> valueList = map.get(i);
                for (String value : valueList){
                    output.append(value);
                    output.append(" ");
                }
            }
        }
        System.out.println(output);
    }

}
// BufferedReader Version
/*
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String [] pair = br.readLine().split(" ");
            int key        = Integer.parseInt(pair[0]);
            String value   = (i < n/2) ? "-" : pair[1];
 */