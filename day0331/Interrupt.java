package day0331;
/*
 * InterruptedException������ԭ��
 * ��A�̵߳���sleep��join��wait���ڵȴ��У������ʱ�����߳��ж��˴��ڵȴ���A�̣߳�
 * ��A�̻߳����InterruptedException�쳣�����A�߳�û�õ���sleep��join��wait��
 * ���ʱ�����������߳��ж�Ҳ�������InterruptedException�쳣��
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
		//�жϸ��߳�
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