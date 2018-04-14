package day0307;

class Computer{
	private String CPU;
	private int memony;
	private int disk;
	public Computer(String cPU, int memony, int disk) {
		this.CPU = cPU;
		this.memony = memony;
		this.disk = disk;
	}
	public void Print(){
			System.out.println("CPU的型号"+ CPU+"内存的大小为"+ memony+"G"+"硬盘的大小"+ disk+ "G");
	}
	
	public void Print(boolean x, boolean y,boolean z){
		if(x)
			System.out.println("CPU的型号"+ CPU);
		if(y)
			System.out.println("内存的大小为"+ memony+"G");
		if(z)
			System.out.println("硬盘的大小"+ disk+ "G");
		
	}
	
}

public class ComputerTest {
	public static void main(String[] args){
		Computer a = new Computer ("酷睿i7",4,5000);
		a.Print();
		a.Print(true, false, false);
	}
}
