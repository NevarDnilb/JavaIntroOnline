/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */
import java.util.Scanner;

public class Problem_2_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		StringBuilder newLine = new StringBuilder("");
		for (int i = 0; i < line.length(); i++) {
			newLine.append(line.charAt(i));
			if (line.charAt(i) == 'a') {
				newLine.append('b');
			}
		}
		line = newLine.toString();
		System.out.println(line);
	}
}
