package day0320;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethod {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(5, 20);
		map.put(1, 30);
		map.put(2, 50);
		//����map�м�ֵ�Ե�����
		System.out.println(map.size());
		//�жϼ�ֵ���Ƿ�Ϊ��
		System.out.println(map.isEmpty());
		//�жϵ�ǰmap���Ƿ��в���ָ����key��������ڣ�����true�����򷵻�false
		System.out.println(map.containsKey(5));
		//�жϵ�ǰmap���Ƿ��в���ָ����value��������ڣ�����true�����򷵻�false
		System.out.println(map.containsValue(20));
		//���ز���ָ���ļ����󶨵�ֵ�����ָ���ļ���key�������ڣ��򷵻�null
		System.out.println(map.get(1));
		//����һ���ֵ�ԣ����ز���key֮ǰ���󶨵�value
		System.out.println(map.put(5, 15));
		//ɾ��һ���ֵ�ԣ����ز���key֮ǰ���󶨵�value
		System.out.println(map.remove(5));
		
		Map<Integer,Integer> map2 = new HashMap<>();
		map2.put(111, 222);
		map.put(333, 444);
		//������map�е����м�ֵ�����뵱ǰmap��
		map.putAll(map2);
		System.out.println(map);
		Set<Integer> set = map.keySet();
		//System.out.println(set);
		set.forEach(System.out::println);
		Collection<Integer> c = map.values();
		//System.out.println(c);
		c.forEach(System.out::println);
		Set<Map.Entry<Integer, Integer>> set1 = map.entrySet();
		System.out.println(set1.size());
	}
}
