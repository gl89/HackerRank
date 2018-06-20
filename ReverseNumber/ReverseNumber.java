/*Gabriel Loterena
8/25/2106
Reverse an Integer
*/

public class ReverseNumber {

	static int revInt(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(revInt(231343));
		System.out.println(revInt(100003));
		System.out.println(revInt(987654321));
		System.out.println(revInt(123456789));
	}
}