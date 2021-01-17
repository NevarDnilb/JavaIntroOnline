/*
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = {x, if x>2
 * 		-x, if x<=2
 */
import java.util.Scanner;

public class Problem_3_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a, b and h: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double h = in.nextDouble();
		for (double i = a; i <= b; i += h) {
			if (i <= 2) { System.out.println("y(" + i + ") = " + (-i));}
			else {System.out.println("y(" + i + ") = " + i);}
		}
	}
}
