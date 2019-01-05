package DANISH_058;

import java.util.Scanner;

public class gcd {
public static void main(String args[]) {
	 int hcf = 1;
	System.out.println("enter first number");
	Scanner input=new Scanner(System.in);
	 int a=input.nextInt();
	 System.out.println("enter second number");
	 int b=input.nextInt();
	 
	 for(int i=1;i<=a && i<=b;i++) {
		 if(a%i==0 && b%i==0) {
			  hcf=i;
		 }
	 }
	System.out.println("gdf of "+a +" and " +b+" is "+hcf);
}
}
