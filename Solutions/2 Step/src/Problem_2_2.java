/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
import java.util.Scanner;

public class Problem_2_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n = ");
		int n = in.nextInt();
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				matrix[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
	}
}
