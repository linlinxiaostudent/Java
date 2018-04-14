package day0403;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Reciever {

	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket(8000);
			InetAddress ip = InetAddress.getByName("224.0.0.2");
			ms.joinGroup(ip);
			while(true){
				byte[] data = new byte[11];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				ms.receive(dp);
				//System.out.println(new String(dp.getData(),0,dp.getLength()));
				System.out.println(new String(dp.getData(),0,dp.getLength()));

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
