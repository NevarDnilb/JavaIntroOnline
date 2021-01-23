/*
 * 6. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 * [1, 1, 1,..., 1, 1, 1]
 * [0, 1, 1,..., 1, 1, 0]
 * [0, 0, 1,..., 1, 0, 0]
 * [....................]
 * [0, 1, 1,..., 1, 1, 0]
 * [1, 1, 1,..., 1, 1, 1]
 */
import java.util.Scanner;

public class Problem_2_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < (n / 2); i++) {
			for (int j = 0; j < (i-1); j++) {
				matrix[i][j] = 0;
				matrix[n-i-1][j] = 0;
				matrix[n-i-1][n-j-1] = 0;
				matrix[i][n-j-1] = 0;
			}
			for (int j = i; j < (n / 2); j++) {
				matrix[i][j] = 1;
				matrix[n-i-1][j] = 1;
				matrix[n-i-1][n-j-1] = 1;
				matrix[i][n-j-1] = 1;
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
