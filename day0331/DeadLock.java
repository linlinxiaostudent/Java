package day0331;

public class DeadLock {
	public static void main(String[] args) {
		Fighter f1 = new Fighter("张三");
		Fighter f2 = new Fighter("李四");
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
		System.out.println(name + "抓住了" + f.name);
		System.out.println(name + "等待" + f.name + "松手");
		f.loose(this);
		this.loose(f);
	}

	public synchronized void loose(Fighter f) {
		System.out.println(name + "松开了" + f.name);
	}
}