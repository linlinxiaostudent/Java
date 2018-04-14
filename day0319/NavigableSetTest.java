package day0319;
import java.util.Iterator;
/*
 * NavigableSet��SortSet���ӽӿڣ����ṩ�˸��Ӿ�׼��λ����ط���
 * */
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(-2);
		set.add(10);
		set.add(-5);
		//����С�ڲ���������Ԫ�أ���������ڣ�����null
//		System.out.println(set.lower(-2));
		//����С�ڵ��ڲ���������Ԫ�أ���������ڣ�����null
//		System.out.println(set.floor(-2));
		//���ش��ڲ���������Ԫ�أ���������ڣ�����null
//		System.out.println(set.higher(2));
		//���ش��ڵ��ڲ���������Ԫ�أ���������ڣ�����null
//		System.out.println(set.ceiling(2));
		//ɾ��������set�е�һ��Ԫ�أ���С�ģ�����������ڣ�����null
//		System.out.println(set.pollFirst());
		//ɾ��������set�е�һ��Ԫ�أ���С�ģ�����������ڣ�����null
//		System.out.println(set.pollLast());
		//���ؽ������е�Set
		NavigableSet<Integer> dec = set.descendingSet();
		//���ؽ���ĵ�����
//		Iterator<Integer> i= set.descendingIterator();
//		i.forEachRemaining(System.out::println);
		//������Set,��2������ָ���Ƿ������ʼ�㣬��4������ָ���Ƿ������ֹ��
		NavigableSet<Integer> sub = set.subSet(-2, true, 10, true);
//		Iterator<Integer> i= sub.iterator();
//		i.forEachRemaining(System.out::println);
		//���ش�ͷ��ʼ����1��������β����Set���ڶ������������Ƿ������ֹ��
		sub = set.headSet(10, true);
		System.out.println(sub);
		
		//���شӵ�1������ָ����λ�ã�����β����Set���ڶ������������Ƿ������ֹ��
		sub = set.tailSet(2,true);
		System.out.println(sub);
		
		
			
	}

}
