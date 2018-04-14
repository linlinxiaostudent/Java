package day0320;

import java.util.ArrayList;
import java.util.Collection;

public class ForEach {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		for (int i=0;i<99;i++){
			c.add(i);
		}
		//c.forEach(System.out::println);
		//c.stream().forEach(System.out::println);
		c.stream().filter(e-> e>50).forEach(System.out::println);
		//System.out.println(c.size());
	}
}
