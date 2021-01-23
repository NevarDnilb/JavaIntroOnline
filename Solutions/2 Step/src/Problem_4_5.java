/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */
import java.util.Scanner;

public class Problem_4_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[n];
		int firstMax = 0;
		int secondMax = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
			if (a[i] > a[firstMax]) { firstMax = i; }
		}
		for (int i = 0; i < n; i++) {
			if ((a[i] > a[secondMax]) && (a[i] < a[firstMax])) {
				secondMax = i;
			}
		}
		System.out.println("Answer: " + a[secondMax]);
	}
}
