
package DANISH_058;
import java.util.Scanner;
public class search {
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
		System.out.println("");
		System.out.println("enter the element to search");
		int e=input.nextInt();
		System.out.println("press: '1' for linear_search and press: '2' for binary_search");
		
		int in=input.nextInt();
		if(in==1) {
			linear_search(e,n,arr);
		}
		else if(in==2) {
			binary_search(e,n,arr);
			
		}
	}

	private static void binary_search(int e,int n,int arr[]) {
		
		int swap;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
					
				}
			}
			}
		System.out.println("sorted list is :");
		for(int  i=0;i<n;i++) {
			
			 System.out.print(arr[i]+" ");
		
		}
		System.out.println("");
		int beg=0,end=n-1;
		int k= binary_s(e,beg,end,arr);
		 System.out.println("index value of item is "+k);
		

	
	}
	
	public static int binary_s(int e,int beg,int end,int arr[]) {
		
		int mid=(beg+end)/2;
		
		
		if(e==arr[mid]) {
			//System.out.println(mid);
			return mid;
		}
		else if(e<arr[mid]) {
			
			return binary_s(e, beg, mid-1, arr);
			
		}
		else  {
			
			return binary_s( e,mid+1, end, arr);
		}
		
		}
		
	

	private static void linear_search(int e,int n,int arr[]) {
		int flag = 0;
		int j = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==e) {
				flag=1;
				 j=i;
				break;
			}
			else {flag=0;
				
			}
		}
		if(flag==1) {System.out.println("element index is "+j);}
		else {System.out.println("element not found");}
	}

	
}
