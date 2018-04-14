package day0403;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Download {
	public static void main(String[] args) {	
		try {
			URL url=new URL("https://www.baidu.com/img/bd_logo1.png?where=super");
			try(InputStream in = url.openStream();
					OutputStream out = new FileOutputStream("d:/baidu.png");){
				byte[] data = new byte[20];
				int length;
				while((length= in.read(data))!=-1){
					out.write(data, 0, length);
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
