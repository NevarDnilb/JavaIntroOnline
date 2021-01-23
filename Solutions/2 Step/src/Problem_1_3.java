/*
 * 3. ƒан массив действительных чисел, размерность которого N. ѕодсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

import java.util.Scanner;

public class Problem_1_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N = ");
		int n = in.nextInt();
		double[] a = new double[n];
		int negativeCount = 0;
		int zeroCount = 0;
		int positiveCount = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
			if (a[i] > 0) { positiveCount++; }
			else if (a[i] < 0) { negativeCount++; }
			else { zeroCount++; }
		}
		System.out.printf("Negative elements: %d. Positive elements: %d. Netural elements: %d", negativeCount, positiveCount, zeroCount);
	}
}
