/*
 * 10. Ќайти положительные элементы главной диагонали квадратной матрицы.
 */
import java.util.Scanner;

public class Problem_2_10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[][] matrix = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				matrix[i][j] = in.nextDouble();
			}
		}
		System.out.print("Answer: ");
		for (int i = 0; i < n; i++) {
			if (matrix[i][i] > 0) {
				System.out.printf("%.2f ", matrix[i][i]);
			}
		}
	}
}
