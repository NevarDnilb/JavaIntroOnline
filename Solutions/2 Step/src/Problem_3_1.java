/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя дополнительный массив.
 */
import java.util.Scanner;

public class Problem_3_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter sizes of arrays: ");
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.print("Enter k: ");
		int k = in.nextInt();
		int[] first = new int[n+m];
		int[] second = new int[m];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			first[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			System.out.print("B[" + (i+1) + "] = ");
			second[i] = in.nextInt();
		}
		for (int i = k; i < n; i++) {
			first[i+m] = first[i];
		}
		for (int i = 0; i < m; i++) {
			first[i+k] = second[i];
		}
		System.out.print("[");
		for (int i = 0; i < (n+m-1); i++) {
			System.out.print(first[i] + ", ");
		}
		System.out.println(first[n+m-1] + "]");
	}
}
