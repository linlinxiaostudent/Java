package day0319;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(-2);
		set.add(10);
		set.add(-5);
		set.forEach(System.out::println);
		//返回比较器，如果使用自然排序，返回Null
//		System.out.println(set.comparator());
		//返回子Set,第一个参数指定起始点（包含），第二个参数指定终止点（不包含）
		SortedSet<Integer> sub = set.subSet(-2, 11);
//		sub.forEach(System.out::println);
		//返回从头到参数指定位置（不包含）的子set
		sub = set.headSet(8);
//		sub.forEach(System.out::println);
		//返回参数指定位置（不包含）到末尾的的子set
		sub = set.tailSet(8);
//		sub.forEach(System.out::println);
		//返回最开头的（最小的）元素
		System.out.println(set.first());
		//返回最尾部的（最大的）元素
		System.out.println(set.last());
		
		
		

	}

}
