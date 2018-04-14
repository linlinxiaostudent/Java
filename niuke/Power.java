package niuke;

public class Power {
	public double power(double base, int exponent) {
		if(exponent>=0){
	        if(exponent==0)
	            return 1;
	        else
	            return power(base,exponent-1)*base;
		}
		else{
			return 1/(power(base,(-exponent)-1)*base);
		}
  }
	
	public static void main(String[] args) {
		Power p = new Power();
		double base=4.0;
		int exponent =-1;
		System.out.println(p.power(base, exponent));
	}

}
