import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cloud = 0;
        int e = 100;
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = (in.nextInt() > 0 ? 3 : 1);
        	// System.out.println(c[c_i]);
        }
        
        do{
        	cloud = (cloud+k)%n;
        	e -= c[cloud];
        	
        }while(cloud != 0);
        
        
        System.out.println(e);
        
        in.close();
    }
}