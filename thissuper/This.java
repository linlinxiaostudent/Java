package thissuper;

class ThisUse {
	String name;

	public ThisUse() {
		this.name = "уехЩ";
	}

	public ThisUse(String name) {
		super();
		this.name = name;
	}
}

public class This {
	public static void main(String[] args) {
		ThisUse t = new ThisUse();
		System.out.println(t.name);
	}

}
