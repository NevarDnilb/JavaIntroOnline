/*
 * 4. В строке найти количество чисел.
 */
import java.util.Scanner; 

public class Problem_1_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] line = in.nextLine().toCharArray();
		int i = 0;
		int counter = 0;
		while (i < line.length) {
			boolean isNumber = false;
			while ((i < line.length) && (Character.isDigit(line[i]))) {
				isNumber = true;
				i++;
			}
			if (isNumber) { counter++; }
			i++;
		}
		System.out.println("Answer: " + counter);
	}
}
