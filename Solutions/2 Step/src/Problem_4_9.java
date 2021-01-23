/*
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_4_9 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X, Y, Z and T: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		double z = in.nextDouble();
		double t = in.nextDouble();
		System.out.println("Anser: " + area(x, y, z, t));
	}
	
	public static double area(double x, double y, double z, double t) {
		double res = x * y / 2;
		double hypot = sqrt(pow(x, 2) + pow(y, 2));
		double halfPerim = (hypot + z + t) / 2;
		res += sqrt(halfPerim * (halfPerim - hypot) * (halfPerim - z) * (halfPerim - t));
		return res;
	}
}
