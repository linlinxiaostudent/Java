package day0319;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(100);
		list.add(1);
		list.add(50);
		System.out.println(list);
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(3);
		// System.out.println(list2);
		// �����������е�����Ԫ�ز��뵽��ǰ����ָ����λ��Ԫ��֮ǰ
		// list.addAll(2,list2);
		// System.out.println(list);
		// �滻list�е�ÿ��Ԫ�ص�ֵ
		// list.replaceAll(t->t+10);
		// System.out.println(list);
		// ��listʵ�����򣬴���һ���Ƚ����������Ҫ��Ȼ���򴫵�nullֵ
		// list.sort(null);//����
		// list.sort((a,b)->b-a);//����
		// System.out.println(list);
		// ���ز���ָ����λ�ã���������Ԫ��
		// System.out.println(list.get(3));
		// ���ز���ָ����λ��Ԫ�أ�ʹ�õڶ������������滻
		// list.set(1, -50);
		// System.out.println(list);
		// ���ڶ���Ԫ��ָ����Ԫ�ز��뵽��һ������ָ����λ��֮ǰ
		// list.add(1, 200);
		// System.out.println(list);
		// ɾ��ָ��λ�õ�Ԫ��
		// list.remove(2);
		// System.out.println(list);
		// ���ز���Ԫ�����ȳ��ֵ�λ�ã����û�г��֣�����-1
		// System.out.println(list.indexOf(100));
		// ���ز���Ԫ��ĩ�γ��ֵ�λ�ã����û�г��֣�����-1
		// System.out.println(list.lastIndexOf(1));
		// ����list���еĵ��������õ�����������ǰ��������ʼָ��λ��Ϊ��һ��Ԫ��֮ǰ
		ListIterator<Integer> i = list.listIterator();
		// ������ʾָ���ʼλ�ã���ʼλ��Ϊ����ָ������Ԫ�ص�λ��֮ǰ
		i = list.listIterator(1);
		// �´ε���next����Ԫ�ص�λ��
		// ����list����һ������ָ����ʼ�㣨���������ڶ�������ָ����ֹ�㣨��������
		List<Integer> sub = list.subList(0, 2);
		System.out.println(sub);

	}

}
