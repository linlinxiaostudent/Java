package day0330;

public class ClassLoaderTest {
	public static void main(String[] args) {
		ClassLoader loader = ClassLoader.getSystemClassLoader();
		try {
			//ͨ��loadClass����������ָ��������(��Ҫָ��ȫ�޶���)
			Class<?> c=loader.loadClass("day0330.Student");
			//��ø�Class�ļ�����
			System.out.println(loader);
			//������ü��صĸ�������
			System.out.println(loader.getParent());
			////��ø�Class�ļ�����������
			System.out.println(loader.getClass());
			//��ø�Class�ļ�����
			System.out.println(c.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
