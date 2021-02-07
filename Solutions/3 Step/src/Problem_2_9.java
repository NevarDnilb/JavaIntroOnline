/*
 * 9. ѕосчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
 * ”читывать только английские буквы.
 */
import java.util.Scanner;

public class Problem_2_9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		int upperCaseCounter = 0;
		int lowerCaseCounter = 0;
		for (int i = 0; i < line.length(); i++) {
			if (isLatin(line.charAt(i))) {
				if (Character.isUpperCase(line.charAt(i))) {
					upperCaseCounter++;
				} else {
					lowerCaseCounter++;
				}
			}
		}
		System.out.println("Number of lowercase letters is " + lowerCaseCounter 
				+ ". Nubmber of uppercase letters is " + upperCaseCounter + ".");
	}
	
	public static boolean isLatin(char symb) {
		boolean res = false;
		symb = Character.toLowerCase(symb);
		if ((symb >= 'a') && ( symb <= 'z')) {
			res = true;
		}
		return res;
	}
}
