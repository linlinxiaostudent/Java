package day0307;

class  JavaTeacher{
	private String name;
	private String group;
	public JavaTeacher(String name, String group) {
		this.name = name;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void introduce(){
		System.out.println("���ҽ��ܣ�" + name+ " "+ group);
	}
	public void teach(){
		System.out.println("�򿪼��±�");
		System.out.println("�������");
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");
		
	}
}

class JapanTracher{
	private String name;
	private String group;
	public JapanTracher(String name, String group) {
		this.name = name;
		this.group = group;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public void introduce(){
		System.out.println("���ҽ��ܣ�" + name+ " "+ group);
	}
	public void teach(){
		System.out.println("��������");
		System.out.println("������");
		System.out.println("֪ʶ�㽲��");
		System.out.println("�ܽ�����");	
	}
}

public class TeacherDemo {
	public static void main(String[] args) {
		JavaTeacher a = new JavaTeacher("����ʦ", "JavaС��");
		JapanTracher b = new JapanTracher("����ʦ", "JapanС��");
		a.introduce();
		a.teach();
		b.introduce();
		b.teach();
	}
}
