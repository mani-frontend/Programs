package basic;

public class Prime {

	public static void main(String[] args) {
		int n = 44;
		boolean isprime=true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isprime=false;
			}
		}
		if(isprime) {
			System.out.println(n + " is prime number");
		}else {
			System.out.println(n + " is not prime number");
		}

	}

}
