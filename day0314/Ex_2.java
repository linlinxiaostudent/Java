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
				System.out.println("������˼�����ˣ�");
			}
			else{
				System.out.println("������˼��С�ˣ�");
			}
			value = scanner.nextInt();
		}
		scanner.close();
		System.out.println("��ϲ�����¶��ˣ�");
	}
}
