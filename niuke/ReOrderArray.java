package niuke;

public class ReOrderArray {
	public void reOrderArray(int [] array) {
		int m=0;
		int n=0;
        for(int i=0;i<array.length;i++){
        	if(array[i]%2!=0){
        		m++;
        	}
        	if(array[i]%2==0){
        		n++;
        	}
        }
        int [] odd = new int[m];
        int [] even = new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<array.length;i++){
        	if(array[i]%2!=0){
        		odd[j]=array[i];
        		j++;
        	}
        	if(array[i]%2==0){
        		even[k]=array[i];
        		k++;
        	}
        }
        for(int i=0;i<m;i++){
        	array[i]=odd[i];
        }
        for(int i=0;i<n;i++){
        	array[m+i]= even[i];
        }
    }
	public static void main(String[] args) {
		int [] array = new int[]{1,2,3,4,5,6,7};
		ReOrderArray r = new ReOrderArray();
		r.reOrderArray(array);
		for(int item:array){
			System.out.print(item+"  ");
		}
	}

}
