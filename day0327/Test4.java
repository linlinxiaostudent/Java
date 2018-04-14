package day0327;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*合并文件
 * */
public class Test4 {
	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("G:/java/homework/original.txt");
			OutputStream out = new FileOutputStream("G:/java/homework/original1.txt",true);){
			int x;
			while((x=in.read())!=-1){
				out.write(x);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
