package day0320;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		SortedMap<Integer,Integer> map = new TreeMap<>();
		map.put(2, 20);
		map.put(5, 50);
		map.put(1, 10);
		map.forEach((k,v)->System.out.println(k+","+v));
	}
}
