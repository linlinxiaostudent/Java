package day0306;

class Salary {
	public int pay(int x) {
		return 0;
	}
}

class GeneralManager extends Salary {
	@Override
	public int pay(int x) {
		return x * 3;
	}
}

class DivisionManager extends Salary {
	@Override
	public int pay(int x) {
		return x * 2;
	}
}

class Worker extends Salary {
	@Override
	public int pay(int x) {
		return x;
	}
}

public class SalaryDemo {
	private int x;

	public SalaryDemo(int x) {
		this.x = x;
	}

	public void computer(Salary a) {
		System.out.println(a.pay(x));
	}

	public static void main(String[] args) {
		SalaryDemo s = new SalaryDemo(1000);
		s.computer(new GeneralManager());
		s.computer(new DivisionManager());
		s.computer(new Worker());

	}
}
