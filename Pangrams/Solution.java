/*
Gabriel Loterena
8/18/2016
Pangrams are sentences that include every letter. 
My method is super easy, but seems to be radically different and somewhat ugly than other's. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		line = line.toLowerCase();

		Map<Character, Boolean> alpha = new HashMap<Character, Boolean>();
		for (char i = 'a'; ai <= 'z'; i++) {
			alpha.put(i, false);
		}

		for (int i = 0; i < line.length(); i++) {
			if (alpha.containsKey(line.charAt(i)))
				alpha.put(line.charAt(i), true);
		}

		if (alpha.containsValue(false)) {
			System.out.println("not pangram");
		} else if (alpha.containsValue(true)) {
			System.out.println("pangram");
		}
	}
}