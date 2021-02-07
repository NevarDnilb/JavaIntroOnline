/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 */
import java.util.Scanner;

public class Problem_2_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		StringBuilder newLine = new StringBuilder();
		boolean[] canUse = new boolean[65537];
		for (int i = 0; i < canUse.length; i++) {
			canUse[i] = true;
		}
		canUse[(int)' '] = false;
		for (int i = 0; i < line.length(); i++) {
			if (canUse[(int) line.charAt(i)]) {
				newLine.append(line.charAt(i));
				canUse[(int) line.charAt(i)] = false;
			}
		}
		line = newLine.toString();
		System.out.println(line);
	}
}
