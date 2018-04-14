package day0307;

public class Args {
	public static void main(String[] args) {
		double fresh =0;
		double sum =0;
		double mean =0;
		for(int i=0; i<args.length;i++)
		{
			fresh = Double.parseDouble(args[i]);
			sum = sum +fresh;
			System.out.println(fresh);
		}
		System.out.println("sum=" +sum);
		mean = sum /args.length;
		System.out.println("mean="+mean);
	
	}
}
