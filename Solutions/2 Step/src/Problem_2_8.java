/*
 * 8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */
import java.util.Scanner;

public class Problem_2_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.print("Enter numbers of columns: ");
		int first = in.nextInt();
		int second = in.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			int swap = a[i][first-1];
			a[i][first-1] = a[i][second-1];
			a[i][second-1] = swap;
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (n-1); j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println(a[i][n-1] + "]");
		}
	}
}
