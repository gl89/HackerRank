import java.util.Arrays;

public class Sorting {

	static void Selection(int[] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}

	static void Insertion(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];// key is the current item
			int j = i - 1;// previous item
			while ((j > -1) && (a[j] > key)) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] n = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Selection(n);
		System.out.println(Arrays.toString(n));

		int[] m = new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		Insertion(m);
		System.out.println(Arrays.toString(m));

	}
}