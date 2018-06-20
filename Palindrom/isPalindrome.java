/*
Gabriel Loterena
9/10/2016
Checking palindrome
*/

public class isPalindrome {

	static boolean isIT(String str) {
		int i1 = str.length() - 1;
		int i2 = 0;

		while (i1 > i2) {
			if (str.charAt(i1) != str.charAt(i2)) {
				return false;
			}
			i1--;
			i2++;

		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPalindrome.isIT("aabaa"));
		System.out.println(isPalindrome.isIT("acbaa"));
		System.out.println(isPalindrome.isIT("rain"));
		System.out.println(isPalindrome.isIT("aaaaaaacaaaaaaaaaaaaa"));
		System.out.println(isPalindrome.isIT("abcdefedcba"));
		System.out.println(isPalindrome.isIT("a a a"));
		System.out.println(isPalindrome.isIT("aabaa aabaa"));
		;
	}
}