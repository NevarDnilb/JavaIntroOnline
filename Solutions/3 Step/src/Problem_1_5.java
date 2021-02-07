/*
 * 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Problem_1_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] line =in.nextLine().toCharArray();
		ArrayList<Character> buffer = new ArrayList<>();
		int i = 0;
		while (Character.isWhitespace(line[i])) {
			i++;
		}
		int endOfLine = line.length - 1;
		while (Character.isWhitespace(line[endOfLine])) {
			endOfLine--;
		}
		while (i < endOfLine) {
			if (Character.isWhitespace(line[i])) {
				buffer.add(' ');
				i++;
				while ((i < endOfLine) && (Character.isWhitespace(line[i]))) {
					i++;
				}
			} else {
				buffer.add(line[i]);
				i++;
			}
		}
		line = new char[buffer.size()];
		i = 0;
		for (Character symb: buffer) {
			line[i] = symb.charValue();
			i++;
		}
		for (char symb: line) {
			System.out.print(symb);
		}
	}
}
