package niuke;
/*
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�
 * ����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡�
 *  ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 * */
public class Duplicate {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,
	//    so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	boolean flag = false;
    	if (numbers ==null || length <=0){
    		return flag;
    	}
    	for (int i=0;i<length;i++){
    		if (numbers[i]<0||numbers[i]>=length){
    			return flag;
    		}
    	}
    	int[] arr = new int[length]; 
    	for(int i=0;i<length;i++){
    		arr[i]=0;
    	}
    	for(int i=0;i<length;i++){
    		arr[numbers[i]]=arr[numbers[i]]+1;
    		if (arr[numbers[i]]>1){
    			flag = true;
    			break;
    		}
    	}
    	return flag;
    }
	public static void main(String[] args) {
		Duplicate d = new Duplicate();
		int[] numbers = {2, 3, 1, 0, 2, 5, 3};
        int[] a = new int[2];
        d.duplicate(numbers, 7, a);
        System.out.print(d.duplicate(numbers, 7, a));

	}

}
