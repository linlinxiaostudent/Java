package day0403;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UClient {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			byte[] data = "客户端发送数据".getBytes();
			InetAddress ip = InetAddress.getByName("127.0.0.1");
			DatagramPacket dp = new DatagramPacket(data,data.length,ip,8003);
			ds.send(dp);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
