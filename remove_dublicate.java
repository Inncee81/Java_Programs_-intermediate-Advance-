package DANISH_058;
import java.util.Scanner;
public class remove_dublicate {
	public static void main(String[] args) {
		int j;int i;
		int n=8;
		int dub[]=new int[9]; //duplicate
		System.out.println("enter the 8 element of array");
		Scanner input=new Scanner(System.in);
		for( i=0;i<n;i++) {
			
			 dub[i] = input.nextInt();
			
		}
		System.out.print("given array is ");
		for( i=0;i<n;i++) {
			
			 System.out.print(dub[i]+" ");
		
		}
		
		
		for( i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(dub[i]==dub[j]) {
					for(int k=j;k<n;k++) {
						dub[k]=dub[k+1];	
					}
					n--;
					j--;
				}
			}
		}
		
		System.out.println();
		System.out.print("non dublicate array:");
		for( i=0;i<n;i++) {
			
			 System.out.print(dub[i]+" ");
		
		}
	}
}
