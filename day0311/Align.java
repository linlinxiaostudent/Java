package day0311;

public enum Align implements EnumInter {
	LEFT{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("LEFTһ�ֽӿڵ�ʵ��");
		}
		void abs(){
			System.out.println("LEFTʵ��");
		}
		
	},
	CENTER{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("CENTERһ�ֽӿڵ�ʵ��");
		}
		void abs(){
			System.out.println("LEFTʵ��");
		}
	},
	RIGHT{
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("RIGHTһ�ֽӿڵ�ʵ��");
		}
		void abs(){
			System.out.println("LEFTʵ��");
		}
	};
//	@Override
//	public void f() {
//		// TODO Auto-generated method stub
//		System.out.println("һ�ֽӿڵ�ʵ��");
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