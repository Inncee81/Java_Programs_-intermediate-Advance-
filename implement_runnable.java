package DANISH_058;

class f2 implements Runnable{
	public void run() {
		for(int i=1;i<8;i++) {
			System.out.print("*_*-lol-*_*");
			
		}System.out.println(" (exit first) ");
	}
}


class s2 implements Runnable{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.print("+-hehe-+");
			
		}System.out.println(" (exit second)" );
	}
}

class t2 implements Runnable{
	public void run() {
		for(int i=1;i<12;i++) {
			System.out.print("!!=temp=!!");
			
		}System.out.println(" (exit third) ");
	}
}


public class implement_runnable {
	public static void main(String[] args) {
		new Thread(new f2()).start();
		new Thread(new s2()).start();
		new Thread(new t2()).start();
	}
}
