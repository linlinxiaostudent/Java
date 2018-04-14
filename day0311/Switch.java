package day0311;

public class Switch {
	public static void main(String[] args) {
		Align a =Align.CENTER;
		switch (a) {
		case LEFT:
			System.out.println("左对齐");
			break;
		case CENTER:
			System.out.println("居中对齐");
			break;
		case RIGHT:
			System.out.println("右对齐");
			break;

		}
	}
}
