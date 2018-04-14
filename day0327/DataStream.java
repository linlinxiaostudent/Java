package day0327;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStream {

	public static void main(String[] args) {
		//write();
		read();
	}
	public static void write() {
		try(OutputStream out = new FileOutputStream("G:/java/data.txt");
		DataOutputStream dout = new DataOutputStream(out);){
			for(int i=0;i<3;i++){
				dout.writeInt(i);
				dout.writeFloat(i*2.0f);
				dout.writeUTF("字符串");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void read() {
		try(InputStream in = new FileInputStream("G:/java/data.txt");
		DataInputStream din = new DataInputStream(in);){
			while(true){
				int x = din.readInt();
				float f = din.readFloat();
				String s = din.readUTF();
				System.out.println(x+","+f+","+s);
			}
		}catch (EOFException e) {
			System.out.println("数据读取完毕，捕获异常");
			//e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
