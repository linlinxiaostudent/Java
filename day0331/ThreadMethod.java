package day0331;

public abstract class ThreadMethod {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		MissionC c = new MissionC();
		c.start();
		try {
			//如果A线程中调用了B线程的join（无参）方法，
			//则A线程会一直等到B线程执行结束，A线程才会继续执行
			//c.join();
			//最多等待参数指定的时间（毫秒）
			c.join(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i =10;i<20;i++){
			System.out.println(t.getName()+":"+i);
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		MissionC c2 = new MissionC();
		//设置当前线程是否为后台线程，true为后台线程，false为前台线程
		//JVM当没用前台线程时会退出，该方法必须在线程启动前设置
		c2.setDaemon(true);
		//设置线程的优先级，Java中提供了十个优先级，
		//但是，底层的操作系统未必存在十个优先级与Java对应
		c2.setPriority(Thread.MAX_PRIORITY);
	}

}
class MissionC extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++){
			System.out.println(getName()+":"+i);
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}