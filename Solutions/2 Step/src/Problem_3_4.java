/*
 * 4. ���������� ��������. ���� ������������������ ����� a1 <= a2 <=...<= an.
 * ��������� ����������� ����� � ������� �����������. ��� ����� ������������ ��� �������� ����� 
 * ai � a(i+1). ���� ai > a(i+1), �� �������� ������������. ��� ������������ �� ��� ���,
 * ���� ��� �������� �� ������ ����������� � ������� �����������.
 * ��������� �������� ����������, ����������� ��� ���� ���������� ������������.
 * 
 * ����. �� ������� ��������, ��� ���� ������������������ � ������� ����������. 
 * � ����� �������� ������������������ � ������� ����������� ����� ��������� �� �� ����������.
 * � �� ����������� �������, ��� ������� � �������. �����, ��� �������� �������� � ������� � ����,
 * ��� ��������� ����������� ����� � ������� ������������� � ��������j��� ���������, ���� ai < a(i+1).
 * ������� ��������� �� ���� �����.
 */
import java.util.Scanner;

public class Problem_3_4 {
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
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				if (a[j] > a[j-1]) {
					int swap =a[j];
					a[j] = a[j-1];
					a[j-1] = swap;
					swapCount++;
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n-1] + "]");
		System.out.println("Number of swaps: " + swapCount);
	}
}
