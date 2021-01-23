/*
 * 3. ���������� �������. ���� ������������������ ����� a1, a2,..., an.��������� ����������� �������� ���,
 * ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ����������
 * ������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������, ��� ���������
 * �����������. �������� �������� ���������� �������.
 */
import java.util.Scanner;

public class Problem_3_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextInt();
		}
		for (int i = 0; i < (n-1); i++) {
			int maxInd = i;
			for (int j = i+1; j < n; j++) {
				if (a[j] > a[maxInd]) { maxInd = j; }
			}
			int swap = a[i];
			a[i] = a[maxInd];
			a[maxInd] = swap;
		}
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n-1] + "]");
	}
}
