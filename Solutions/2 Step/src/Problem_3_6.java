/*
 * 6. ���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������.
 * �������� ��� ��������� �������: ������������ ��� �������� �������� ai � a(i+1). ���� ai <= ai+1, 
 * �� ������������ �� ���� ������� ������. ���� ai > a(i+1), �� ������������ ������������ � 
 * ���������� �� ���� ������� �����. ��������� �������� ���� ����������.
 */
import java.util.Scanner;

public class Problem_3_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
		}
		int i = 0;
		while (i < (n-1)) {
			if (i < 0) { i++; }
			if (a[i] <= a[i+1]) { i++; }
			else {
				double swap = a[i];
				a[i] = a[i+1];
				a[i+1] = swap;
				i--;
			}
		}
		System.out.print("[");
		for (int j = 0; j < (n-1); j++) {
			System.out.printf("%.2f, ", a[j]);
		}
		System.out.printf("%.2f]\n", a[n-1]);
	}
}
