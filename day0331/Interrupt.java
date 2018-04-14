package day0331;
/*
 * InterruptedException产生的原因：
 * 当A线程调用sleep，join或wait处于等待中，如果此时其他线程中断了处于等待的A线程，
 * 则A线程会产生InterruptedException异常，如果A线程没用调用sleep，join或wait，
 * 则此时就算呗其他线程中断也不会产生InterruptedException异常。
 */
public class Interrupt {
	public static void main(String[] args) {
		InterThread inter = new InterThread();
		inter.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//中断该线程
		inter.interrupt();
	}
}
class InterThread extends Thread{

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}