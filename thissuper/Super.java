package thissuper;

class SuperUse{
	String name;

	public SuperUse(String name) {
		super();
		this.name = name;
	}
	
}

class SubUse extends SuperUse{

	public SubUse(String name) {
		super(name);
	}
	
}

public class Super {
	public static void main(String[] args) {
		SuperUse s = new SubUse("ÀîËÄ");
		System.out.println(s.name);
	}
}
