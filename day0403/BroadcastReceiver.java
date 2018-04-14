package day0403;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class BroadcastReceiver {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(8000);			
			while(true){
				byte[] data = new byte[11];
				DatagramPacket dp = new DatagramPacket(data, data.length);
				ds.receive(dp);
				//System.out.println(new String(dp.getData(),0,dp.getLength()));
				System.out.println(new String(dp.getData(),0,dp.getLength()));

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
