package day0330;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class SecurityManagerTest {
	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager());
		Class<Student> c = Student.class;
		try {
			Constructor<Student> con = c.getConstructor(int.class,String.class);
			Student s = con.newInstance(10,"’≈Àƒ");
			Field  f = c.getDeclaredField("id");
			f.setAccessible(true);
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
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}
}
