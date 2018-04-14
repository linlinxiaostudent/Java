package day0319;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethod {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(1);
		c.add(3);
		System.out.println(c);
//		System.out.println(c.size());
//		System.out.println(c.isEmpty());
//		System.out.println(c.contains(2));
		Iterator<Integer> iterator = c.iterator();
		Object [] obj = c.toArray();
//		System.out.println(Arrays.toString(obj));
		Integer [] intArray = new Integer[c.size()];
		Integer [] rntArray = c.toArray(intArray);
//		System.out.println(Arrays.toString(rntArray));
		Collection<Integer> c2 = new ArrayList<>();
		c2.add(1);
		c2.add(2);
//		System.out.println(c2);
//		System.out.println(c.containsAll(c2));
//		System.out.println(c.addAll(c2));
//		System.out.println(c);
//		System.out.println(c.removeAll(c2));
//		System.out.println(c);
//		c.removeIf(t->t>2);
//		System.out.println(c);
//		c.removeAll(c2);
//		System.out.println(c);
		c.clear();
		System.out.println(c);

		
	}

}
