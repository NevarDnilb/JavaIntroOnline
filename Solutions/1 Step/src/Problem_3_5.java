/*
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 * a[n] = 1/2^n + 1/3^n.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_3_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter e: ");
		double e = in.nextDouble();
		double ans = 0;
		int i = 1;
		while (1/pow(2,i) + 1/pow(3,i) >= e) {
			ans +=1/pow(2,i) + 1/pow(3,i);		
			i++;
		}
		System.out.println("Answer: " + ans);
	}

}
