/*
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */

import java.util.Scanner;

public class Problem_1_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.print("Z = ");
		double z = in.nextDouble();
		int replaceCount = 0;
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
			if (a[i] > z) {
				a[i] = z;
				replaceCount++;
			}
		}
		System.out.print("[");
		for (int i = 0; i < (n - 1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n-1] +"]");
		System.out.println("Number of replaces: " +replaceCount);
	}
}
