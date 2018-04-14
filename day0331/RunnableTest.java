package day0331;

public class RunnableTest {
	public static void main(String[] args) {
		Mission m = new Mission();
		Thread t = new Thread(m);
		t.start();
		
	}
}
class Mission implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}