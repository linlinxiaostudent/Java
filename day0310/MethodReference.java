package day0310;

import java.awt.peer.FramePeer;

import day0306.Person;

/*方法引用
 * 如果在Lambda表达式中，仅仅是调用一个已经存在的方法，那我们就可以
 * 使用方法引用来代替Lambda表达式，通过方法引用可以让程序进一步简洁。
 * 方法引用可以分为如下四种形式：
 * 1、引用静态方法
 * 2、通过对象（引用）引用实例方法
 * 3、通过类型引用实例方法
 * 4、引用构造器
 * 方法引用是Lambda表达式的一种特例，也是返回了实现了函数式接口类型的对象。
 * */

public class MethodReference {
	public static void main(String[] args) {
		Person a=new Person("张三", 23, 120, 30);
		Person b=new Person("李四", 25, 130, 40);
		Person c=new Person("王五", 30, 180, 70);
		Friend f1=new Friend() {
			
			@Override
			public void makeFriend(Person p1, Person p2) {
				// TODO Auto-generated method stub
				System.out.println(p1.getName()+"与"+p2.getName() +"交朋友");
			}
		};
		f1.makeFriend(a, c);
		
		Friend f = (p1,p2)-> Person.mkFriend(p1, p2);
		Friend f3 = Person ::mkFriend;
		f3.makeFriend(b, a);
		
		f.makeFriend(a, b);
		Friend f2 = new MkFriend();
		f2.makeFriend(b, c);
		
		Tool tool = new Tool();
		Friend f4 = (p1,p2)-> tool.mkFriend(p1, p2);
		f4.makeFriend(a, b);
		Friend f5 = tool::mkFriend;
		f5.makeFriend(a, b);
		
		Friend f6 = (p1,p2)-> p1.mkFriend2(p2);
		f6.makeFriend(a, b);
		Friend f7 = Person ::mkFriend2;
		f7.makeFriend(a, b);
		Create create = (name,age,height,weight)->new Person(name,age,height,weight);
		Create create2 = Person::new;
		Create create3 = new Create(){
			@Override
			public Person get(String name, int age, int height, int weight){
				  return new Person(name,age,height,weight);
			}
		};
		Create create4 = new mkPerson();
	}

}
class MkFriend implements Friend{
	@Override
	public void makeFriend(Person p1, Person p2) {
		// TODO Auto-generated method stub
		System.out.println(p1.getName()+"与"+p2.getName() +"交朋友");
	}
}
class mkPerson implements Create{

	@Override
	public Person get(String name, int age, int height, int weight) {
		// TODO Auto-generated method stub
		return new Person(name,age,height,weight);
	}
	
}
@FunctionalInterface
interface Friend{
	void makeFriend(Person p1,Person p2);
}
@FunctionalInterface
interface Create{
	  Person get(String name, int age, int height, int weight);
}
class Tool{
	public void mkFriend(Person p1,Person p2)
	{
		System.out.println(p1.getName()+"与"+p2.getName() +"交朋友");
	}
}
