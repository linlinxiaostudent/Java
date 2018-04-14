package day0331;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProduceConsume2 {
	public static void main(String[] args) {
		Worker2 w =new Worker2();
		Thread t1 = new Thread(()->
		{
			for(int i =0;i<100;i++){
			w.produce();
			}
		});
		Thread t2 = new Thread(()->
		{
			for(int i =0;i<100;i++){
			w.consume();
			}
		});
		t1.start();
		t2.start();
		
	}
}
class Worker2{
	private List<String> list = new ArrayList<>();
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public  void produce(){
		try{
			lock.lock();
			if(list.size()==3){
				System.out.println("仓库已满，生产阻塞！");
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				list.add("生产中！");
				condition.signalAll();
			}
		}finally {
			lock.unlock();
		}
		
	}
	public  void consume(){
		try{
			lock.lock();
			if(list.size()==0){
				System.out.println("仓库已空，消费阻塞！");
				try {
					condition.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				list.remove(0);
				condition.signalAll();
				}
		}finally {
			lock.unlock();
		}
		
		
	}
}
