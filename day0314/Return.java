package day0314;

public class Return {
	public static int get() {
		try {
			return 1;
		} finally {
			return 2;
		} 
		
	}
	public static void main(String[] args) {
		System.out.println(get());
	}
}
