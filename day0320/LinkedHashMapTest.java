package day0320;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.forEach((k,v)->System.out.println(k+","+v));
		
	}

}
