package day0319;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(2);
		set.add(50);
		set.forEach(System.out::println);
		SortedSet<Integer> set1 = new TreeSet<>((a,b)->b.compareTo(a));
		set1.add(100);
		set1.add(2);
		set1.add(50);
		set1.forEach(System.out::println);


	}

}
