package day0319;
import java.util.Iterator;
/*
 * NavigableSet是SortSet的子接口，其提供了更加精准定位的相关方法
 * */
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.add(2);
		set.add(-2);
		set.add(10);
		set.add(-5);
		//返回小于参数中最大的元素，如果不存在，返回null
//		System.out.println(set.lower(-2));
		//返回小于等于参数中最大的元素，如果不存在，返回null
//		System.out.println(set.floor(-2));
		//返回大于参数中最大的元素，如果不存在，返回null
//		System.out.println(set.higher(2));
		//返回大于等于参数中最大的元素，如果不存在，返回null
//		System.out.println(set.ceiling(2));
		//删除并返回set中第一个元素（最小的），如果不存在，返回null
//		System.out.println(set.pollFirst());
		//删除并返回set中第一个元素（最小的），如果不存在，返回null
//		System.out.println(set.pollLast());
		//返回降序排列的Set
		NavigableSet<Integer> dec = set.descendingSet();
		//返回降序的迭代器
//		Iterator<Integer> i= set.descendingIterator();
//		i.forEachRemaining(System.out::println);
		//返回子Set,第2个参数指定是否包含起始点，第4个参数指定是否包含终止点
		NavigableSet<Integer> sub = set.subSet(-2, true, 10, true);
//		Iterator<Integer> i= sub.iterator();
//		i.forEachRemaining(System.out::println);
		//返回从头开始到第1个参数结尾的子Set。第二个参数控制是否包含终止点
		sub = set.headSet(10, true);
		System.out.println(sub);
		
		//返回从第1个参数指定的位置，到结尾的子Set。第二个参数控制是否包含终止点
		sub = set.tailSet(2,true);
		System.out.println(sub);
		
		
			
	}

}
