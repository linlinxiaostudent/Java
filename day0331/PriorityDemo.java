package day0331;

public class PriorityDemo {
	public static void main(String[] args) {
		Priority p1 = new Priority();
		Priority p2 = new Priority();
		
		p1.setName("线程一");
		p2.setName("线程二");
		p1.setPriority(Thread.MAX_PRIORITY);
		p1.start();
		p2.start();
		p1.yield();
		
		
		
	}
}
class Priority extends Thread{

	@Override
	public void run() {
		System.out.println(getName());
	}
	
}