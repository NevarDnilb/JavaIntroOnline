/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
import java.util.Scanner;

public class Problem_4_15 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		for (long i = getMin(n); i < getMin(n+1); i++) {
			if (isGood(i)) {
				System.out.print(i + "; ");
			}
		}
	}
	public static long getMin(int size) {
		long res = 1;
		for (int i = 1; i < size; i++) {
			res *= 10;
		}
		return res;
	}
	public static boolean isGood(long subj) {
		boolean res = true;
		long previous = Integer.MAX_VALUE;
		while (subj > 0) {
			long current = subj % 10;
			if (previous <= current) {
				res = false;
				break;
			}
			previous = current;
			subj = subj / 10;
		}
		return res;
	}
}
