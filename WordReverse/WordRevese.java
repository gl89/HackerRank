import java.util.*;

public class WordRevese {

	static void WR(String s) {

		StringBuffer sb = new StringBuffer();
		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.reverse();
			arr[i] = sb.toString();
			sb.setLength(0);
			System.out.print(arr[i] + " ");
		}

	}

	static void dup(String s) {

		String[] arr = s.split("");

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			if (arr[i].charAt(0) == arr[j].charAt(0)) {
				while (arr[i].charAt(0) == (arr[j].charAt(0))) {
					j++;
				}
				if (j == arr.length) {
					j--;
				}
				i = j;

			} else {
				System.out.print(arr[i]);
			}
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		WordRevese.WR("Hello World");
		System.out.println();
		WordRevese.dup("AABBDSFSDSDERRRWEEWCC");
	}
}