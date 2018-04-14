package day0330;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
	public static void main(String[] args) {
		Class<Student> c = Student.class;
		try {
			Constructor<Student> con = c.getConstructor(int.class,String.class);
			Student s = con.newInstance(10,"����");
			Method n = c.getMethod("setId", int.class);
			//������þ�̬���������һ�����������ö��󣩿��Դ����κ�ֵ��
			n.invoke(s, 30);
			Method m = c.getMethod("getId");
			Object o = m.invoke(s);
			System.out.println(o);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
