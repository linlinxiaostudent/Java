package day0403;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");
			URLConnection con = url.openConnection();
			//返回链接不代表已经进行链接到远程的资源,要想链接远程的资源，需要调用connect方法
			con.setDoOutput(true);//设置是否可以写入，默认为false
			con.setDoInput(true);//设置是否可以读取，默认为true
			con.connect();
			//在获取输入输出流时，如果该连接尚未建立，则会自动建立连接
			//URL的openStream方法底层就是通过URLConnection的getOutputStream获得的
			OutputStream out = con.getOutputStream();
			InputStream in = con.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String s;
			while((s= br.readLine())!=null){
				System.out.println(s);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
