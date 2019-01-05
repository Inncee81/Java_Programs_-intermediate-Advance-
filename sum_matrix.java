package DANISH_058;
import java.util.Scanner;
public class sum_matrix {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("1 : enter the 9 element for 3*3 matric array");
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arr3[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		System.out.println("2 : enter the 9 element for 3*3 matric array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		
		System.out.print("first matrix :");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]);
			}
		}
		System.out.println("");
		System.out.print("second matrix :");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]);
			}
		}
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("");
		System.out.println("added matrix :");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr3[i][j]+"\t");
				
			}System.out.println("");
		}
		
	}
}
