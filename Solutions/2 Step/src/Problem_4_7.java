/*
 * 7. Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Problem_4_7 {
	public static void main(String[] args) {
		System.out.println("Sum is " + sumOfFactorialsOfOddNumbers());
	}
	
	public static long sumOfFactorialsOfOddNumbers() {
		long res = 0;
		for (int i = 1; i < 10; i +=2) {
			long factorial = 1;
			for (int j = 2; j <= i; j++) {
				factorial = factorial * j;
			}
			res += factorial;
		}
		return res;
	}
}
