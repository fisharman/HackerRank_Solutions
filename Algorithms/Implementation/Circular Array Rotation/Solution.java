import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static int indexCalc(int m, int n, int k){
		// m-k to access previous element for n shift down (right rotation)
		// m-k%n as k can be much bigger than n, however this will go into negative value
		// (m+n)-k%n to ensure value will not go negative
		// (m+n-k%n)%n adds n to m to ensure answer will be all positive. %n ensures the n.. n+1 etc will wrap around
		// [0....n-1]+n=[n....2n-1]
		
		return (m+n-k%n)%n;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[indexCalc(m,n,k)]);
        }
        in.close();
    }   
}

