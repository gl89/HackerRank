/*
Gabriel Loterena
8/24/2016
Find number of times a pattern is found in string, no overlaps.

Essentially you find the amount of words in the string, which are indicated with upper case characters.
THis is very similar to other problems, but you need to know some regex expressions. Should
instantly pop in your mind when you look that the problem. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String[] r = s.split("(?=\\p{Lu})");
		System.out.println(r.length);
	}
}