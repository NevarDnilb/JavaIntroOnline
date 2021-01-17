/*
 * 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
*/	
import java.util.Scanner;

public class Problem_1_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		int a = in.nextInt();
		System.out.print("b = ");
		int b = in.nextInt();
		System.out.print("c = ");
		int c = in.nextInt();
		double ans = ((a - 3) * b / 2) + c;
		System.out.println("z = ((" + a + " - 3) * " + b + " / 2) + " + c + " = "+ ans);
	}

}
