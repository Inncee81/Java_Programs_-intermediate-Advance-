package DANISH_058;

interface demo{
	public int mul(int i,int j);
	
}
interface remo{
	
}

 class interface_Minheritence implements demo,remo{

	
	public int mul(int i,int j) {
		return i*j;
		
	}

	
	public int sum(int i,int j) {
		return i+j;
		
	}
	
	public static void main(String[] args) {
		int i=10;int j=5;
		demo inter= new interface_Minheritence();//use interface_Minheritence class memory for creating demo class object
		interface_Minheritence obj=new interface_Minheritence();
		System.out.println("multiplication "+inter.mul(i, j));
		System.out.println("addition "+obj.sum(i, j));
		remo ofj=new interface_Minheritence();
		
	}

}
