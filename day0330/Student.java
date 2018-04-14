package day0330;

public class Student {
	private int id;
	private String name;
	static{
		System.out.println("静态初始化！");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		this.id = 1;
		this.name = "张三";
	}
	private Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
