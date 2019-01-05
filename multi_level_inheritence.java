package DANISH_058;

import java.util.Scanner;

 
class first {
	public  int[]  initialize() {
		
		System.out.println("enter first number");
		Scanner input=new Scanner(System.in);
		final int f=input.nextInt();
		
		System.out.println("enter second number");
		final double s=input.nextInt();
		 int arr[]= {f,(int)s};
		 return arr;
		
	}
}
 class factorial extends first{
	
	public int factorial_find(int f) {
		int fact=1;
		for(int i=f;i>0;i--) {
			fact=fact*i;
			
		}
		return fact;
	}
	
	
}
 
 public class multi_level_inheritence extends factorial{
	 

	private  int mul(int f, double s) {
			return (int) (f*s);
			
		}

		private  double add(int f, double s) {
			return f+s;
		}
		
		public static void main (String args[]) {
			 multi_level_inheritence obj =new multi_level_inheritence();
			 int arr[]=obj.initialize();
			 System.out.println("factorial of first number is "+obj.factorial_find(arr[0]));
			 System.out.println("multiply "+obj.mul(arr[0],arr[1]));
			 System.out.println("addition "+obj.add(arr[0],arr[1]));
			
		}
		
		
 }
 
 
 
 
 