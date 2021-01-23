/*
 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */
import java.util.Scanner;

public class Problem_2_9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		double[][] a = new double[n][m];
		double[] sumOfColumn = new double[m];
		for (int i = 0; i < m; i++) {
			sumOfColumn[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				a[i][j] = in.nextDouble();
				sumOfColumn[j] += a[i][j];
			}
		}
		int maxIndex = 0;
		for (int i = 1; i < m; i++) {
			if (sumOfColumn[i] > sumOfColumn[maxIndex]) { maxIndex = i; }
		}
		System.out.print("[");
		for (int i = 0; i < (m-1); i++) {
			System.out.printf("%.4f, ", sumOfColumn[i]);
		}
		System.out.printf("%.4f]\n", sumOfColumn[m-1]);
		System.out.println("Max sum has column №" + (maxIndex+1));
	}
}
