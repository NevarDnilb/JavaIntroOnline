/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
import java.util.Scanner;

public class Problem_4_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter A, B, C and D: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println("GCD: " + aGCDFor4(a, b, c, d));
	}
	public static int aGCD(int first, int second) {
		while ((first > 0) && (second > 0)) {
			if (first > second) { first = first % second; }
			else { second = second % first; }
		}
		if (first == 0) { return second; }
		else {return first; }
	}
	public static int aGCDFor4(int first, int second, int third, int forth) {
		int res = aGCD(aGCD(first, second), aGCD(third, forth));
		return res;
	}
}
