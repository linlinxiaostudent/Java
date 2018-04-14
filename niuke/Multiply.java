package niuke;

import java.util.ArrayList;

public class Multiply {
	public int[] multiply(int[] A) {
		int[] arrayList = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int temp = 1;
			for (int j = 0; j < A.length; j++) {
				if (i != j) {
					temp = temp * A[j];
				}
			}
			arrayList[i] = temp;
		}
		return arrayList;
	}

	public static void main(String[] args) {
		int[] A = new int[]{1,2,3,4};
		Multiply m = new Multiply();
		int [] B = m.multiply(A);
		for(int item: B){
			System.out.println(item);
		}
	}

}
