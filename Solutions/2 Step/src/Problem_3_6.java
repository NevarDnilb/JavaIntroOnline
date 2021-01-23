/*
 * 6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai <= ai+1, 
 * то продвигаются на один элемент вперед. Если ai > a(i+1), то производится перестановка и 
 * сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */
import java.util.Scanner;

public class Problem_3_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
		}
		int i = 0;
		while (i < (n-1)) {
			if (i < 0) { i++; }
			if (a[i] <= a[i+1]) { i++; }
			else {
				double swap = a[i];
				a[i] = a[i+1];
				a[i+1] = swap;
				i--;
			}
		}
		System.out.print("[");
		for (int j = 0; j < (n-1); j++) {
			System.out.printf("%.2f, ", a[j]);
		}
		System.out.printf("%.2f]\n", a[n-1]);
	}
}
