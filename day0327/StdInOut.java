package day0327;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StdInOut {

	public static void main(String[] args) {
		System.out.println("���������");
		//System.err.println("���������");
		PrintStream p;
		try{
			p = new PrintStream("G:/java/error.txt");
			System.setErr(p);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.err.println("�����������");
	}

}
