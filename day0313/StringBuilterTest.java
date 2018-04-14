package day0313;

/*
 * StringBuilter和StringBuffer的区别：
 * StringBuilter是非线程安全的，StringBuffer是线程安全的。
 * 我们应该优先考虑使用StringBuilter，在性能上，StringBuilter优于StringBuffer。
 * 
 * String和StringBuilter（StringBuffer）的区别：
 * String是非可变类，对String进行的一切操作都没有修改原有的String对象，
 * 而是创建新的String对象，而StringBuilter（StringBuffer）是可变类，对
 * StringBuilter（StringBuffer）进行的操作都是修改原有的对象，而没用创建新的对象。
 * */

public class StringBuilterTest {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdef");
		System.out.println(s);
		s.insert(3, 123);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.capacity());
		System.out.println(s.toString());
		s.delete(2, 5);
		System.out.println(s);
		s.append("123456");
		System.out.println(s);
		//对StringBuilter进行修改的方法都返回this，这是为了能够让我们进行链式的调用
		
	}

}
