package day0330;

public class CreateObject {
	public static void main(String[] args) {
		Object o = create("day0330.Student");
		if( o instanceof Student){
			Student s = (Student)o;
		}
		
	}
	public static Object create(String name){
		try {
			Class<?> c = Class.forName(name);
			Object O = c.newInstance();
			return O;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
