package day0319;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Traverse {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			c.add(i);
			// c.add(Integer.valueOf(i));
		}
		//1�� ʹ��Iteratorԭʼ���������Iterator����ʼָ��Ϊ��һ��Ԫ��֮ǰ
		Iterator<Integer> i = c.iterator();
		// �ж��Ƿ�����һ��Ԫ�أ����������һ��Ԫ�أ�����True,���򷵻�False
		while (i.hasNext()) {
			// ������һ��Ԫ�أ�ͬʱ����ǰ�ƶ�ָ��λ��
			Integer item = i.next();
//			System.out.println(item);
			// ��ʹ�õ�����Iterator��������Ԫ��ʱ�����ͨ������Ԫ���޸�Ԫ�أ�
			// �ͻᷢ���쳣��ConcurrentModificationException�쳣��
			// c.remove(item)
			// �����Ҫ��ȫ��ɾ��Ԫ�أ�����ʹ��Iterator�ṩ��remove������
			// i.remove();
		}
		//2�� ʹ��Iterator�����ķ���
		i = c.iterator();
		//i.forEachRemaining(t->System.out.println(t));
//		i.forEachRemaining(System.out::println);
		//3��ʹ��foreach����
		for(Integer item:c){
//			System.out.println(item);
		}
		//4��ʹ��forEach��������
//		c.forEach(System.out::println);
		//5��ʹ�þۺϲ�������
		c.stream().forEach(System.out::println);



	}

}
