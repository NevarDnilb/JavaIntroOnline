/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */
import java.util.Scanner;

public class Problem_2_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		System.out.print("c = ");
		double c = in.nextDouble();
		System.out.print("d = ");
		double d = in.nextDouble();	
		double min1 = a;
		if (min1 > b) { min1 = b;}
		double min2 = c;
		if (min2 > d) { min2 = b;}
		double ans = min1;
		if (ans < min2) { ans = min2;}
		System.out.println("Answer: " + ans);
	}

}
