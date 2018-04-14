package day0331;

public class ThreadTest {
	public static void main(String[] args) {
		MissionA a = new MissionA();
		MissionB b = new MissionB();
		a.start();
		b.start();
	}
}
class MissionA extends Thread{

	@Override
	public void run() {
		for(int i =0;i<10;i++){
			System.out.println(getName()+":"+i);
			try {
				Thread.sleep(100);//休眠，在休眠状态的线程不会得到执行，当指定时间过后，线程会重新处于就绪状态
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MissionB extends Thread{

	@Override
	public void run() {
		for(int i =10;i<20;i++){
			System.out.println(getName()+":"+i);
		}
	}
	
}