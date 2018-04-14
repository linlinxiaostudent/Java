package day0327;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		File f = new File("G:/java/1.txt");
		try{
			f.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
