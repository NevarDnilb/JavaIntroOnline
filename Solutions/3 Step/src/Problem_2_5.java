/*
 * 5. ����������, ������� ��� ����� �������� �������� ������ ����������� ����� ���.
 */
import java.util.Scanner;

public class Problem_2_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int counter = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'a') { counter++; }
		}
		System.out.println("Answer: " + counter);
	}
}
