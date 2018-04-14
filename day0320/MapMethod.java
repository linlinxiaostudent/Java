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
		//返回map中键值对的数量
		System.out.println(map.size());
		//判断键值对是否为空
		System.out.println(map.isEmpty());
		//判断当前map中是否含有参数指定的key，如果存在，返回true，否则返回false
		System.out.println(map.containsKey(5));
		//判断当前map中是否含有参数指定的value，如果存在，返回true，否则返回false
		System.out.println(map.containsValue(20));
		//返回参数指定的键所绑定的值，如果指定的键（key）不存在，则返回null
		System.out.println(map.get(1));
		//加入一组键值对，返回参数key之前所绑定的value
		System.out.println(map.put(5, 15));
		//删除一组键值对，返回参数key之前所绑定的value
		System.out.println(map.remove(5));
		
		Map<Integer,Integer> map2 = new HashMap<>();
		map2.put(111, 222);
		map.put(333, 444);
		//将参数map中的所有键值都加入当前map中
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
