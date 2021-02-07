/*
 * 1. ƒан текст (строка). Ќайдите наибольшее количество подр€д идущих пробелов в нем.
 */
import java.util.Scanner;

public class Problem_2_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		int ans = 0;
		int counter = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				counter++;
			} else { 
				counter = 0; 
			}
			if (counter > ans) { ans = counter; }
		}
		System.out.println("Answer: " + ans);
	}
}
