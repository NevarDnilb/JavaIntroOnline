/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
import java.util.Scanner;

public class Problem_2_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n, m, k and p: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		int p = in.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				matrix[i][j] = in.nextInt();
			}
		}
		System.out.print("[");
		for (int i = 0; i < (m-1); i++) {
			System.out.print(matrix[k-1][i] + ", ");
		}
		System.out.println(matrix[k-1][m-1] + "]");
		
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(matrix[i][p-1] + ", ");
		}
		System.out.println(matrix[n-1][p-1] + "]");
	}
}
