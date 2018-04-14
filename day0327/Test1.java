package day0327;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/*通过流完成指定文件的复制与剪切，分别使用字节流操作二进制文件，字符流操作文本文件。
 * */
public class Test1 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("G:/java/homework/in.txt");
		OutputStream out = new FileOutputStream("G:/java/homework/out.txt");){
			int b;
			while((b=in.read())!=-1){
				out.write(b);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(Reader r = new FileReader("G:/java/homework/reader.txt");
		Writer w = new FileWriter("G:/java/homework/writer.txt");){
			int b;
			while((b=r.read())!=-1){
				w.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File f = new File("G:/java/homework/reader.txt");
		f.delete();
	}

}
