/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
 */

import java.util.Scanner;

public class Problem_1_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N = ");
		int n = in.nextInt();
		System.out.print("K = ");
		int k = in.nextInt();
		long ans = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextInt();
			if (a[i] % k == 0) {
				ans += a[i];
			}
		}
		System.out.println("Answer: " + ans);
	}	
}
