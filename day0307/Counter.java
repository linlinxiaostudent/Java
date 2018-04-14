package day0307;

public class Counter {
	public static int num =0;

	public Counter() {
		num++;
		System.out.println("num=" +num);
	}
	public static void main(String[] args) {
		Counter c [] = new Counter[5];
		for (int i =0; i<c.length;i++)
		{
			c[i] =  new Counter();
		}
	}
	

}
