/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_4_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.printf("Area of hexagon is %.3f.", triangleArea(a) * 6);
	}
	public static double triangleArea(double x) {
		double res = sqrt(3) * x * x / 4;
		return res;
	}
}
