/*
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (b + sqrt(b^2 + 4ac)/2a - a^3*c + b^(-2) 
*/	
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_1_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		System.out.print("c = ");
		double c = in.nextDouble();
		double ans = (b + sqrt(pow(b, 2) + 4 * a * c)) / 2 / a - pow(a, 3) * c + pow(b, -2);
		System.out.println("Answer: " + ans);
	}

}
