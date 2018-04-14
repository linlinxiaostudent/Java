package day0330;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorTest {

	public static void main(String[] args) {
		Class<Student> c = Student.class;
		try {
			Constructor<Student> con = c.getConstructor(int.class,String.class);
			Student s = con.newInstance(1,"李四");
			System.out.println(s.getId()+","+s.getName());
			Constructor<Student> con1 = c.getDeclaredConstructor(Integer.class,String.class);
			con1.setAccessible(true);
			Student s1 = con1.newInstance(2,"王五");
			System.out.println(s1.getId()+","+s1.getName());
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
