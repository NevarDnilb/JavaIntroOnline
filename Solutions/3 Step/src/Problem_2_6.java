/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */
import java.util.Scanner;

public class Problem_2_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			buffer.append(line.charAt(i));
			buffer.append(line.charAt(i));
		}
		String newLine = buffer.toString();
		System.out.println(newLine);
	}
}
