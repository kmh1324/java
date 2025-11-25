package 프로젝트20251125;

import java.util.Random;

public class MatrixAdd {
	public static void main(String[] args) {
		int[][] m1 = new int[3][3], m2 = new int[3][3], m3 = new int[3][3];
		
		matrix_reset(m1);
		matrix_reset(m2);
		
		matrix_add(m1, m2, m3);
		
		matrix_print(m1);
		matrix_print(m2);
		matrix_print(m3);
	}
	
	public static void matrix_reset(int [][] m) {
		Random rnd = new Random();

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++) 
				m[i][j] = rnd.nextInt(100);
	}
	
	public static void matrix_add(int[][] m1, int[][] m2, int[][] m3) {
		for (int i = 0; i < m3.length; i++)
			for (int j = 0; j < m3[i].length; j++)
				m3[i][j] = m1[i][j] + m2[i][j];
	}
	
	public static void matrix_print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}
