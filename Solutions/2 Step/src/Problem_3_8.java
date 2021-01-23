/*
 * 8.ƒаны дроби p1/q1, p2/q2,...,pn/qn (pi, qi - натуральные). —оставить программу, 
 * котора€ приводит эти дроби к общему знаменателю и упор€дочивает их в пор€дке возрастани€.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Problem_3_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter p[" + (i+1) + "] and q[" + (i+1) + "]: ");
			p[i] = in.nextInt();
			q[i] = in.nextInt();
		}
		int commonDenominator = 1;
		for (int i = 0; i < n; i++) {
			commonDenominator = leastCommonMultiple(commonDenominator, q[i]);
		}
		for (int i = 0; i < n; i++) {
			p[i] = p[i] * commonDenominator / q[i];
		}
		Arrays.sort(p);
		for (int i = 0; i < n; i++) {
			System.out.println(p[i] + "/" + commonDenominator);
		}
	}
	public static int leastCommonMultiple(int first, int second) {
		int res = first * second / gratestCommonDivisor(first, second);
		return res;
	}
	public static int gratestCommonDivisor(int first, int second) {
		while ((first > 0) && (second > 0)) {
			if (first > second) { first = first % second; }
			else { second = second % first; }
		}
		if (first == 0) { return second; }
		else {return first; }
	}
}
