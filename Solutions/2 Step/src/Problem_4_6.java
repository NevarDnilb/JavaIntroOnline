/*
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
import java.util.Scanner;

public class Problem_4_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 3 numbers: ");
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		if (aGCD(first, aGCD(second, third)) > 1) {
			System.out.println("No.");
		} else {
			System.out.println("Yes.");
		}
	}
	public static int aGCD(int first, int second) {
		while ((first > 0) && (second > 0)) {
			if (first > second) { first = first % second; }
			else { second = second % first; }
		}
		if (first == 0) { return second; }
		else {return first; }
	}
}
