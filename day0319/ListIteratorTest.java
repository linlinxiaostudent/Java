package day0319;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		ListIterator<Integer> i = list.listIterator();
		// ListIterator<Integer> i = list.listIterator(list.size());
		// while(i.hasPrevious()){
		// System.out.println(i.previous());
		// }
		// ������һ��Ԫ�ص�������������next��������Ԫ�ص�����
		// System.out.println(i.nextIndex());
		// ����ǰһ��Ԫ�ص�������������previous��������Ԫ�ص�����
		// System.out.println(i.previousIndex());
		// ɾ�����һ�ε���next����previous���ص�Ԫ��,
		//���ø÷���֮ǰ�������һ��next����previous����
//		System.out.println(list);
//		i.next();
//		i.remove();
//		System.out.println(list);
		//�����һ�ε���next����previous���ص�Ԫ���滻Ϊ����ָ����Ԫ��
		//���ø÷���֮ǰ�������һ��next����previous����
		System.out.println(list);
		System.out.println(i.next());
		
		i.set(5);
		System.out.println(list);
		
		
		
		//�ڵ�ǰָ��λ��֮ǰ�����Ӳ���ָ����Ԫ�أ��÷����Ե���next����û��Ӱ��
		//������õ�ʱprevious���������صĽ���������Ԫ��
//		System.out.println(list);
//		System.out.println(i.next());
//		System.out.println(i.next());
//		i.add(99);
//		//System.out.println(i.next());
//		System.out.println(i.previous());

	}

}
