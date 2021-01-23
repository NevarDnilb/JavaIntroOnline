/*
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 * A[i,j] = sin((i^2 - j^2) / n) 
 * и подсчитать количество положительных элементов в ней.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_2_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[][] a = new double[n][n];
		int positive = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sin((i*i - j*j) / (double)n);
				if (a[i][j] > 0) { positive++; }
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (n-1); j++) {
				System.out.printf("%.4f, ", a[i][j]);
			}
			System.out.printf("%.4f] \n", a[i][n-1]);
		}
		System.out.println("Number of positive elements: " + positive);
	}
}
