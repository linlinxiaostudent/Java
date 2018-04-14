package day0331;

public class Test1 {
	public static void main(String[] args) {
		ThreadPrint t1 = new ThreadPrint();
		ThreadPrint t2 = new ThreadPrint();
		ThreadPrint t3 = new ThreadPrint();
		t1.setName("线程一");
		t2.setName("线程二");
		t3.setName("线程三");
		t1.start();
		t2.start();
		t3.start();
		
	}
}

class ThreadPrint extends Thread{
	private int x =10;

	@Override
	public void run() {
		while(true){
			if(x>0){
				System.out.println(Thread.currentThread().getName()+"的第"+x+"数");
				x--;
			}
			else{
				break;
			}
			
		}
	}
	
}