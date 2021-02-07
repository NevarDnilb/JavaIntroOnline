/*
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Problem_1_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		char[] letters = line.toCharArray();
		ArrayList<Character> buffer = new ArrayList<>();
		int i = 0;
		while (i < letters.length - 2) {
			if ((letters[i] == 'w') && (letters[i+1] == 'o') && (letters[i+2] == 'r') && (letters[i+3] == 'd')) {
				buffer.add('l');
				buffer.add('e');
				buffer.add('t');
				buffer.add('t');
				buffer.add('e');
				buffer.add('r');
				i += 4;
			} else {
				buffer.add(letters[i]);
				i++;
			}
		}
		letters = new char[buffer.size()];
		i = 0;
		for (Character symb: buffer) {
			letters[i] = symb.charValue();
			i++;
		}
		for (char symb: letters) {
			System.out.print(symb);
		}
		System.out.println();
	}
}
