package day0313;
/*
 *String ������д��Object���е�equals,����ֻҪҪ�������ַ�������ȣ���������ȣ�
 *��==����Ҫ������ַ��ȲŻ᷵��True
 * StringBuilder��û����д��Object���е�equals������equals��==��ȣ�
 * ֻ�е������ַ��ͬ�Ż᷵��True
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
