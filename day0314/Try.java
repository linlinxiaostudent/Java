package day0314;

public class Try {
	public static void main(String[] args) {
		try{
			int x=5;
			int y=0;
			System.out.println(x/y);
			System.out.println("不能得到执行！");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("可以执行！");
	}

}
