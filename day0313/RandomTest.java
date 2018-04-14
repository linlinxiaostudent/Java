package day0313;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(30));
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
	}
}
