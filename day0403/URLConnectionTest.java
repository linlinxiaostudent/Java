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
			//�������Ӳ������Ѿ��������ӵ�Զ�̵���Դ,Ҫ������Զ�̵���Դ����Ҫ����connect����
			con.setDoOutput(true);//�����Ƿ����д�룬Ĭ��Ϊfalse
			con.setDoInput(true);//�����Ƿ���Զ�ȡ��Ĭ��Ϊtrue
			con.connect();
			//�ڻ�ȡ���������ʱ�������������δ����������Զ���������
			//URL��openStream�����ײ����ͨ��URLConnection��getOutputStream��õ�
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
