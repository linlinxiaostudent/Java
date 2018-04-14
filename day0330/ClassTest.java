package day0330;

public class ClassTest {
	public static void main(String[] args) {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		String name = "day0330.Student";
		try {
			Class<?> c=loader.loadClass(name);
			Class<?> c2=Class.forName(name);
			Class<Student> c3 = Student.class;
			Student s = new Student();
			Class<? extends Student> c4 = s.getClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
