package day0320;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverse {
	public static void main(String[] args) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 2);
		map.put(3, 4);
		map.put(5, 6);
		//1��ʹ��keyset����
		Set<Integer> set = map.keySet();
		set.forEach(k-> System.out.println(k+","+ map.get(k)));
		//2��ʹ��Map.Entry����
		Set<Map.Entry<Integer, Integer>> set2 = map.entrySet();
		set2.forEach(e->System.out.println(e.getKey()+","+e.getValue()));
		//3��ʹ��foreach����
		map.forEach((k,v)->System.out.println(k+","+v));

	}
}
