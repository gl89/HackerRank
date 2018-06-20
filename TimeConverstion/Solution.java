/*
Gabriel Loterena
7/16/2016
Hackerrank 
Converting standard time to Military time. 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();

		boolean PM = false;
		String[] str = time.split(":");
		String a = str[2];

		// check if its night, most people know you just add 12 to a time to
		// make it military time for night
		if (str[2].charAt(2) == 'P')
			PM = true;

		// as mentioned earlier if its PM then just add 12
		if (PM) {
			System.out.print(Integer.parseInt(str[0]) % 12 + 12 + ":");
			System.out.println(str[1] + ":" + str[2].substring(0, 2));
		} else {
			System.out.print("0" + (Integer.parseInt(str[0]) % 12) + ":");
			System.out.println(str[1] + ":" + str[2].substring(0, 2));
		}

	}
}