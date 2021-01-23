/*
 * 13. ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
 * ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. 
 * ��� ������� ������ ������������ ������������.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_4_13 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		for (int i = n; i < (2*n-1); i++) {
			if ((isPrime(i)) && (isPrime(i+2))) {
				System.out.print(i + " " + (i+2) + "; ");
			}
		}
	}
	public static boolean isPrime(int x) {
		boolean res =true;
		for (int i = 2; i < sqrt(x); i++) {
			if (x % i == 0) {
				res = false;
				break;
			}
		}
		return res;
	}
}
