package day0331;

public class DeadLock {
	public static void main(String[] args) {
		Fighter f1 = new Fighter("����");
		Fighter f2 = new Fighter("����");
		Thread t1 = new Thread(() -> f1.hold(f2));
		Thread t2 = new Thread(() -> f2.hold(f1));
		t1.start();
		t2.start();
	}

}

class Fighter {
	private String name;

	public Fighter(String name) {
		this.name = name;
	}

	public synchronized void hold(Fighter f) {
		System.out.println(name + "ץס��" + f.name);
		System.out.println(name + "�ȴ�" + f.name + "����");
		f.loose(this);
		this.loose(f);
	}

	public synchronized void loose(Fighter f) {
		System.out.println(name + "�ɿ���" + f.name);
	}
}