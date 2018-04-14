package day0306;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
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
	public Person(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString(){
		return "Preson [name=" + name +",age="+ age + ",height="+height+",weight="+weight+"]";
	}
	public static void mkFriend(Person p1,Person p2){
		System.out.println(p1.name+"与"+p2.name +"交朋友");
	}
	public void mkFriend2(Person p){
		System.out.println(this.name+"与"+p.name +"交朋友");
	}

}

