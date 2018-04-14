package day0327;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PrintWriter;

public class Transform {

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("G:/java/1.txt");
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
//			br.readLine();
			
			OutputStream out = new FileOutputStream("G:/java/4.txt");
			OutputStreamWriter osw = new OutputStreamWriter(out);
//			BufferedWriter bw = new  BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(osw);
			
			String line = null;
			while((line = br.readLine())!=null){
				//bw.write(line);
				pw.println(line);
			}
//			bw.flush();
			br.close();
//			bw.close();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
