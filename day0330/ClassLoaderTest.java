package day0330;

public class ClassLoaderTest {
	public static void main(String[] args) {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			//通过loadClass方法来加载指定的类型(需要指定全限定名)
			Class<?> c=loader.loadClass("day0330.Student");
			//获得该Class的加载器
			System.out.println(loader);
			//获得所用加载的父加载器
			System.out.println(loader.getParent());
			////获得该Class的加载器的类型
			System.out.println(loader.getClass());
			//获得该Class的加载器
			System.out.println(c.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
