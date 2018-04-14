package day0319;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
//		System.out.println(set.add(1));
//		System.out.println(set.add(2));
//		System.out.println(set.add(1));
		Set<String> set1 = new HashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.forEach(System.out::println);


		
	}

}
