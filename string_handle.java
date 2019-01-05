package DANISH_058;
import java.util.Scanner;
public class string_handle {

	public static void main(String args[]) {
		System.out.println("enter the string");
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println("Given string is : "+s);
		
		System.out.println("string length is : "+find_length(s));
		System.out.println("By replace vowels with r the output string is: "+replace_vowels(s));
		System.out.println("Total no of words in a text is :"+total_word(s));
		
	}

	private static int total_word(String s) {
		String f=s.trim();
		int count=1;
		for(int i=0;i<f.length();i++) {
			if(f.charAt(i)==' ') {
				count++;
			}
		}
		return count;
	}

	private static String replace_vowels(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' ) {
				return s.replace(s.charAt(i),'r');
			}
			
		}
		return s;
		
	}

	private static int find_length(String s) {
		return s.length();
		
	}
}
