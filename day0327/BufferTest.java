package day0327;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class BufferTest {
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("G:/java/1.txt");
			BufferedReader br = new BufferedReader(r);
			Writer w = new FileWriter("G:/java/2.txt");
//			BufferedWriter bw = new BufferedWriter(w);
			PrintWriter pw = new PrintWriter(w);
			String line =null;
			while((line = br.readLine())!=null){
				pw.println(line);
			}
//			bw.write("写入一点数据！");
//			bw.flush();
//			String line =null;
//			while((line = br.readLine())!=null){
//				bw.write(line);
//			}
//			bw.flush();
			br.close();
//			bw.close();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
