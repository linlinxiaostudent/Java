package day0320;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	public static void main(String[] args) {
		SortedSet <String> set = new TreeSet<>((a,b)->{
			if(a.length()>b.length()){
				return 1;
			}else if (a.length()<b.length()){
				return -1;
			}else
				return 0;
		});
		set.add("12");
		set.add("234");
		set.add("34567");
		set.add("89");
		set.add("89012");
		set.add("456");
		System.out.println(set);

	}
}
