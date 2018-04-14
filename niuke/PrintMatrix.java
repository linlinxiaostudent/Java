package niuke;

import java.util.ArrayList;

public class PrintMatrix {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> array = new ArrayList<>();
		int j =0;
		for (int i = 0; i < matrix.length; i++) {
				System.out.println(matrix[i][j]);
				j++;
				//array.add(matrix[i][j]);
				if(j==3){
					System.out.println(matrix[i][j]);
					j--;
					continue;
				}
			
		}
		return array;
	}

	public static void main(String[] args) {
		PrintMatrix p = new PrintMatrix();
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12, }, { 13, 14, 15, 16 } };
		p.printMatrix(matrix);
	}

}
