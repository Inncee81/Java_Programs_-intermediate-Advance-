package DANISH_058;

public class change {
	public static void main(String[] args) {
		String s="Hello My Name Is XYZ";
		System.out.print(s.charAt(0));
		int j=0;
		char[] ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ' ) {
				ch[j]=s.charAt(i+1);
				j++;
			}
		}
		System.out.println(ch);
	}
}
