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
		System.out.println("自我介绍：" + name+ " "+ group);
	}
	public void teach(){
		System.out.println("打开记事本");
		System.out.println("输入代码");
		System.out.println("知识点讲解");
		System.out.println("总结提问");
		
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
		System.out.println("自我介绍：" + name+ " "+ group);
	}
	public void teach(){
		System.out.println("打开日语书");
		System.out.println("读单词");
		System.out.println("知识点讲解");
		System.out.println("总结提问");	
	}
}

public class TeacherDemo {
	public static void main(String[] args) {
		JavaTeacher a = new JavaTeacher("张老师", "Java小组");
		JapanTracher b = new JapanTracher("李老师", "Japan小组");
		a.introduce();
		a.teach();
		b.introduce();
		b.teach();
	}
}
