package day0327;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test5 {

	public static void main(String[] args) {
		File file = new File("G:/java/homework");
		file.mkdirs();
		int b;
		try(InputStream in = new FileInputStream("G:/java/homework/original.txt")){

			while((b=in.read())!=-1){
				System.out.print(b+" ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
