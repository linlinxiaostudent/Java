package day0320;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListRandom {
	public static void main(String[] args) {
		Set< Integer> set = new TreeSet<>();
		Random r = new Random();
		while(set.size()!=5){
			set.add(r.nextInt(15));
		}
		set.forEach(System.out::println);
	}
}
