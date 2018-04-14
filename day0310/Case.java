package day0310;

import java.util.function.Consumer;
import java.util.function.Predicate;

import day0306.Person;

public class Case {
	public void deal(Person [] persons,int age){
		for (Person p : persons){
			if(p.getAge()==age)
				System.out.println(p.toString());
		}
	}
	public void deal2(Person [] persons,int minAge,int maxAge){
		for (Person p : persons){
			int age=p.getAge(); 
			if(age>=minAge && age<=maxAge)
				System.out.println(p.toString());
		}
	}
	public void deal3 (Person [] persons,Rule rule){
		for (Person p : persons){
			if(rule.test(p))
				System.out.println(p.toString());
		}
	}
	public void deal4 (Person [] persons,Predicate<Person> pre){
		for (Person p : persons){
			if(pre.test(p))
				System.out.println(p.toString());
		}
	}
	
	public void deal5 (Person [] persons,Rule rule,Operation op){
		for (Person p : persons){
			if(rule.test(p))
				op.accept(p);
		}
	}
	public void deal6 (Person [] persons,Predicate<Person> pre,Consumer<Person> consumer){
		for (Person p : persons){
			if(pre.test(p))
				consumer.accept(p);
		}
	}

}
@FunctionalInterface
interface Rule{
	boolean test(Person P);
}
@ FunctionalInterface
interface Operation{
	void accept(Person P);
}
