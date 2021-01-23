/*
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько такихдействий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
import java.util.Scanner;

public class Problem_4_17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.println("Number of actions is " + numberOfActions(n));
	}	
	public static long numberOfActions(int value) {
		long res = 0;
		while (value > 0) {
			res++;
			value -= sumOfDigits(value);
		}
		return res;
	}
	public static long sumOfDigits(int value) {
		long res = 0;
		while (value > 0) {
			res += value % 10;
			value /= 10;
		}
		return res;
	}
}
