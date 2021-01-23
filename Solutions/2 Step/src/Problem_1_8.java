/*
 * 8. ƒана последовательность целых чисел a1, a2,..., an. ќбразовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,..., an).
 */
import java.util.Scanner;

public class Problem_1_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextInt();
			if (min > a[i]) { min = a[i]; }
		}
		int[] b = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != min) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.print("[");
		for (int i = 0; i < (j - 1); i++) {
			System.out.print(b[i] + ", ");
		}
		System.out.println(b[j - 1] +"]");
	}
}
