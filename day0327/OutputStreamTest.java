package day0327;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//OutputStream��д���ļ�
public class OutputStreamTest {
	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("G:/java/1.txt");){
			out.write(65);
			byte [] data = {65,66,67};
			out.write(data);
			out.write(data, 0, 2);
			String s = "����д��һ������";
			out.write(s.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
