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
			System.out.println("CPU���ͺ�"+ CPU+"�ڴ�Ĵ�СΪ"+ memony+"G"+"Ӳ�̵Ĵ�С"+ disk+ "G");
	}
	
	public void Print(boolean x, boolean y,boolean z){
		if(x)
			System.out.println("CPU���ͺ�"+ CPU);
		if(y)
			System.out.println("�ڴ�Ĵ�СΪ"+ memony+"G");
		if(z)
			System.out.println("Ӳ�̵Ĵ�С"+ disk+ "G");
		
	}
	
}

public class ComputerTest {
	public static void main(String[] args){
		Computer a = new Computer ("���i7",4,5000);
		a.Print();
		a.Print(true, false, false);
	}
}
