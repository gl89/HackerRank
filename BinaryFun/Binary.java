/*
Gabriel Loterena
Always get asked random stuff at interviews
*/

public class Binary {

	public static int complement(int n) {
		String binary = Integer.toBinaryString(n);

		StringBuffer sb = new StringBuffer(binary);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '0') {
				sb.setCharAt(i, '1');
			} else {
				sb.setCharAt(i, '0');
			}
		}

		binary = sb.toString();
		return Integer.parseInt(binary, 2);
	}

	public static int convert(int n) {
		int decimal = 0;
		int p = 0;
		while (true) {
			if (n == 0) {
				break;
			} else {
				int temp = n % 10;
				decimal += temp * Math.pow(2, p);
				n = n / 10;
				p++;
			}
		}
		return decimal;
	}

	public static void main(String[] args) {
		// System.out.println(convert(1001));//9
		// System.out.println(convert(11)); //3

		System.out.println(complement(2)); // 01 10

		System.out.println(complement(443)); //
		System.out.println(complement(1)); // 1 0

	}
}