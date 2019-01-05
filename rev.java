package DANISH_058;
import java.util.*;
public class rev {
 public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 int p=in.nextInt();
	 
	
	 String s=Integer.toString(p);
	 //String s=String.valueOf(p);
	
	 int y=s.length();
	// char[] q=s.toCharArray();
	 char[] q=new char[y];
	 int j=0;
	 for(int i=y-1;i>=0;i--) {
		 q[j]=s.charAt(i);
		 j++;
		 
	 }
	 System.out.println(String.valueOf(q));
	 
	
 }
}
