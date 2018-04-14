package day0403;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMethod {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://127.0.0.1:8900/local/file.html?page=2");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getFile());
			System.out.println(url.getRef());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
