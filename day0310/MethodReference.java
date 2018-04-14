package day0310;

import java.awt.peer.FramePeer;

import day0306.Person;

/*��������
 * �����Lambda���ʽ�У������ǵ���һ���Ѿ����ڵķ����������ǾͿ���
 * ʹ�÷�������������Lambda���ʽ��ͨ���������ÿ����ó����һ����ࡣ
 * �������ÿ��Է�Ϊ����������ʽ��
 * 1�����þ�̬����
 * 2��ͨ���������ã�����ʵ������
 * 3��ͨ����������ʵ������
 * 4�����ù�����
 * ����������Lambda���ʽ��һ��������Ҳ�Ƿ�����ʵ���˺���ʽ�ӿ����͵Ķ���
 * */

public class MethodReference {
	public static void main(String[] args) {
		Person a=new Person("����", 23, 120, 30);
		Person b=new Person("����", 25, 130, 40);
		Person c=new Person("����", 30, 180, 70);
		Friend f1=new Friend() {
			
			@Override
			public void makeFriend(Person p1, Person p2) {
				// TODO Auto-generated method stub
				System.out.println(p1.getName()+"��"+p2.getName() +"������");
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
		System.out.println(p1.getName()+"��"+p2.getName() +"������");
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
		System.out.println(p1.getName()+"��"+p2.getName() +"������");
	}
}
