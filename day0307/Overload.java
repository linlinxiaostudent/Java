package day0307;

class Animal{
	public void m(){
		System.out.println("Animal �޲�");
	}
}

class Tiger extends Animal{
	public void m(){
		System.out.println("Tiger �޲�");
	}
	
	public void m(int x ){
		System.out.println("Tiger һ������");
	}
	
	public void m(int x, int y){
		System.out.println("Tiger ��������");
	}
}

public class Overload {
	public static void main(String[] args) {
		Animal a = new Tiger();
		a.m();
		//a.m(10);//�޷�����
		//a.m(10,5);//�޷�����
	}
}
