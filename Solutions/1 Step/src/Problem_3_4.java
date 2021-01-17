/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел
 */
import java.math.BigInteger;

public class Problem_3_4 {
	public static void main(String[] args) {
		BigInteger ans = new BigInteger("1");
		for (int i = 1; i <= 200; i++) {
			BigInteger bigSquare = new BigInteger(Integer.toString(i * i));
			ans = ans.multiply(bigSquare);
		}
		System.out.println("Answer: " + ans);
	}
}
