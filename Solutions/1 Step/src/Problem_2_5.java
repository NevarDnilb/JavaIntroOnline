/*
 * 5. Вычислить значение функции:
 * F(x) = {x^2-3x+9, if x<=3;
 * 		   1/(x^3+6), if x>3.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_2_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		double x = in.nextDouble();
		double ans;
		if (x <= 3) { ans = pow(x,2) - 3 * x + 9;}
		else {ans = 1 / (pow(x,3) + 6);}
		System.out.println("Answer: " + ans);
	}
}
