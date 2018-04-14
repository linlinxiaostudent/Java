package day0331;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThread1 {
	public static void main(String[] args) {
		Ticket1 ticket1 = new Ticket1();
		Thread t1 = new Thread(ticket1);
		Thread t2 = new Thread(ticket1);
		Thread t3 = new Thread(ticket1);
		t1.setName("����");
		t2.setName("����");
		t3.setName("����");
		t1.start();
		t2.start();
		t3.start();
	}
}
class Ticket1 implements Runnable{
	private int num =100;
	private Lock lock = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			try {
				lock.lock();
					if(num>0){
						Thread currend = Thread.currentThread();
						System.out.println(currend.getName()+"������"+num+"��Ʊ");
						num--;
						}
					else{
						break;
					}
			} finally {
				lock.unlock();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
	
}