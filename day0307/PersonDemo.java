package day0307;

class Person {
	private String name;
	private int height;
	private int weight;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show(){
		System.out.println(getName() + " " + getAge() + "岁" + "身高"+getHeight() +"cm"+"体重" + getWeight()+"kg");
	}
}
 public class PersonDemo{
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("胡歌");
		p.setAge(25);
		p.setHeight(185);
		p.setWeight(75);
		p.show();
	}
}
