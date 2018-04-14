package day0314;

public class SelfException {
	public void setAge(int age) throws NegitiveAgeException{
		if (age<=0){
			throw new NegitiveAgeException("年龄不能为负！"+age);
		}
	}
	public static void main(String[] args) {
		SelfException s = new SelfException();
		try {
			s.setAge(-1);
		} catch (NegitiveAgeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
class NegitiveAgeException extends Exception{
	public NegitiveAgeException(String message) {
		super(message);
		
	}
}
