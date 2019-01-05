package DANISH_058;
import java.util.Scanner;
public class sort {
	public static void main(String[] args) {
		System.out.println("enter the 8 element of array");
		 int arr[]=new int[9];
		Scanner input=new Scanner(System.in);
		int i,n=8;
		for( i=0;i<n;i++) {
			
			 arr[i] = input.nextInt();
			
		}
		System.out.print("given array is ");
		for( i=0;i<n;i++) {
			
			 System.out.print(arr[i]+" ");
		
		}
		
		
		int swap;
		for( i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
					
				}
			}
			}
		System.out.println("");
		System.out.print("sorted list is : ");
		for(  i=0;i<n;i++) {
			
			 System.out.print(arr[i]+" ");
		
		}
	}
}
