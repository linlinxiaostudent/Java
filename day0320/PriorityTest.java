package day0320;

import java.util.PriorityQueue;
import java.util.Queue;
/*
 *优先级排序可以采用以下两种方式
 *自然排序
 *使用比较器 
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
		//queue.add(null);错误，不能加入null值
		//System.out.println(queue.poll());
		//queue.forEach(System.out::println);//没有顺序
		while (queue.size()>0) {
			System.out.println(queue.poll());
			
		}
		
	}

}
