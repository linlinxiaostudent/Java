package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLStream {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			 InputStream in = url.openStream();
			 BufferedReader br = new  BufferedReader(new InputStreamReader(in));
			 String s;
			 while((s= br.readLine())!=null){
				 System.out.println(s);
			 }
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
