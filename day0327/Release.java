package day0327;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Release {
	public static void main(String[] args) {
//		InputStream in= null;
//		try{
//			in = new FileInputStream("G:/java/1.txt");
//		}catch (FileNotFoundException e ) {
//			e.printStackTrace();
//		}finally {
//			if (in != null){
//				try{
//					in.close();
//				}catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		try (InputStream in = new FileInputStream("G:/java/1.txt");){	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		
	}

}
