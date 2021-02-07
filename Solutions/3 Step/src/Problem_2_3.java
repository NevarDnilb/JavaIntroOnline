/*
 * 3. ѕроверить, €вл€етс€ ли заданное слово палиндромом.
 */
import java.util.Scanner;

public class Problem_2_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		StringBuilder drow = new StringBuilder(word);
		drow.reverse();
		boolean isPalendrom = false;
		if (drow.toString().equals(word)) { isPalendrom = true; }
		if (isPalendrom) {
			System.out.println("The word is palendrom.");
		} else { System.out.println("The word is not palendrom."); }
	}
}
