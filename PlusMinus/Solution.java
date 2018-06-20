
/*
Gabriel Loterena
7/16/2016
Hackerrank 
PlusMinus, return the fraction of + - 0 in an array of numbers
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
		int[] count = new int[3]; // 0 is positive, 1 is negative, 2 is zero
									// holds count

		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				count[0]++;
			if (arr[i] < 0)
				count[1]++;
			if (arr[i] == 0)
				count[2]++;
		}
		// + - 0
		System.out.println((double) count[0] / n);
		System.out.println((double) count[1] / n);
		System.out.println((double) count[2] / n);
	}
}