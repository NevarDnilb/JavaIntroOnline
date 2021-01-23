/*
 * 4. Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы), определ€ющие, между какими
 * из пар точек самое большое рассто€ние. ”казание.  оординаты точек занести в массив.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_4_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter x" + (i+1) + " and y" + (i+1) + ": ");
			x[i] = in.nextDouble();
			y[i] = in.nextDouble();
		}
		int firstPoint = 0;
		int secondPoint = 0;
		double maxDistance = 0;
		for (int i = 0; i < (n-1); i++) {
			for (int j = i + 1; j < n; j++) {
				double currentDistance = distanceBetween(x[i], y[i], x[j], y[j]);
				if (currentDistance > maxDistance) {
					maxDistance = currentDistance;
					firstPoint = i;
					secondPoint = j;
				}
			}
		}
		System.out.printf("Max distance is between points (%.2f; %.2f) and (%.2f; %.2f).\n",
				x[firstPoint], y[firstPoint], x[secondPoint], y[secondPoint]);	
	}

	private static double distanceBetween(double x1, double y1, double x2, double y2) {
		double res = pow((x1 - x2), 2) + pow((y1 - y2), 2);
		return res;
	}
}
