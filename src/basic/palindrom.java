package basic;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1991;
		int t=1991;
		int sum=0;
	while(n>0) {
	int	r=n%10;
		sum=sum*10+r;
		n=n/10;
		
	}
	if(t==sum) {
		System.out.println( t + " is palindrom");
	}
	else {
		System.out.println(t +" is not palidrom");
	}

	}

}
