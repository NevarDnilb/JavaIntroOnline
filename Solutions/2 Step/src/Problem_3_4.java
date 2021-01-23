/*
 * 4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= an.
 * Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа 
 * ai и a(i+1). Если ai > a(i+1), то делается перестановка. Так продолжается до тех пор,
 * пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * 
 * прим. Из условия следуюет, что дана последовательность в порядке неубывания. 
 * И чтобы получить последовательность в порядке возрастания нужно исключить из неё повторения.
 * А не сортировать обменом, как сказано в условии. Думаю, что допущена опечатка и имеется в виду,
 * что требуется переставить числа в порядке невозрастания и перестанjвка делаеться, если ai < a(i+1).
 * Решение построено на этой мысли.
 */
import java.util.Scanner;

public class Problem_3_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextInt();
		}
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				if (a[j] > a[j-1]) {
					int swap =a[j];
					a[j] = a[j-1];
					a[j-1] = swap;
					swapCount++;
				}
			}
		}
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n-1] + "]");
		System.out.println("Number of swaps: " + swapCount);
	}
}
