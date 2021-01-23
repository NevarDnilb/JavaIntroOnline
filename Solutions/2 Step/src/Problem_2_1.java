/*
 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
import java.util.Scanner;

public class Problem_2_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				matrix[i][j] = in.nextInt();
			}
		}
		for (int j = 1; j < m; j += 2) {
			if (matrix[1][j] > matrix[n-1][j]) {
				System.out.print("[");
				for (int i = 0; i < (n-1); i++) {
					System.out.print(matrix[i][j] + ", ");
				}
				System.out.println(matrix[n-1][j] + "]");
			}
		}
	}
}
