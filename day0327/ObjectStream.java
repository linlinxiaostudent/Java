package day0327;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStream {
	public static void main(String[] args) {
		//write();
		read();
	}
	public static void write() {
		try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("G:/java/student.txt"));){
			Student s = new Student(1, "ÕÅÈý");
			out.writeObject(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void read() {
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("G:/java/student.txt"));){
			Student s1= (Student)in.readObject();
			System.out.println(s1.getId());
			System.out.println(s1.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
class Student implements Serializable{
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
	
}