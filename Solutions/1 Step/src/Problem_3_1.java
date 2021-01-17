/*
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 * 
 * прим. Более оптимальным решением было бы использовать большие числа и считать ответ по форумле. 
 *		 Но так как заявлена тематика "Циклы", я решил не прибегать к большим числам, иначе программа 
 * 		 могла бы выполняться очень долго.  
 */
import java.util.Scanner;

public class Problem_3_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = in.nextInt();
		int ans = 0;
		for (int i = 1; i < num; i++) {
			ans += i;
		}
		System.out.println("Answer: " + ans);
	}
}
