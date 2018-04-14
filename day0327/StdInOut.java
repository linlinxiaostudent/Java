package day0327;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class StdInOut {

	public static void main(String[] args) {
		System.out.println("正常输出！");
		//System.err.println("错误输出！");
		PrintStream p;
		try{
			p = new PrintStream("G:/java/error.txt");
			System.setErr(p);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.err.println("错误流的输出");
	}

}
