package day0320;

import java.util.Deque;
import java.util.LinkedList;

public class DequeMethod {
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		//�����ͷ������Ԫ�أ��������ʧ�ܣ�������쳣
		q.addFirst(1);
		//�����β������Ԫ�أ��������ʧ�ܣ�������쳣
		q.addLast(2);
		//�����ͷ������Ԫ�أ��������ʧ�ܣ���������쳣,����false
		q.offerFirst(3);
		//�����β������Ԫ�أ��������ʧ�ܣ���������쳣,����false
		q.offerLast(4);
		//ɾ�������ض���ͷ����Ԫ�أ��������ʧ�ܣ�������쳣
		q.removeFirst();
		//ɾ�������ض���β����Ԫ�أ��������ʧ�ܣ�������쳣
		q.removeLast();
		//ɾ�������ض���ͷ����Ԫ�أ��������ʧ�ܣ���������쳣������null
		q.pollFirst();
		//ɾ�������ض���β����Ԫ�أ��������ʧ�ܣ���������쳣������null
		q.pollLast();
		q.addFirst(6);
		//��ȡ���ǲ�ɾ������ͷ����Ԫ�أ��������ʧ�ܣ�������쳣
		q.getFirst();
		//��ȡ���ǲ�ɾ������β����Ԫ�أ��������ʧ�ܣ�������쳣
		q.getLast();
		//��ȡ���ǲ�ɾ������ͷ����Ԫ�أ��������ʧ�ܣ���������쳣������null
		q.peekFirst();
		//��ȡ���ǲ�ɾ������β����Ԫ�أ��������ʧ�ܣ���������쳣������null
		q.peekLast();
		//ɾ���������״γ��ֵĲ���ָ����Ԫ�أ�ɾ���ɹ�����true�����򷵻�false
		q.removeFirstOccurrence(2);
		//ɾ��������ĩ�γ��ֵĲ���ָ����Ԫ�أ�ɾ���ɹ�����true�����򷵻�false
		q.removeLastOccurrence(3);
		//ѹջ���൱��addFirst
		q.push(5);
		//��ջ���൱��removeFirst
		q.pop();
	}

}
