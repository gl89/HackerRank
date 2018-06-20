import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		while (T < 0) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			int S = scan.nextInt();
			while (M != 1) {
				S++;
				M--;
			}
			System.out.println(S % N);
			T--;
		}
	}
}