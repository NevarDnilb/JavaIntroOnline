/*
 * 8. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 * 
 * ����. ������� ������������ ��� ��������, ����� �� �������� � 20 ���������� �����������.
 * 		 ������ ��� ������ ���� � ��� ������������� ������ String � ��� �������. 
 * 		 ��������, ��������� ����������� switch (case), �� � �������� ��� ���������� ������� ����������.
 */
import java.util.Scanner;

public class Problem_3_8 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		String numb1 = Integer.toString(in.nextInt());
		String numb2 = Integer.toString(in.nextInt());
		boolean[] flagArray1 = new boolean[10];
		boolean[] flagArray2 = new boolean[10];	
		for (int i = 0; i <= 9; i++) {
			String figure = Integer.toString(i);
			flagArray1[i] = numb1.contains(figure);
			flagArray2[i] = numb2.contains(figure);
			if ((flagArray1[i]) && (flagArray2[i])) {
				System.out.print(i + " ");
			}
		}
	}
}
