/*
 * 5. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
 * [1, 1, 1,..., 1, 1, 1]
 * [2, 2, 2,..., 2, 2, 0]
 * [3, 3, 3,..., 3, 0, 0]
 * [....................]
 * [n-1,n-1, 0,..., 0, 0]
 * [n, 0, 0,..., 0, 0, 0]
 */
import java.util.Scanner;

public class Problem_2_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n-i); j++) {
				matrix[i][j] = i + 1;
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
