package day0331;

public class Yield {
	public static void main(String[] args) {
		ThreadA t = new ThreadA();
		t.start();
		for(int i=10;i<20;i++){
			System.out.println(i);
			if(i==16){
				Thread.yield();  
			}
		}
	}
}
class ThreadA extends Thread{

	@Override
	public void run() {
		for (int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	
}