package day0330;
/*
 *ClassLoader的loadClass方法与Class的静态forName（一个参数）方法的区别：
 *二者都可以加载一个类型，ClassLoader的loadClass方法加载后不会初始化类
 *Class的静态forName（一个参数）方法加载类型后，会对类型初始化
 *Class的静态forName（三个参数）方法可以有更多的选择
 */
public class ForNameTest {
	public static void main(String[] args) {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			Class<?> c=loader.loadClass("day0330.Student");
			Class<?> c2=Class.forName("day0330.Student");
			Class<?> c3=Class.forName("day0330.Student", false, loader);


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
