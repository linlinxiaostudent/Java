package day0307;

class Animal{
	public void m(){
		System.out.println("Animal 无参");
	}
}

class Tiger extends Animal{
	public void m(){
		System.out.println("Tiger 无参");
	}
	
	public void m(int x ){
		System.out.println("Tiger 一个参数");
	}
	
	public void m(int x, int y){
		System.out.println("Tiger 两个参数");
	}
}

public class Overload {
	public static void main(String[] args) {
		Animal a = new Tiger();
		a.m();
		//a.m(10);//无法访问
		//a.m(10,5);//无法访问
	}
}
