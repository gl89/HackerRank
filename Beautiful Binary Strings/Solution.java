/*
Gabriel Loterena
8/18/2016
Find number of times a pattern is found in string, no overlaps.

I.e  This method is just to get rid of all non pattern strings and divide by the length
of the pattern. In this case "010" example. 01000 = 5 - non pattern 00 = 2, then 3/3 = 1 pattern found. 
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
		String B = in.next();
		System.out.println((B.length() - B.replaceAll("010", "").length()) / 3);
	}
}
