/*
 * 3. В строке найти количество цифр.
 */
import java.util.Scanner;

public class Problem_1_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] line = in.nextLine().toCharArray();
		int counter = 0;
		for (char symb: line) {
			if (Character.isDigit(symb)) {
				counter++;
			}
		}
		System.out.println("Answer: " + counter);
	}
}
