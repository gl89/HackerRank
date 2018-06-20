import java.util.*;

//To find each palindrome substring in a string, we will treat every character as a pivot and expand from that character
//we will also find every instance odd or even

public class Palindromes {
	static void expand(String s, int low, int high, Set<String> a) {
		while (low >= 0 && high < s.length() && (s.charAt(low) == s.charAt(high))) {
			// we don't like single letters
			if (s.substring(low, high + 1).length() != 1) {
				a.add(s.substring(low, high + 1));
			}
			low--;
			high++;
		}
	}

	static void allPalindromes(String s) {
		Set<String> Palindromes = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			// odd
			expand(s, i, i, Palindromes);
			// evens
			expand(s, i, i + 1, Palindromes);
		}
		for (String a : Palindromes) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		Palindromes.allPalindromes("abba");

	}
}
