package day0327;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy2 {
	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("D:/eclipse/workspace/example/src/day0327/HelloWorld.java");
				OutputStream out = new FileOutputStream("D:/eclipse/workspace/example/src/day0327/HelloWorldCopy2.java");){
//			int b;
//			while((b = in.read())!=-1){
//				out.write(b);
//			}
			byte [] data = new byte[10];
			int length;
			while((length = in.read(data))!=-1){
				out.write(data, 0, length);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
