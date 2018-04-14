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
		//s.hasNextLine();判断是否还有下一行
		//s.hasNextInt() 判断输入的是否是整数  
		//scan.nextInt() ; 接收整数  
	}

}
