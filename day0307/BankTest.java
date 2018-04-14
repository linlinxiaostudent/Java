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
		System.out.println("存款请输入0，取款请输入1，退出请输入2");
		int x = num.nextInt();
		return x;
	}

	public void Save(){
		Scanner num = new Scanner(System.in);
		System.out.println("请输入要存入的金额：");
		int x1 = num.nextInt();
		this.money+=x1 ;
		System.out.println("您的账户余额为"+this.money);
	}

	public void Draw(){
		Scanner num = new Scanner(System.in);
		System.out.println("请输入你要取出的金额：");
		int x2 = num.nextInt();
		this.money-=x2 ;
		System.out.println("您的账户余额为"+this.money);
	}
	
	public void Quit(){
		System.out.println("请取走你的银行卡");
	}
}

public class BankTest {
	public static void main(String[] args) {
		boolean flag = true;
		Bank person = new Bank();
		System.out.println("您的账户余额为10000元");
		
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
