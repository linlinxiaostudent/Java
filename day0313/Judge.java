package day0313;
import java.util.Scanner;
public class Judge {
	
	public static  boolean isNumber(String str) {
		for(int i=0;i<str.length();i++){
			char chr = str.charAt(i);
			if(chr<48||chr>57){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("������һ�����֣�");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(Judge.isNumber(str)){
			System.out.println("����ȫ������");
		}
		else
		{
			System.out.println("���벻ȫ������");
		}
		sc.close();
	}

}
