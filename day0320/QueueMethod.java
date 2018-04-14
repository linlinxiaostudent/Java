package day0320;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//向队列中加入元素，如果成功，返回True，加入失败，会产生异常
		queue.add(3);
		//向队列中加入元素，如果成功，返回True，加入失败，返回False
		queue.offer(3);
		//删除并且返回队列头部的元素，如果失败，会产生异常
		System.out.println(queue.remove());
		//删除并且返回队列头部的元素，如果失败，返回False
		System.out.println(queue.poll());
		queue.add(4);
		//返回但不删除队列头部的元素，如果失败，会产生异常
		System.out.println(queue.element());
		//返回但不删除队列头部的元素，如果失败，返回False
		System.out.println(queue.peek());
		queue.add(null);//不能加入null ，但是LinkedList是个特例，为了兼容性
	}
}
