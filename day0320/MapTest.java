package day0320;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("a", 3);
		System.out.println(map.get("a"));

	}
}
