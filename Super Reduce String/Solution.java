
/*
Gabriel Loterena
8/24/2016
Keep reducing the string till all adject pairs are gone. 
*/

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuffer s = new StringBuffer(scan.nextLine());
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				s.delete(i - 1, i + 1);
				i = 0;
			}
		}
		if (s.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(s);
	}
}