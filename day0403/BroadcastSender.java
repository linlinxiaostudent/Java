package day0403;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Random;

public class BroadcastSender {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			while(true){
				byte [] data = getData();
				InetAddress ip = InetAddress.getByName("255.255.255.255");
				DatagramPacket dp = new DatagramPacket(data, data.length, ip, 8000);
				ds.send(dp);
				System.out.println(new String(data));
				Thread.sleep(1000);
			}
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static byte[] getData(){
		StringBuilder s = new StringBuilder();
		Random r = new Random();
		for (int i=0;i<10;i++){
			s.append((char)(65+r.nextInt(26)));
		}
		return s.toString().getBytes();
	}

}
