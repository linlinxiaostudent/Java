package day0327;
//InputStream ¶ÁÈ¡ÎÄ¼þ
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) {
		File file = new File("D:/eclipse/workspace/example/src/day0327/HelloWorld.java");
		try(InputStream input  = new FileInputStream(file);) {
//			InputStream input  = new FileInputStream(file);
			System.out.println(input.available());
//			int b = input.read();
//			while(b != -1){
//				System.out.print((char)(b));
//				b = input.read();
//			}
//			int b;
//			while((b=input.read() )!=-1){
//				System.out.print((char)(b));
//			}
			byte[] data = new byte[10];
			int length;
//			while((length = input.read(data)) !=-1){
////				for(int i=0;i<length;i++){
////					System.out.print((char)(data[i]));
////				}
//				System.out.print(new String(data,0,length));
//			}
//			
			while((length = input.read(data,2,6)) !=-1){
				System.out.print(new String(data,2,length));
			}
//			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
	}
}
