package day0314;

public class Ex {
//	public void f(int x){
//		System.out.println("f(x)");
//	}
//	public void f(int ...x) {
//		System.out.println("f(int ...x)");
//	}
//	public void f(Integer x) {
//		System.out.println("f(Integer x)");
//	}
	public void f(Integer ...x) {
		System.out.println("f(Integer ...x)");
	}
	public static void main(String[] args) {
		Ex e = new Ex();
		e.f(1);
	}
}
