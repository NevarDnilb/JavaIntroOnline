/*
 * 8. ¬водитс€ строка слов, разделенных пробелами. Ќайти самое длинное слово и вывести его на экран.
 * —лучай, когда самых длинных слов может быть несколько, не обрабатывать.
 */
import java.util.Scanner;

public class Problem_2_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String  maxWord = "";
		StringBuilder word = new StringBuilder();
		for (int i = 0; i < line.length(); i++) {
			if (Character.isWhitespace(line.charAt(i))) {
				if (word.length() > maxWord.length()) {
					maxWord = word.toString();	
				}
				word.delete(0, word.length());
			} else {
				word.append(line.charAt(i));
			}			
		}
		if (word.length() > maxWord.length()) {
			maxWord = word.toString();	
		} 
		System.out.println(maxWord);
	}
}
