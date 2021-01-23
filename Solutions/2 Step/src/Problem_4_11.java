/*
 * 11. Íàïèñàòü ìåòîä(ìåòîäû), îïğåäåëÿşùèé, â êàêîì èç äàííûõ äâóõ ÷èñåë áîëüøå öèôğ.
 */
import java.util.Scanner;

public class Problem_4_11 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int first = in.nextInt();
		int second = in.nextInt();
		System.out.println("Answer: " + hasLagerLength(first, second));
	}
	
	public static int hasLagerLength(int first, int second) {
		if (getLength(first) >= getLength(second)) { return first; }
		else {return second; }
	}
	public static int getLength(int n) {
		int res = 0;
		while (n > 0) {
			res++;
			n = n / 10;
		}
		return res;
	}
}
