/*
 * 1. �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ��������� ���������
 * ��� ����� �� 1 �� ���������� ������������� �����.
 * 
 * ����. ����� ����������� �������� ���� �� ������������ ������� ����� � ������� ����� �� �������. 
 *		 �� ��� ��� �������� �������� "�����", � ����� �� ��������� � ������� ������, ����� ��������� 
 * 		 ����� �� ����������� ����� �����.  
 */
import java.util.Scanner;

public class Problem_3_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = in.nextInt();
		int ans = 0;
		for (int i = 1; i < num; i++) {
			ans += i;
		}
		System.out.println("Answer: " + ans);
	}
}
