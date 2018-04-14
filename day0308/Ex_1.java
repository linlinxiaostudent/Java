    package day0308;

public class Ex_1 {
	class Inner{
		public void m(){
			System.out.println("Super Inner");
		}
	}
	public void f(){
		System.out.println("Super");
	}
	public static void main(String[] args) {
		Ex_1 e = new SubEx_1();
		e.f();
		Inner i= e.new Inner();
		i.m();
	}

}
class SubEx_1 extends Ex_1{
	class Inner{
		public void m(){
			System.out.println("Sub Inner");
		}
		
	}
	public void f(){
		System.out.println("Sub");
	}
}