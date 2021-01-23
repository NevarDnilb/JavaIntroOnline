/*
 * 6. «адана последовательность N вещественных чисел. ¬ычислить сумму чисел, пор€дковые номера которых
 * €вл€ютс€ простыми числами.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_1_6 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] a = new double[n];
		double sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + (i+1) + "] = ");
			a[i] = in.nextDouble();
			boolean indexIsSimple = true;
			if (i == 0) { indexIsSimple = false; }
			for (int j = 2; j <= sqrt(i + 1); j++) {
				if ((i + 1) % j == 0) { 
					indexIsSimple = false;
					break;
				}
			}	
			if (indexIsSimple) { sum = sum + a[i]; }				
		}
		System.out.print("Sum: " + sum);
	}
}
