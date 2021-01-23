/*
 * 7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<= bm.
 * Требуется указать те места, на которые нужно вставлять элементы последовательности b1, b2,..., bm в первую
 * последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
import java.util.Scanner;

public class Problem_3_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int n = in.nextInt();
		int m = in.nextInt();
		double[] a = new double[n];
		double[] b = new double[m];
		int[] position = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("A[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
		}
		for (int i = 0; i < m; i++) {
			System.out.print("B[" + (i+1) + "] = ");
			b[i] = in.nextDouble();
			if (b[i] >= a[n-1]) { position[i] = n + i + 1; }
			else { position[i] = binSearch(0, (n-1), b[i], a) + i + 1;}
		}
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(position[i] + ", ");
		}
		System.out.println(position[n-1] + "]");
	}
	
	public static int binSearch(int left, int right, double value, double[] array) {
		int res = 0;
		int midle = (left + right) / 2;
		if (midle == left) { 
			if (array[left] < value) {return right; }
			else { return left; }
		}	
		if (array[midle] < value) { res = binSearch(midle, right, value, array); }
		else { res = binSearch(left, midle, value, array); }
		return res;
	}
}
