/*
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
import java.util.Scanner;

public class Problem_3_7 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter n and m: ");
		int m = in.nextInt();
		int n = in.nextInt();
		for (int i = m; i <= n; i++) {
			if (i > 0) {
				System.out.print(i + ": ");
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						System.out.print(j + " ");
					}
				}
				System.out.println();	
			}
		}
	}
}
