/*
 * 10. ������ X ������� �� ���������� �����������, ������ �� ������� ��������� ������,
 * ��������������� ��� �������������� ������. ���������� ���������� ����������� � ������ X.
 */
import java.util.Scanner;

public class Problem_2_10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int sentenceCounter = 0;
		for (int i = 0; i < line.length(); i++) {
			char symb = line.charAt(i);
			if ((symb == '.') || (symb == '?') || (symb == '!')) {
				sentenceCounter++;
			}
		}
		System.out.println("Answer: " + sentenceCounter);
	}
}
