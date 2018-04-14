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
				Thread.sleep(100);//���ߣ�������״̬���̲߳���õ�ִ�У���ָ��ʱ������̻߳����´��ھ���״̬
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