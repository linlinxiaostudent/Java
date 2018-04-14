package niuke;

public class MinNumberInRotateArray {
	 public int minNumberInRotateArray(int [] array) {
		 if (array.length==0)
			 return 0;
		 int val = array[0];
		 for(int i =1;i<array.length;i++){
			 if(array[i]<array[i-1]){
				 val = array[i];
			 }
		 }
		 return val;
	}
	 public static void main(String[] args) {
		 MinNumberInRotateArray a = new MinNumberInRotateArray();
		 int[] array = new int[]{3,4,5,2};
		 int val;
		 val=a.minNumberInRotateArray(array);
		 System.out.println(val);
	}
	 
}

