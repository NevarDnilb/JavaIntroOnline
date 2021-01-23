/*
 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */
import java.util.Scanner;

public class Problem_1_9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		int[] equalsCount = new int[n];
		int ansIndex = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextInt();
			equalsCount[i] = 0;
		}
		for (int i = 0; i < (n-1); i++) {
			if (equalsCount[i] == 0) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						equalsCount[i]++;
						equalsCount[j]++;
					}
				}
				if (equalsCount[i] == equalsCount[ansIndex]) {
					if (a[i] < a[ansIndex]) { ansIndex = i; }
				}
				if (equalsCount[i] > equalsCount[ansIndex]) { ansIndex = i;}
			}	
		}
		System.out.println("Answer: " + a[ansIndex]);
	}
}
