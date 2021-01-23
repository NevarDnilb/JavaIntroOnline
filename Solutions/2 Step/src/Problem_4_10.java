/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */
import java.util.Scanner;

public class Problem_4_10 {	
	
	private static int[] array;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("N = ");
		int n = in.nextInt();
		parseToArray(n, 0);
		for (int i = getArraySize() - 1; i > -1; i--) {
			System.out.print(getElement(i) + " ");
		}
	}
	
	
	public static void setSize(int size) {
		array = new int[size];
	}
	public static int getArraySize() {
		return array.length;
	}
	public static int getElement(int index) {
		return array[index];
	}
	public static void parseToArray(int n, int depth) {
		if (n < 10) {
			setSize(depth + 1);
			array[depth] = n;
			return;
		} 
		int element = n % 10;
		parseToArray(n / 10, depth + 1);
		array[depth] = element;
	}	
}
