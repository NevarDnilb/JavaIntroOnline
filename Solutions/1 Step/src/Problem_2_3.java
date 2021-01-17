/*
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
import java.util.Scanner;

public class Problem_2_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x1 = ");
		double x1 = in.nextDouble();
		System.out.print("y1 = ");
		double y1 = in.nextDouble();
		System.out.print("x2 = ");
		double x2 = in.nextDouble();
		System.out.print("y2 = ");
		double y2 = in.nextDouble();
		System.out.print("x3 = ");
		double x3 = in.nextDouble();
		System.out.print("y3 = ");
		double y3 = in.nextDouble();
		if ((x1 / y1 == x2 / y2) && (x1 / y1 == x3 / y3)) {
			System.out.println("On one line");
		} else {
			System.out.println("Not on one line");
		}
	}

}
