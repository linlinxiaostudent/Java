package day0320;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		//������м���Ԫ�أ�����ɹ�������True������ʧ�ܣ�������쳣
		queue.add(3);
		//������м���Ԫ�أ�����ɹ�������True������ʧ�ܣ�����False
		queue.offer(3);
		//ɾ�����ҷ��ض���ͷ����Ԫ�أ����ʧ�ܣ�������쳣
		System.out.println(queue.remove());
		//ɾ�����ҷ��ض���ͷ����Ԫ�أ����ʧ�ܣ�����False
		System.out.println(queue.poll());
		queue.add(4);
		//���ص���ɾ������ͷ����Ԫ�أ����ʧ�ܣ�������쳣
		System.out.println(queue.element());
		//���ص���ɾ������ͷ����Ԫ�أ����ʧ�ܣ�����False
		System.out.println(queue.peek());
		queue.add(null);//���ܼ���null ������LinkedList�Ǹ�������Ϊ�˼�����
	}
}
