/*
 * 4. ƒано действительное число R вида nnn.ddd (три цифровых разр€да в дробной и целой част€х). ѕомен€ть местами
 * дробную и целую части числа и вывести полученное значение числа.
 */
import java.util.Scanner;

public class Problem_1_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number in format nnn,ddd: ");
		double num = in.nextDouble();
		int intPart = (int) num / 1;
		int fracPart = (int) (num * 1000) % 1000;
		double ans = fracPart + (intPart * 0.001);
		System.out.println(ans);
	}

}
