package twoDArrays;

import java.util.Arrays;

public class MatrixMultiplication {
	
	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int[][] b = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		
		int[][] ans = multiplication(a,b);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(Arrays.toString(ans[i]));
		}
	}
	
	public static int[][] multiplication(int[][]a, int[][]b){
		int[][] c = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < b.length; k++) {
					
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}
}
