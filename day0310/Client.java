package day0310;
import day0306.Person;
public class Client {
	public static void main(String[] args) {
		Person [] persons = new Person[4];
		persons[0]= new Person("张1", 23, 170, 80);
		persons[1]= new Person("张2", 20, 138, 85);
		persons[2]= new Person("张3", 30, 182, 70);			
		persons[3]= new Person("张4", 42, 150, 60);
		Case c= new Case();
		c.deal(persons, 23);
		c.deal2(persons, 25, 40);
		c.deal3(persons, new MyRule());
		c.deal3(persons, new Rule(){
			public boolean test(Person p) {
				return p.getAge()>21  && p.getHeight()>150;
			}
		});
		c.deal3(persons, p->p.getAge()>21  && p.getHeight()>150);
		c.deal4(persons, p->p.getAge()>21  && p.getHeight()>150);
		c.deal5(persons, p->p.getAge()>21  && p.getHeight()>150, new MyOp());
		c.deal5(persons, p->p.getAge()>21  && p.getHeight()>150, new Operation() {
			
			@Override
			public void accept(Person p) {
				System.out.println(p.getName());
				
			}
		});
		c.deal5(persons, p->p.getAge()>21  && p.getHeight()>150,
				p->System.out.println(p.getName()));
		c.deal6(persons, p->p.getAge()>21  && p.getHeight()>150,
				p->System.out.println(p.getName()));
				
	}
}
class MyRule implements Rule{

	@Override
	public boolean test(Person p) {
		/*if (p.getAge()>21  && p.getHeight()>150)
			return true;
		else
			return false;*/
		return p.getAge()>21  && p.getHeight()>150;
	}
	
}
class MyOp implements Operation{

	@Override
	public void accept(Person p) {
		System.out.println(p.getName());
		
	}
	
}