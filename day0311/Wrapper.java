package day0311;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		Integer in =new Integer(i);
		System.out.println(in);
 		in = Integer.valueOf(i);
		System.out.println(in);
		i= in.intValue();
		System.out.println(i);

	}

}
