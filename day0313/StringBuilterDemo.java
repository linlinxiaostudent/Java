package day0313;
/*
 *String 类是重写了Object类中的equals,所以只要要求两者字符序列相等，即内容相等，
 *而==必须要求对象地址相等才会返回True
 * StringBuilder类没用重写了Object类中的equals，所以equals和==相等，
 * 只有当对象地址相同才会返回True
 */
public class StringBuilterDemo {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("abc");
		StringBuilder s2 = new StringBuilder("abc");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
		String s3 = new String("def");
		String s4 = new String("def");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		
		String s5 = "ghi";
		String s6 = "ghi";
		System.out.println(s5.equals(s6));
		System.out.println(s5==s6);
		

	}

}
