package day0319;

import java.util.ArrayList;
import java.util.List;

public class AddDemo {
	public static void main(String[] args) {
		List< Person> list = new ArrayList<>();
		Person [] p = new Person[5];
		for(int i =0;i<p.length;i++){
			p[i] = new Person("Ãû×Ö"+(i+1),i+7);
			if(p[i].getAge()<10){
				list.add(p[i]);
			}
		}
		System.out.println(list);
	}

}

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age -o.age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[name="+name + ",age=" + age + "]";
	}
	
	
}