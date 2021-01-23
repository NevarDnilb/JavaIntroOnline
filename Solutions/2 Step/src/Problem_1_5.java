/*
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
import java.util.Scanner;

public class Problem_1_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (a[i] > (i +1) ) { System.out.print(a[i] + " "); }
		}
	}
}
