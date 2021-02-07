/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Triangle {
	private double aX;
	private double aY;
	private double bX;
	private double bY;
	private double cX;
	private double cY;
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		this.aX = x1;
		this.aY = y1;
		this.bX = x2;
		this.bY = y2;
		this.cX = x3;
		this.cY = y3;
	}
	
	private static double distanceBetween(double x1, double y1, double x2, double y2) {
		double res = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
		return res;
	}
	public double perimeter() {
		double res = distanceBetween(this.aX, this.aY, this.bX, this.bY) +
				distanceBetween(this.aX, this.aY, this.cX, this.cY) + distanceBetween(this.cX, this.cY, this.bX, this.bY);
		return res;
	}
	public double area() {
		double halfP = this.perimeter() / 2;
		double ab = distanceBetween(this.aX, this.aY, this.bX, this.bY);
		double ac = distanceBetween(this.aX, this.aY, this.cX, this.cY);
		double bc = distanceBetween(this.cX, this.cY, this.bX, this.bY);
		double res = sqrt(halfP * (halfP - ab) * (halfP - ac) * (halfP - bc));
		return res;
	}
	public double[] medianInterseptionPoint() {
		double[] res = new double[2];
		double xA1 = (this.bX + this.cX) / 2;
		res[0] = (this.aX + 2 * xA1) / 3;
		double yA1 = (this.bY + this.cY) / 2;
		res[1] = (this.aY + 2 * yA1) / 3;
		return res;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter coordinates of vertices A, B and C: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		Triangle triangle = new Triangle(x1,y1, x2, y2, x3, y3);
		
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println("Area: " + triangle.area());
		double[] point = triangle.medianInterseptionPoint();
		System.out.println("Median interseption point (" + point[0] + "; " + point[1] + ")");
	}
}
