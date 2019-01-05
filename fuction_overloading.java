package DANISH_058;
import java.util.Scanner;
public class fuction_overloading {
	public static void main(String[] args) {
	System.out.println("enter first number");
	Scanner input=new Scanner(System.in);
	int f=input.nextInt();
	System.out.println("enter second number");
	double s=input.nextInt();
	//function overloading......
	System.out.println("factorial : "+fun(f) );
	 System.out.println("mutliply : "+fun(f,s) );
	 System.out.println("addition : "+fun(f,s) );
	}

	private static int fun(int f, int s) {
		return (int) (f*s);
		
	}

	private static double fun(double f,double s) {
		return (double)s+s;
	}

	

	private static int fun(int f) {
		int fact=1;
		for(int i=f;i>0;i--) {
			fact=fact*i;
			
		}
		return (int)fact;
		
	}
}
