package day0319;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Traverse {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			c.add(i);
			// c.add(Integer.valueOf(i));
		}
		//1、 使用Iterator原始方法，获得Iterator，初始指针为第一个元素之前
		Iterator<Integer> i = c.iterator();
		// 判断是否含有下一个元素，如果存在下一个元素，返回True,否则返回False
		while (i.hasNext()) {
			// 返回下一个元素，同时，向前移动指针位置
			Integer item = i.next();
//			System.out.println(item);
			// 在使用迭代器Iterator遍历集合元素时，如果通过集合元素修改元素，
			// 就会发生异常（ConcurrentModificationException异常）
			// c.remove(item)
			// 如果想要安全的删除元素，可以使用Iterator提供的remove方法。
			// i.remove();
		}
		//2、 使用Iterator新增的方法
		i = c.iterator();
		//i.forEachRemaining(t->System.out.println(t));
//		i.forEachRemaining(System.out::println);
		//3、使用foreach方法
		for(Integer item:c){
//			System.out.println(item);
		}
		//4、使用forEach方法遍历
//		c.forEach(System.out::println);
		//5、使用聚合操作方法
		c.stream().forEach(System.out::println);



	}

}
