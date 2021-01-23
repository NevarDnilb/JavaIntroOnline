/*
 * 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
import java.util.Scanner;

public class Problem_2_13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				a[i][j] = in.nextInt();
			}
		}
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < (n-1); i++) {
				int minIndex = i;
				for (int k = i + 1; k < n; k++) {
					if (a[k][j] < a[minIndex][j]) { minIndex = k; }
				}
				int swap = a[i][j];
				a[i][j] = a[minIndex][j];
				a[minIndex][j] = swap;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (m-1); j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println(a[i][m-1] + "]");
		}
		System.out.println();
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < (n-1); i++) {
				int maxIndex = i;
				for (int k = i + 1; k < n; k++) {
					if (a[k][j] > a[maxIndex][j]) { maxIndex = k; }
				}
				int swap = a[i][j];
				a[i][j] = a[maxIndex][j];
				a[maxIndex][j] = swap;
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
