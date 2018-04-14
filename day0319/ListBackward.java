package day0319;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListBackward {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		for (int i=0;i<10;i++){
			list.add(r.nextInt(100));
		}
		System.out.println("list的正序是：");
		list.forEach(System.out::println);
		ListIterator<Integer> li2 = list.listIterator(list.size());
		System.out.println("list的逆序是：");
		while(li2.hasPrevious()){
			int x = (int) li2.previous();
			System.out.println(x);
		}
		
	}

}
