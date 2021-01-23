/*
 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
import java.util.Scanner;

public class Problem_1_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[n];
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
			if (a[i] > a[maxIndex]) { maxIndex = i; }
			if (a[i] < a[minIndex]) { minIndex = i; }
		}
		//Swap
		double buffer = a[maxIndex];
		a[maxIndex] = a[minIndex];
		a[minIndex] = buffer;
		
		System.out.print("[");
		for (int i = 0; i < (n - 1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n - 1] +"]");
	}
}
