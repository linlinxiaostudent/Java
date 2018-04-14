package day0317;

import java.util.ArrayList;
import java.util.List;

public class SetList<E> {
	private List<E> list;

	public SetList(List<E> list) {
		super();
		this.list = list;
	}
	public List<E> getList() {
		return list; 
	}
	public void setList(List<E> list) {
		this.list = list;
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		SetList<Integer> self = new SetList<>(list);
		list.add(1);
		list.add(2);
		list.add(3);
		//System.out.println(list);
		 System.out.println(self.list.get(0));//

	}
	

}
