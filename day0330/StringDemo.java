package day0330;

import java.lang.reflect.Field;

public class StringDemo {
	public static void main(String[] args) {
		String s = new String("12345");
		Class<?> c = s.getClass();
		try {
			Field f = c.getDeclaredField("value");
			f.setAccessible(true);
			char[] value = (char[])f.get(s);
			value[0]='a';
			System.out.println(s);
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
