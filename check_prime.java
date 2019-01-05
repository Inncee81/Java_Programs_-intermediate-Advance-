package DANISH_058;
import java.util.Scanner;
public class check_prime {
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner input=new Scanner(System.in);
		int p=input.nextInt();
		int f= prime_checking(p);
		if(f==2) {
			System.out.println(p + " is neither prime nor composite");
		}
		else if(f==1) {
			System.out.println(p + " is not a prime number");
		}
		else {
			System.out.println(p + " is a prime number");
		}
	}

	private static int prime_checking(int p) {
		for(int i=2;i<=p/2;i++) {
			if(p%i==0) {
				return 1;
			}
		}
		if(p==0) {
			return 2;
		}
		else {
			return 0;
		}
	}

}
