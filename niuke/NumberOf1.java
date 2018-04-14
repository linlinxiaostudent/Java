package niuke;

public class NumberOf1 {
	public int numberOf1(int n) {
		int count =0;
		if (n<0)
		{
			count = 32;
			while(n!=-1)
			{
				if(n%2==0)
					count--;
				n=n>>1;
			}
			return count;
		}
		else
		{
			while(n>0)
			{
				if(n%2!=0)
					count++;
				n=n>>1;
			}
			return count;
		}

    }

	public static void main(String[] args) {
		NumberOf1 num= new NumberOf1();
		System.out.println(num.numberOf1(10));
	}

}
