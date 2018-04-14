package day0327;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

/*查看Scanner的构造器，使用Scanner读取文件的内容，并输出（要求使用两种构造器）
 * */
public class Test3 {
	public static void main(String[] args) {
		try(Reader r = new FileReader("G:/java/homework/original.txt");){
			Scanner sc = new Scanner(r);
			while (sc.hasNext()) {
				String str =sc.next();
				System.out.println(str);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
