package day0320;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 *¾ÛºÏ²Ù×÷£º
 **/
public class AgOp {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		for (int i=0;i<10;i++){
			c.add(i);
		}
		//c.stream().filter(e->e>5).forEach(System.out::println);
		Collection<Student> c1 = new ArrayList<>();
		for (int i=0;i<10;i++){
			c1.add(new Student(i%4, "Ãû×Ö"+i));
		}
		//c1.stream().map(s-> new Teacher(s.getId(), s.getName())).forEach(System.out::println);
		//c1.stream().map(Student::getId).forEach(System.out::println);
		//System.out.println(c1.stream().mapToInt(Student::getId).sum());
		//c1.stream().mapToInt(Student::getId).distinct().forEach(System.out::println);
		//c1.stream().distinct().forEach(System.out::println);
		//c1.stream().distinct().sorted((s1,s2)->(Integer.valueOf(s2.getId()))
		//		.compareTo(s1.getId())).forEach(System.out::println);
		//c1.stream().mapToInt(Student::getId).distinct().peek(System.out::println).forEach(System.out::println);
//		c.stream().limit(5).forEach(System.out::println);
		//c.stream().skip(3).forEach(System.out::println);
//		System.out.println(c1.stream().mapToInt(Student::getId).max().getAsInt());
//		System.out.println(c1.stream().mapToInt(Student::getId).min().getAsInt());
//		System.out.println(c1.stream().mapToDouble(Student::getId).average().getAsDouble());
//		System.out.println(c1.stream().mapToInt(Student::getId).sum());
//		System.out.println(c1.stream().mapToInt(Student::getId).count());
//		int sum = c1.stream().mapToInt(Student::getId).reduce(Integer::sum).getAsInt();
//		System.out.println(sum);
		
//		int max = c1.stream().mapToInt(Student::getId).reduce(Math::max).getAsInt();
//		System.out.println(max);
//		
//		int min = c1.stream().mapToInt(Student::getId).reduce(Math::min).getAsInt();
//		System.out.println(min);
//		String jion = c1.stream().map(Student::getName).reduce(String::concat).get();
//		System.out.println(jion);
		List<Student> list = c1.stream().filter(s->s.getId()<3).collect(Collectors.toList());
		list.forEach(System.out::println);
		StringBuilder s =c1.stream().map(Student::getName)
				.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
		System.out.println(s);

	}

}
class Teacher{
	private int id;
	private String name;
	public Teacher(int id, String name) {
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
	public String toString() {
		// TODO Auto-generated method stub
		return "Teacher[id="+id+",name="+name+"]";
	}
}
class Student{
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
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[id="+id+",name="+name+"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
