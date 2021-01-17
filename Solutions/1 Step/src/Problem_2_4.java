/*
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие.
 */
import java.util.Scanner;

public class Problem_2_4 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("A = ");
		double a = in.nextDouble();
		System.out.print("B = ");
		double b = in.nextDouble();
		System.out.print("x = ");
		double x = in.nextDouble();
		System.out.print("y = ");
		double y = in.nextDouble();
		System.out.print("z = ");
		double z = in.nextDouble();
		boolean possible = false;
		if ((x < a) && (x < b)) {
			if ((x < a) && ((z < b) || (y < b))) { possible = true;} 
			if ((x < b) && ((z < a) || (y < a))) { possible = true;}		
		} else if (((y < a) && (z < b)) || ((y < b) && (z < a))) { possible = true;}		
		if (possible) { System.out.println("Possible");}
		else {System.out.println("Impossible");}
	}
}
