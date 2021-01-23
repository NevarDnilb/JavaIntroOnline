/*
 * 5. Сортировка вставками. Дана последовательность чисел a1, a2,..., an. 
 *Требуется переставить числа в порядке возрастания. Делается это следующим образом.
 *Пусть a1, a2,..., ai — упорядоченная последовательность, т. е. a1 <= a2 <=...<= an. 
 *Берется следующее число a(i+1) и вставляется в последовательность так, чтобы новая
 *последовательность была тоже возрастающей. Процесс производится до тех пор, пока 
 *все элементы от i +1 до n не будут перебраны. 
 *Примечание. Место помещения очередного элемента в отсортированную часть производить 
 *с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
import java.util.Scanner;

public class Problem_3_5 {
	public static int binSearch(int left, int right, int value, int[] array) {
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
		for (int i = 1; i < n; i++) {
			int position = i;
			if (a[i] < a[i-1]) { position = binSearch(0, i, a[i], a); }
			int value = a[i];
			for (int j = position; j < i; j++) {
				a[i] = a[j];
				a[j] = value;
				value = a[i];
			}
		}
		System.out.print("[");
		for (int i = 0; i < (n-1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n-1] + "]");
	}
}
