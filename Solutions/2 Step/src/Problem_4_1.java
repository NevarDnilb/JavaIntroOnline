/*
 * 1. �������� �����(������) ��� ���������� ����������� ������ �������� � ����������� ������ �������� ���
 * ����������� �����: ���(A, B) = A * B /���(A, B).
 */
import java.util.Scanner;

public class Problem_4_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A and B: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("LCM: " + leastCommonMultiple(a,b));
		System.out.println("GCD: " + gratestCommonDivisor(a,b));
	}
	public static int leastCommonMultiple(int first, int second) {
		int res = first * second / gratestCommonDivisor(first, second);
		return res;
	}
	public static int gratestCommonDivisor(int first, int second) {
		while ((first > 0) && (second > 0)) {
			if (first > second) { first = first % second; }
			else { second = second % first; }
		}
		if (first == 0) { return second; }
		else {return first; }
	}
}
