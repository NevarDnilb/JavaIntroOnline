/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
import java.util.Scanner;

public class Problem_4_16 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		long ans = 0;
		for (long i = getMin(n); i < getMin(n+1); i++) {
			if (numberOfEvenDigits(i) == 0) {
				ans += i;
			}
		}
		System.out.println("Sum is " + ans);
		System.out.println("Number of Eve digits is " + numberOfEvenDigits(ans));
	}
	public static long getMin(int size) {
		long res = 1;
		for (int i = 1; i < size; i++) {
			res *= 10;
		}
		return res;
	}
	public static int numberOfEvenDigits(long value) {
		int res = 0;
		while (value > 0) {
			if (value % 2 == 0) { res++; }
			value /= 10;
		}
		return res;
	}
}
