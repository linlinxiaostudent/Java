package day0320;

import java.util.Deque;
import java.util.LinkedList;

public class DequeMethod {
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		//向队列头部加入元素，如果操作失败，会产生异常
		q.addFirst(1);
		//向队列尾部加入元素，如果操作失败，会产生异常
		q.addLast(2);
		//向队列头部加入元素，如果操作失败，不会产生异常,返回false
		q.offerFirst(3);
		//向队列尾部加入元素，如果操作失败，不会产生异常,返回false
		q.offerLast(4);
		//删除并返回队列头部的元素，如果操作失败，会产生异常
		q.removeFirst();
		//删除并返回队列尾部的元素，如果操作失败，会产生异常
		q.removeLast();
		//删除并返回队列头部的元素，如果操作失败，不会产生异常，返回null
		q.pollFirst();
		//删除并返回队列尾部的元素，如果操作失败，不会产生异常，返回null
		q.pollLast();
		q.addFirst(6);
		//获取但是不删除队列头部的元素，如果操作失败，会产生异常
		q.getFirst();
		//获取但是不删除队列尾部的元素，如果操作失败，会产生异常
		q.getLast();
		//获取但是不删除队列头部的元素，如果操作失败，不会产生异常，返回null
		q.peekFirst();
		//获取但是不删除队列尾部的元素，如果操作失败，不会产生异常，返回null
		q.peekLast();
		//删除队列中首次出现的参数指定的元素，删除成功返回true，否则返回false
		q.removeFirstOccurrence(2);
		//删除队列中末次出现的参数指定的元素，删除成功返回true，否则返回false
		q.removeLastOccurrence(3);
		//压栈，相当于addFirst
		q.push(5);
		//出栈，相当于removeFirst
		q.pop();
	}

}
