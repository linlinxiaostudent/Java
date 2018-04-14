package day0319;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add("four");
		set1.add("five");
		set1.forEach(System.out::println);
		}

}

