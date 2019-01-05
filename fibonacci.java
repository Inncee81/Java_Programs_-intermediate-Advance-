package DANISH_058;
import java.util.Scanner;
public class fibonacci {
	public static void main(String args[]) {
		System.out.println("please enter the n term for fibonacci series");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a1=0,a2=1;
		fibonacci_series(a1,a2,n);
	}

	private static void fibonacci_series(int a1, int a2, int n) {
		int next_term;
		System.out.print("The "+n+"th term fibonacci series: ");
		for(int i=0;i<n;i++) {
			System.out.print(a1+" ");
			next_term=a1+a2;
			a1=a2;
			a2=next_term;
			
		}
		
	}
	

}
