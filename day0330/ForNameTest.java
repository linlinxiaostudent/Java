package day0330;
/*
 *ClassLoader��loadClass������Class�ľ�̬forName��һ������������������
 *���߶����Լ���һ�����ͣ�ClassLoader��loadClass�������غ󲻻��ʼ����
 *Class�ľ�̬forName��һ�������������������ͺ󣬻�����ͳ�ʼ��
 *Class�ľ�̬forName���������������������и����ѡ��
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
