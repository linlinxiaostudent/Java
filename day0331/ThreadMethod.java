package day0331;

public abstract class ThreadMethod {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		MissionC c = new MissionC();
		c.start();
		try {
			//���A�߳��е�����B�̵߳�join���޲Σ�������
			//��A�̻߳�һֱ�ȵ�B�߳�ִ�н�����A�̲߳Ż����ִ��
			//c.join();
			//���ȴ�����ָ����ʱ�䣨���룩
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
		//���õ�ǰ�߳��Ƿ�Ϊ��̨�̣߳�trueΪ��̨�̣߳�falseΪǰ̨�߳�
		//JVM��û��ǰ̨�߳�ʱ���˳����÷����������߳�����ǰ����
		c2.setDaemon(true);
		//�����̵߳����ȼ���Java���ṩ��ʮ�����ȼ���
		//���ǣ��ײ�Ĳ���ϵͳδ�ش���ʮ�����ȼ���Java��Ӧ
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