package day0317;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		List <String> list = new ArrayList<>();
		list.add("abc");
		t.f(list);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		t.f(list2);
		Test2 t2 = new Test2();
		t2.f(list);
		t2.f(list2);
		
	}
	public void f(List<?> list) {
		// TODO Auto-generated method stub
		System.out.println(list);

	}

}
class Test2{
	public <E> void f(List<E> list){
		System.out.println(list);
	}
}
