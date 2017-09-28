import java.io.*;
import java.util.*;

/*
 * Sample Input
4 1
3 10 2 9
12
 */


class Sum{
	public static int listSum(List<Integer> list){
		int sum = 0;
		for(int i : list)
			sum += i;
		return sum;
	}
	
}


public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> c = new ArrayList<>(n);
		for (int i = 0; i < n; i++) c.add(in.nextInt());
		int b = in.nextInt();
		in.close();
		
		if ((Sum.listSum(c) - c.get(k))/2 == b){
			System.out.println("Bon Appetit");
		}
		else{
			System.out.println(c.get(k)/2);
		}
		
	}
}