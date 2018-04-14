package day0310;

public class Lambda {
	public Mobile getMobile(){
		return new Mobile() {
			@Override
			public void call() {
				System.out.println("匿名类打电话");
				
			}
		};
	}
	public Mobile getMobile1(){
		return ()-> System.out.println("Lambda打电话");
	}
	public void test(){
		Generator g = new Generator() {
			
			@Override
			public int get(int x) {
				// TODO Auto-generated method stub
				return x+2;
			}
		};
		Generator g1 = x->x+2;
	}
	public static void main(String[] args) {
		Lambda a= new Lambda();
		Mobile m= a.getMobile();
		m.call();
		Mobile m1= a.getMobile1();
		m1.call();
	}
}

@FunctionalInterface
interface Generator{
	int get(int x);
}
@FunctionalInterface
interface Mobile{
	void call();
}
