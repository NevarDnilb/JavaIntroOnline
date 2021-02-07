/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1_1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = Integer.parseInt(in.nextLine());
		char[][] names = new char[n][];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name #" + (i+1));
			String s = in.nextLine();
			names[i] = new char[s.length()];
			names[i] = s.toCharArray();
			ArrayList<Character> buffer = new ArrayList<>();
			for (int j = 0; j < names[i].length; j++) {
				if (Character.isUpperCase(names[i][j])) {
					buffer.add('_');
				}
				buffer.add(Character.toLowerCase(names[i][j]));	
			}
			names[i] = new char[buffer.size()];
			int j = 0;
			for (Character symb: buffer) {
				names[i][j] = symb.charValue();
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j]);
			}
			System.out.println();
		}
	}
}
