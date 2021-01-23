/*
 * 11. ћатрицу 10x20 заполнить случайными числами от 0 до 15. 
 * ¬ывести на экран саму матрицу и номера строк, в которых число 5 встречаетс€ три и более раз.
 */
import static java.lang.Math.*;

public class Problem_2_11 {
	public static void main(String[] args) {
		int n = 10;
		int m = 20;
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = (int) (random() * 16);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (m-1); j++) {
				System.out.printf("%3d, ", matrix[i][j]);
			}
			System.out.printf("%3d]\n", matrix[i][m-1]);
		}
		System.out.print("Number of lines with three and more 5 in it: ");
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 5) { count++; }
			}
			if (count >= 3) {
				System.out.print((i+1) + " ");
			}
		}
	}
}
