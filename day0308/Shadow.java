package day0308;

public class Shadow {
	int x=3;
	class Inner{
		int x=2;
		public void f(){
			int x=1;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Shadow.this.x);
		}
	}
	public static void main(String[] args) {
		Inner i = new Shadow().new Inner();
		i.f();
	}
}
