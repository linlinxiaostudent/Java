package day0319;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(-2);
		set.add(10);
		set.add(-5);
		set.forEach(System.out::println);
		//���رȽ��������ʹ����Ȼ���򣬷���Null
//		System.out.println(set.comparator());
		//������Set,��һ������ָ����ʼ�㣨���������ڶ�������ָ����ֹ�㣨��������
		SortedSet<Integer> sub = set.subSet(-2, 11);
//		sub.forEach(System.out::println);
		//���ش�ͷ������ָ��λ�ã�������������set
		sub = set.headSet(8);
//		sub.forEach(System.out::println);
		//���ز���ָ��λ�ã�����������ĩβ�ĵ���set
		sub = set.tailSet(8);
//		sub.forEach(System.out::println);
		//�����ͷ�ģ���С�ģ�Ԫ��
		System.out.println(set.first());
		//������β���ģ����ģ�Ԫ��
		System.out.println(set.last());
		
		
		

	}

}
