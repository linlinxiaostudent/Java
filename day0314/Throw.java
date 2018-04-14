package day0314;

public class Throw {
	public void setAge(int age) {
		if (age<=0){
			throw new IllegalArgumentException("年龄不能为负！"+age);
		}
	}
	public static void main(String[] args) {
		Throw t= new Throw();
		t.setAge(-2);
	}
}
