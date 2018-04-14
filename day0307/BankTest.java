package day0307;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

class Bank {
	private int money;

	public Bank() {
		this.money = 10000;
	}

	public Bank(int money) {
		this.money = money;
	}

	public int Begin() {
		Scanner num = new Scanner(System.in);
		System.out.println("���������0��ȡ��������1���˳�������2");
		int x = num.nextInt();
		return x;
	}

	public void Save(){
		Scanner num = new Scanner(System.in);
		System.out.println("������Ҫ����Ľ�");
		int x1 = num.nextInt();
		this.money+=x1 ;
		System.out.println("�����˻����Ϊ"+this.money);
	}

	public void Draw(){
		Scanner num = new Scanner(System.in);
		System.out.println("��������Ҫȡ���Ľ�");
		int x2 = num.nextInt();
		this.money-=x2 ;
		System.out.println("�����˻����Ϊ"+this.money);
	}
	
	public void Quit(){
		System.out.println("��ȡ��������п�");
	}
}

public class BankTest {
	public static void main(String[] args) {
		boolean flag = true;
		Bank person = new Bank();
		System.out.println("�����˻����Ϊ10000Ԫ");
		
		while (flag) {
			int number = person.Begin();
			if (number == 0)
				person.Save();
			else if (number == 1)
				person.Draw();
			else
				//person.Quit();
				flag = false;
		}
	}
}
