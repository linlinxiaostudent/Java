package day0320;

import java.util.PriorityQueue;
import java.util.Queue;
/*
 *���ȼ�������Բ����������ַ�ʽ
 *��Ȼ����
 *ʹ�ñȽ��� 
  */
public class PriorityTest {
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		queue.add(5);
		queue.add(-2);
		queue.add(3);
		queue.add(-199);
		queue.add(230);
		queue.add(323);
		queue.add(-19);
		//queue.add(null);���󣬲��ܼ���nullֵ
		//System.out.println(queue.poll());
		//queue.forEach(System.out::println);//û��˳��
		while (queue.size()>0) {
			System.out.println(queue.poll());
			
		}
		
	}

}
