package DANISH_058;

class f1 extends Thread{
	public void run() {
		for(int i=1;i<8;i++) {
			System.out.print("*_*-lol-*_*");
			
		}System.out.println(" (exit first) ");
	}
}


class second extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
			System.out.print("+-hehe-+");
			
		}System.out.println(" (exit second)" );
	}
}

class third extends Thread{
	public void run() {
		for(int i=1;i<12;i++) {
			System.out.print("!!=temp=!!");
			
		}System.out.println(" (exit third) ");
	}
}

 class multiple_thread {
	public static void main(String[] args) {
	new f1().start();
		new second().start();
		new third().start();
	}
	}
