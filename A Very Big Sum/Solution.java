
/*
Gabriel Loterena
7/12/2017
Hackerrank 
Numbers bigger than 2^32 need long to work. I typecasted it to long.
Similar problem in Codility. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		long sum = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		for (int j = 0; j < n; j++) {
			sum += (long) arr[j];
		}
		System.out.println(sum);
	}
}