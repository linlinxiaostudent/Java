package day0331;

import java.util.ArrayList;
import java.util.List;

public class ProduceConsume {
	public static void main(String[] args) {
		Worker w =new Worker();
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
class Worker{
	private List<String> list = new ArrayList<>();
	public synchronized void produce(){
		if(list.size()==3){
			System.out.println("�ֿ�����������������");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			list.add("�����У�");
			notifyAll();
		}
		
	}
	public synchronized void consume(){
		if(list.size()==0){
			System.out.println("�ֿ��ѿգ�����������");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			list.remove(0);
			notifyAll();
		}
	}
}