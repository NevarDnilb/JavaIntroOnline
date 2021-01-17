/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sin x + cos y)/(cos x - sin y) * tg xy
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_1_3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		double x = in.nextDouble();
		System.out.print("y = ");
		double y= in.nextDouble();
		double ans = (sin(x) + cos(y)) / (cos(x) -sin(y)) * tan(x*y);
		System.out.println("Answer: " + ans);
	}

}
