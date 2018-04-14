package day0317;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.id-id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [id=]"+id+",name ="+"name"+"]";

	}
}
