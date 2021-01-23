/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Problem_2_12 {
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
		for (int i = 0; i < n; i++) {
			Arrays.sort(a[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (m-1); j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println(a[i][m-1] + "]");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (m / 2); j++) {
				int swap = a[i][j];
				a[i][j] = a[i][m-j-1];
				a[i][m-j-1] = swap;
			}
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (m-1); j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println(a[i][m-1] + "]");
		}
	}
}
