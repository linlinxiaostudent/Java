package day0313;

import java.util.Scanner;

public class ScannreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String  token = s.next();
			if (token.equals("exit")){
				break;
			}
		}
		s.close();
		//s.hasNextLine();�ж��Ƿ�����һ��
		//s.hasNextInt() �ж�������Ƿ�������  
		//scan.nextInt() ; ��������  
	}

}
