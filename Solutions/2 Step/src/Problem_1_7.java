/*
 * 7. Даны действительные числа a1, a2,..., an. Найти max(a1 + a2n, a2 + a2n−1,..., an + an+1).
 * 
 * прим. Я посчитал, что в условии допущена опечатка и первое предложение должно было звучать так:
 * Дaны действительые числа a1, a2,..., a2n.
 */
import java.util.Scanner;

public class Problem_1_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[2 * n];
		for (int i = 0; i < (2 * n); i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextInt();
		}
		double ans = Double.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (ans < a[i] + a[2 * n - i - 1]) { ans = a[i] + a[2 * n - i - 1]; }
		}
		System.out.println("Answer: " + ans);
	}
}
