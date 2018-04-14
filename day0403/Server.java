package day0403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9001);
			Socket socket = server.accept();
			Read t = new Read(socket);
			Write w = new Write(socket);
			t.start();
			w.start();
			
			
			//socket.close();
			//server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
class Read extends Thread{
	private Socket socket;
	public Read(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String s= null;
			while((s= br.readLine())!=null){
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
class Write extends Thread{
	private Socket socket;

	public Write(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			PrintWriter pw = new  PrintWriter(socket.getOutputStream(),true);
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNextLine()){
				pw.println(scanner.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
