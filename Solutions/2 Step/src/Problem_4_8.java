/*
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */
import java.util.Scanner;

public class Problem_4_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n, k and m: ");
		int n = in.nextInt();
		int k = in.nextInt();
		int m = in.nextInt();
		double[] d = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("D[" + (i+1) + "] = ");
			d[i] = in.nextDouble();
		}
		sums(d, k, m);
	}
	
	public static void sums(double[] array, int left, int right) {
		for (int i = left-1; i < (right - 2); i +=2) {
			System.out.println(sumOfThree(i, array));
		}
		if ((right - left) % 2 == 1) {
			System.out.println(sumOfThree(right - 3, array));
		}
	}
	public static double sumOfThree(int index, double[] array) {
		double res = array[index] + array[index+1] + array[index+2]; 
		return res;
	}
}
