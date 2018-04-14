package day0327;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Append {
	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("G:/java/1.txt",true);){
			out.write(66);
			out.write(67);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
