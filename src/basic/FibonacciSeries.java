package basic;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		int n = 8;
		while (n > 0) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(b + " ");
			n = n - 1;
		}

	}

}
