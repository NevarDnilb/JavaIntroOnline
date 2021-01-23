/*
 * 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
import java.util.Scanner;

public class Problem_2_15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				a[i][j] = in.nextInt();
				if (a[i][j] > max) { max = a[i][j]; }
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] % 2 == 1) {
					a[i][j] = max;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (m-1); j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println(a[i][m-1] + "]");
		}
	}
}
