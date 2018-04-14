package day0319;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			list.add(i);
		}
		ListIterator<Integer> i = list.listIterator();
		// ListIterator<Integer> i = list.listIterator(list.size());
		// while(i.hasPrevious()){
		// System.out.println(i.previous());
		// }
		// 返回下一个元素的索引，即调用next方法返回元素的索引
		// System.out.println(i.nextIndex());
		// 返回前一个元素的索引，即调用previous方法返回元素的索引
		// System.out.println(i.previousIndex());
		// 删除最后一次调用next或者previous返回的元素,
		//调用该方法之前必须调用一次next或者previous方法
//		System.out.println(list);
//		i.next();
//		i.remove();
//		System.out.println(list);
		//将最后一次调用next或者previous返回的元素替换为参数指定的元素
		//调用该方法之前必须调用一次next或者previous方法
		System.out.println(list);
		System.out.println(i.next());
		
		i.set(5);
		System.out.println(list);
		
		
		
		//在当前指针位置之前，增加参数指定的元素，该方法对调用next方法没有影响
		//如果调用的时previous方法，返回的将是新增的元素
//		System.out.println(list);
//		System.out.println(i.next());
//		System.out.println(i.next());
//		i.add(99);
//		//System.out.println(i.next());
//		System.out.println(i.previous());

	}

}
