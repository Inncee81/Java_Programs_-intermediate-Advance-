package DANISH_058;

class userexp extends Exception{
	public String toString() {
		return("exception:avg greater than 50");
	}
}


public class exeptionquestion {
public static void main(String[] args) {
	int a=23,b=54,c=87;
	try {
		int d=(a+b+c)/3;
		if(d>50) {
			throw(new userexp());
		}
	}
	catch (userexp e){
		System.out.println(e);
	}	
	
}
}
