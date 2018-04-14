package day0327;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*读取硬盘上的某个文件，实现对文件的简单加密和解密
 * */
public class Test2 {
	public static void main(String[] args) {
		File file = new File("G:/java/homework");
		file.mkdirs();
		int b;
		try(InputStream in = new FileInputStream("G:/java/homework/original.txt");
		OutputStream out = new FileOutputStream("G:/java/homework/encode.txt");){
			System.out.print("加密前：  ");
			while((b=in.read())!=-1){
				System.out.print(b+" ");
				out.write(b^2);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	
		try(InputStream in = new FileInputStream("G:/java/homework/encode.txt");
				OutputStream out = new FileOutputStream("G:/java/homework/decode.txt");){
					System.out.print("加密后：  ");
					while((b=in.read())!=-1){
						System.out.print(b+" ");
						out.write(b^2);
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
		System.out.println();
		try(InputStream in = new FileInputStream("G:/java/homework/decode.txt")){
					System.out.print("解密后：  ");
					while((b=in.read())!=-1){
						System.out.print(b+" ");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}

}
