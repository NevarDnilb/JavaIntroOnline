/*
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.
 */
import java.util.Scanner;

public class Problem_1_5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("T = ");
		int t = in.nextInt();
		int sec = t % 60;
		int min = (t / 60) % 60;
		int hour = t / 3600;
		System.out.printf("%02dч %02dмин %02dс", hour, min, sec);
	}
}
