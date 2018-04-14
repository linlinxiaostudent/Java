package day0311;

public enum Align implements EnumInter {
	LEFT{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("LEFT一种接口的实现");
		}
		void abs(){
			System.out.println("LEFT实现");
		}
		
	},
	CENTER{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("CENTER一种接口的实现");
		}
		void abs(){
			System.out.println("LEFT实现");
		}
	},
	RIGHT{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("RIGHT一种接口的实现");
		}
		void abs(){
			System.out.println("LEFT实现");
		}
	};
//	@Override
//	public void f() {
//		// TODO Auto-generated method stub
//		System.out.println("一种接口的实现");
//	}	
	abstract void abs();
	public static void main(String[] args) {
		Align [] array = Align.values();
		for(Align a : array){
			System.out.println(a);
			a.f();
			a.abs();
		}
	}

}
interface EnumInter{
	void f();
 }