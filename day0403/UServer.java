package day0403;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UServer {

	public static void main(String[] args) {
			try {
				//�����׽���
				DatagramSocket  ds = new DatagramSocket(8003);
				byte[] data = new byte[100];
				//�������ݰ�
				DatagramPacket dp = new DatagramPacket(data, data.length);
				//�������ݱ�
				ds.receive(dp);
				dp.getData();
				System.out.println(new String(dp.getData(),0,dp.getLength() ));
			} catch (SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}

}
