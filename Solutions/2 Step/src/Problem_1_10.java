/*
 * 10. Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
import java.util.Scanner;

public class Problem_1_10 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextInt();
			if ((i + 1) % 2 == 0) { a[i] = 0; }
		}
		System.out.print("[");
		for (int i = 0; i < (n - 1); i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[n - 1] +"]");
	}
}
