package day0314;

import java.util.Scanner;

public class CountTest {
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
		if(x==0||x==1||x==2){
			return x;

		}else
			throw  new IllegalArgumentException("���벻��"+x);
		
	}

	public void Save(){
		Scanner num = new Scanner(System.in);
		System.out.println("������Ҫ����Ľ�");
		int x1 = num.nextInt();
		if(x1<=0){
			throw  new IllegalArgumentException("���������Ϊ��"+x1);
		}
		this.money+=x1 ;
		System.out.println("�����˻����Ϊ"+this.money);
	}

	public void Draw(){
		Scanner num = new Scanner(System.in);
		System.out.println("��������Ҫȡ���Ľ�");
		int x2 = num.nextInt();
		if(x2<0){
			throw  new IllegalArgumentException("����ȡ�����Ϊ��"+x2);
		}
		if(x2>this.money){
			throw  new IllegalArgumentException("����ȡ����ܳ�����"+x2);
		}
		this.money-=x2 ;
		System.out.println("�����˻����Ϊ"+this.money);
	}
	
	public void Quit(){
		System.out.println("��ȡ��������п�");
	}
}

	
