/*
 * 4. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 * [1,  2,   3 ,..., n]
 * [n, n-1, n-2,..., 1]
 * [1,  2,   3 ,..., n]
 * [n, n-1, n-2,..., 1]
 * [..................]
 * [n, n-1, n-2,..., 1]
 */
import java.util.Scanner;

public class Problem_2_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print(" n = ");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) { matrix[i][j] = j + 1;}
				else { matrix[i][j] = n - j;}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (n-1); j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println(matrix[i][n-1] + "]");
		}
	}
}
