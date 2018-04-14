package day0307;

public class ArraryTest {
	public static void main(String[] args) {
		int [] test = new int [20];
		for (int i =0; i<test.length;i++)
		{
			if (i%2==0)
				test[i]= 2*i;
			else 
				test[i]= -2*i;
		}
		for (int j : test)
		{
			System.out.println(j+"\t");
		}
	}

}
