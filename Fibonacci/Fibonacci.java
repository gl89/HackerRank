public class Fibonacci {
	public static int count = 0;

	public static int Fib(int n) {
		count++;
		if (n <= 2) {
			return 1;
		} else {
			return Fib(n - 1) + Fib(n - 2);
		}
	}

	public static void main(String[] args) {

		System.out.println(Fib(1));
		System.out.println(count + "calls");
		System.out.println(Fib(2));
		System.out.println(count + "calls");
		System.out.println(Fib(3));
		System.out.println(count + "calls");
		System.out.println(Fib(4));
		System.out.println(count + "calls");
		System.out.println(Fib(5));
		System.out.println(count + "calls");
		System.out.println(Fib(6));
		System.out.println(count + "calls");
		System.out.println(Fib(7));
		System.out.println(count + "calls");
		System.out.println(Fib(8));
		System.out.println(count + "calls");
		System.out.println(Fib(9));
		System.out.println(count + "calls");

	}
}