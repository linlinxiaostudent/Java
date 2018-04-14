package day0308;

public class InstanceInner {
	int x=2;
	class Inner{
		public void f(){
			Inner i = new Inner();
			return i;
		}
	}
	
	public static void main(String[] args) {
		InstanceInner ii = new InstanceInner();
		Inner i = ii.new Inner();
		//Inner i = new Inner();
		InstanceInner.Inner i2 = new InstanceInner().new Inne();
	}
}
