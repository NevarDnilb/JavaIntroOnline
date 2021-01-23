/*
 * 14. ����������� �����, � ������ �������� n ����, ���������� ������ ����������, ���� ����� ��� ����,
 * ����������� � ������� n, ����� ������ �����. ����� ��� ����� ���������� �� 1 �� k.
 * ��� ������� ������ ������������ ������������.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_4_14 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("k = ");
		int k = in.nextInt();
		for (int i = 1; i <= k; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + "; ");
			}
		}
	}
	public static boolean isArmstrong(int x) {
		boolean res = false;
		if (pow(sumOfNumbers(x), getSizeOf(x)) == x) { res = true; }
		return res;
	}
	public static int sumOfNumbers(int x) {
		int res = 0;
		while (x > 0) {
			res += x % 10;
			x = x / 10;
		}
		return res;
	}
	public static int getSizeOf(int x) {
		int res = 0;
		while (x > 0) {
			res ++;
			x = x / 10;
		}
		return res;
	}
}
