package day0331;

public class MultiThread {
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);
		Thread t3 = new Thread(ticket);
		t1.setName("张三");
		t2.setName("李四");
		t3.setName("王五");
		t1.start();
		t2.start();
		t3.start();
	}
}
class Ticket implements Runnable{
	private int num =100;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if(num>0){
					Thread currend = Thread.currentThread();
					System.out.println(currend.getName()+"抢到第"+num+"张票");
					num--;
					}
				else{
					break;
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}