package day0313;

/*
 * StringBuilter��StringBuffer������
 * StringBuilter�Ƿ��̰߳�ȫ�ģ�StringBuffer���̰߳�ȫ�ġ�
 * ����Ӧ�����ȿ���ʹ��StringBuilter���������ϣ�StringBuilter����StringBuffer��
 * 
 * String��StringBuilter��StringBuffer��������
 * String�Ƿǿɱ��࣬��String���е�һ�в�����û���޸�ԭ�е�String����
 * ���Ǵ����µ�String���󣬶�StringBuilter��StringBuffer���ǿɱ��࣬��
 * StringBuilter��StringBuffer�����еĲ��������޸�ԭ�еĶ��󣬶�û�ô����µĶ���
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
		//��StringBuilter�����޸ĵķ���������this������Ϊ���ܹ������ǽ�����ʽ�ĵ���
		
	}

}
