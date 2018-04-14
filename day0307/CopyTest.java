package day0307;

import java.util.Arrays;;

public class CopyTest {
	public static void main(String[] args) {
		int[][] x = new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] x1 = new int [x.length][];
		int[][] x2 = new int [x.length][];
		int[][] x3 = new int [x.length][];
		int k =0;
		System.out.println("Original Array is");
		for (int[]i: x)
		{
			for (int j :i)
			{System.out.print(j+"  ");}
		}
		x1 = Arrays.copyOf(x,x.length);
		System.out.println();
		System.out.println("First Copy Array is");
		for (int[]i: x1)
		{
			for (int j :i)
			{System.out.print(j+"  ");}
		}
		
		System .arraycopy(x, 0, x2, 0, x.length);;
		System.out.println();
		System.out.println("Second Copy Array is");
		for (int[]i: x2)
		{
			for (int j :i)
			{System.out.print(j+"  ");}
		}
		
		x3 = x.clone();
		System.out.println();
		System.out.println("Thirt Copy Array is");
		for (int[]i: x3)
		{
			for (int j :i)
			{System.out.print(j+"  ");}
		}
	}

}
