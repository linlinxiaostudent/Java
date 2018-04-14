package day0319;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethod {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(100);
		list.add(1);
		list.add(50);
		System.out.println(list);
		List<Integer> list2 = new ArrayList<>();
		list2.add(20);
		list2.add(3);
		// System.out.println(list2);
		// 将参数集合中的所有元素插入到当前集合指定的位置元素之前
		// list.addAll(2,list2);
		// System.out.println(list);
		// 替换list中的每个元素的值
		// list.replaceAll(t->t+10);
		// System.out.println(list);
		// 对list实现排序，传递一个比较器，如果想要自然排序传递null值
		// list.sort(null);//升序
		// list.sort((a,b)->b-a);//降序
		// System.out.println(list);
		// 返回参数指定的位置（索引）的元素
		// System.out.println(list.get(3));
		// 返回参数指定的位置元素，使用第二个参数进行替换
		// list.set(1, -50);
		// System.out.println(list);
		// 将第二个元素指定的元素插入到第一个参数指定的位置之前
		// list.add(1, 200);
		// System.out.println(list);
		// 删除指定位置的元素
		// list.remove(2);
		// System.out.println(list);
		// 返回参数元素首先出现的位置，如果没有出现，返回-1
		// System.out.println(list.indexOf(100));
		// 返回参数元素末次出现的位置，如果没有出现，返回-1
		// System.out.println(list.lastIndexOf(1));
		// 返回list特有的迭代器，该迭代器可以向前遍历，初始指针位置为第一个元素之前
		ListIterator<Integer> i = list.listIterator();
		// 参数表示指针初始位置，初始位置为参数指定索引元素的位置之前
		i = list.listIterator(1);
		// 下次调用next返回元素的位置
		// 返回list，第一个参数指定起始点（包含），第二个参数指定终止点（不包含）
		List<Integer> sub = list.subList(0, 2);
		System.out.println(sub);

	}

}
