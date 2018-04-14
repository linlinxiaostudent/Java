package day0308;

public class ShortCircuit {
	public static void main(String[] args) {
		int y=0;
		boolean x = 5>10 && (y=5<3 ? 12:13)>12;
		System.out.println(x);
		if (y==0)
			System.out.println("y的初始值为0，现在还是0，说明发生了短路现象");
	}
}
