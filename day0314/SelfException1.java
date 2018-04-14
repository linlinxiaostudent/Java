package day0314;

public class SelfException1 {
	public void setMoney(int money)throws MoneyException {
		if (money>0){
			throw new MoneyException("输入为负："+money);
		}
	}
	public void setWeight(int weight) {
		if (weight<0){
			throw new WeightException("输入为负："+weight);
		}
		
	}
	public static void main(String[] args) {
		SelfException1 s = new SelfException1();
		try {
			s.setMoney(900);
		} catch (MoneyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			s.setWeight(-189);
		} catch (WeightException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

class MoneyException extends Exception{

	public MoneyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class WeightException extends RuntimeException{

	public WeightException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

