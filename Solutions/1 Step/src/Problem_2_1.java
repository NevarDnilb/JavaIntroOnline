/*
 * 1. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� ��
 * �� �������������.
 */
import java.util.Scanner;

public class Problem_2_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("�������� ����� �����: ");
		double first = in.nextDouble();
		double second = in.nextDouble();
		double third = 180 - first - second;
		boolean possible = false;
		boolean has90Deg = false;
		if (third > 0) {
			possible = true;
			if ((first == 90) || (second == 90) || (third == 90)) {
				has90Deg = true;
			}
		}
		if (possible) {
			System.out.print("����������� ����������. ");
			if (has90Deg) {
				System.out.println("�� ������������.");
			} else {
				System.out.println("�� �� �������������.");
			}
		} else {
			System.out.println("������������ �� ����������.");
		}
	}
}
