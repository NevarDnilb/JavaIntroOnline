/*
 * 3. Найти сумму квадратов первых ста чисел.
 */
public class Problem_3_3 {
	public static void main(String[] args) {
		long ans = 0;
		for (long i = 1; i <= 100; i++) {
			ans += i * i;
		}
		System.out.println("Answer: " + ans);
	}
}
