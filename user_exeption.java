package DANISH_058;
import java.util.Scanner;
 class UserException extends Exception{
	public String toString() {
		return "UserException : average exceeds 50 ";
	}
}

 class user_exeption  {
	 	public static void main(String[] args) throws UserException {
		 System.out.println("enter first number");
			Scanner input=new Scanner(System.in);
			 int a=input.nextInt();
			 System.out.println("enter second number");
			 int b=input.nextInt();
			 System.out.println("enter third number");
			 int c=input.nextInt();
			 try {
				 int avg=(a+b+c)/3;
				 System.out.println("avg is : "+avg);
				 if(avg>50) {
					 throw new UserException();
				 }
			 }
			 catch(UserException obj){
				 System.out.println(obj);
			 }
	 }
	 	
}
