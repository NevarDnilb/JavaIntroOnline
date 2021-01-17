/*
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае.
 */
import java.util.Scanner;

public class Problem_1_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x, y: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		boolean belong = false;
		if ((y > 0) && (y <= 4) && (x >= -2) && (x <= 2)) 
			{ belong = true;}
		if ((y <= 0) && (y >= -3) && (x >= -4) && (x <= 4))
			{ belong = true;}
		System.out.println(Boolean.toString(belong));
	}
}
