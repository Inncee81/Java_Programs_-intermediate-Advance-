package DANISH_058;
import java.util.*;
public class threerdsmallest {
  public static void main(String[] args) {
	  Scanner in=new Scanner(System.in);
	  int temp;
	  System.out.println("enter the size of array");
	  int n =in.nextInt();
		int[] arr =new int[n];
	  for(int i=0;i<arr.length;i++) {
		  arr[i]=in.nextInt();
	  }
	 
	 Arrays.sort(arr);
	  
	  
	 /* for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[i]>arr[j]) {
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
				  
			  }
		  }
	  }*/
	  
	  for(int i=0;i<arr.length;i++) {
		  System.out.println(arr[i]);
	  }
	  System.out.println("yavav"+arr[2]);
	  
  }
}
