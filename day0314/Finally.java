package day0314;

import javax.crypto.NullCipher;

public class Finally {
	public static void main(String[] args) {
		try {
//			int x=5;
//			int y=0;
//			System.out.println(x/y);
			String s = null;
			s.length();
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("Ö´ÐÐ£¡");
		}
	}
}
