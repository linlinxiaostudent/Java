package day0314;

import java.util.Random;
import java.util.Scanner;
public class Ex_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		Random r = new Random();
		int digit = r.nextInt(100)+1;
		while(value!=digit){
			if(value>digit){
				System.out.println("不好意思，大了！");
			}
			else{
				System.out.println("不好意思，小了！");
			}
			value = scanner.nextInt();
		}
		scanner.close();
		System.out.println("恭喜您，猜对了！");
	}
}
