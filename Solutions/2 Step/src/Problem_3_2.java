/*
 * 2. ���� ��� ������������������ a1 <= a2<=...<= an � b1 <= b2 <=...<= bm.
 * ���������� �� ��� ����� ������������������ ����� ���, ����� ��� ���� ���� �����������. 
 * ����������. �������������� ������ �� ������������.
 */
import java.util.Scanner;

public class Problem_3_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sizes of arrays: ");
		int n = in.nextInt();
		int m = in.nextInt();
		int[] first = new int[n+m];
		int[] second = new int[m];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			first[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			System.out.print("B[" + (i+1) + "] = ");
			second[i] = in.nextInt();
		}
		for (int i = n; i < (n+m); i++) {
			first[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < (n+m); i++) {
			if (first[i] > second[0]) {
				int swap = first[i];
				first[i] = second[0];
				second[0] = swap;
				int j = 0;
				while ((j < m) && (second[j] > second[j+1])) {
					swap = second[j+1];
					second[j+1] = second[j];
					second[j] = swap;
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < (n+m-1); i++) {
			System.out.print(first[i] + ", ");
		}
		System.out.println(first[n+m-1] + "]");
	}
}
