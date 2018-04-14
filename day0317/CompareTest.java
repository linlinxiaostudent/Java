package day0317;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest {
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		stu[0]= new Student(30,"abc");
		stu[1]= new Student(20,"xyz");
		stu[2]= new Student(15,"opq");
		Arrays.sort(stu);
		System.out.println(Arrays.toString(stu));
		Arrays.sort(stu,new MyCompare());
		System.out.println(Arrays.toString(stu));
		Arrays.sort(stu,new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		});
		System.out.println(Arrays.toString(stu));
		Arrays.sort(stu,(o1, o2)->o1.getId()-o2.getId());
		System.out.println(Arrays.toString(stu));

	}
}

class MyCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
}
	