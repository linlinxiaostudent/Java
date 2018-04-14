package day0331;

public class Test2 {
	public static void main(String[] args) {
		SetDemo s1 = new SetDemo();
		s1.setName("œﬂ≥Ã“ª");
		s1.setDaemon(true);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s1.start();
	}
}
class SetDemo extends Thread{

	@Override
	public void run() {
		while(true){
			System.out.println(getName());
		}
	}
	
}