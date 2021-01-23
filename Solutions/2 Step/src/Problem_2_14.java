/*
 * 14. ������������ ��������� ������� m x n, ��������� �� ����� � ������, ������ � ������ ������� �����
 * ������ ����� ������ �������.
 * 
 * ����. ��� ������� ������ ������, ��� ����� �������� �� ������ ����� �����, ����� ������ �� ����� ������, 
 * 		 ��� ��� ���������, ��� ������ ����������� � ������, ����� �������� ������ ����� ����� � �������.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_2_14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		if (n < m) {
			System.out.println("n < m. ERROR!");
			System.exit(0);
		}
		int[][] a = new int[n][m];
		for (int j = 0; j < m; j++) {
			int k = j + 1;
			while (k > 0) {
				int i = (int) (random() * n);
				if (a[i][j] == 0) {
					a[i][j] = 1;
					k--;
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
