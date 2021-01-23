/*
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */
import java.util.Scanner;

public class Problem_4_12 {
	
	private static int[] array;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter K and N: ");
		int k = in.nextInt();
		int n = in.nextInt();
		formArray(0, n, k, 0);
		for (int i = 0; i < getSize(); i++) {
			System.out.print(getElement(i) + " ");
		}
	}
	
	public static void setSize(int size) {
		array = new int[size];
	}
	public static int getSize() {
		return array.length;
	}
	public static int getElement(int index) {
		return array[index];
	}
	public static void formArray(int position, int maxValue, int k, int depth) {
		int element = -1;
		for (int i = position; i < maxValue; i++) {
			if (sumOfNumbers(i) == k) {
				element = i;
				formArray(i+1, maxValue, k, depth + 1);
				break;
			}
		}
		if (element < 0) {
			setSize(depth);
			return;
		}
		array[depth] = element;
	}
	public static int sumOfNumbers(int x) {
		int res = 0;
		while (x > 0) {
			res += x % 10;
			x = x / 10;
		}
		return res;
	}
}
