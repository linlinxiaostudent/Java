package day0314;

public class Throws {
	public void setAge(int age) {
		if (age<=0){
			throw new IllegalArgumentException("���䲻��Ϊ����"+age);
		}
	}
	public void setAge2(int age) throws Exception{
		if (age<=0){
			throw new Exception("���䲻��Ϊ����"+age);
		}
	}
	public void setAge3(int age) {
		try {
			if (age<=0){
				throw new Exception("���䲻��Ϊ����"+age);
			}
		} catch (Exception e) {
		}
		
	}
	public static void main(String[] args) {
		Throws t =new Throws();
		t.setAge2(-2);
		t.setAge3(-2);

	}
}
