/*
 * 16. Магическим квадратом порядка n называется квадратная матрица размера nxn, 
 * составленная из чисел 1, 2, 3,...,n^2 так, что суммы по каждому столбцу, 
 * каждой строке и каждой из двух больших диагоналей равны между собой. 
 * Построить такой квадрат. Пример магического квадрата порядка 3:
 * [6, 1, 8]
 * [7, 5, 3]
 * [2, 9, 4]
 * 
 * прим. На данный момент программа выдаёт корректный ответ при нечётном n и ечли n кратно 4.
 */
import java.util.Scanner;
import static java.lang.Math.*;

public class Problem_2_16 {
	private static long[][] matrix;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		if (n % 2 > 0) { formOddMatrix(n); }
		else if (n % 4 == 0) { formEvenEvenMatrix(n); }
		else { formEvenOddMatrix(n); } 
		for (int i = 0; i < n; i++) {
			System.out.print("[");
			for (int j = 0; j < (n-1); j++) {
				System.out.printf("%3d, ",getMatrix(i, j));
			}
			System.out.printf("%3d]\n", getMatrix(i, n-1));
		}
		/*
		System.out.println("Wanted value: " + ((long) (pow(n, 3) + n) / 2));
		System.out.println(sumOfFirstDiagonal());
		System.out.println(sumOfSecondDiagonal());
		for (int i = 0; i < n; i++) {
			System.out.println(sumOfLine(i));
		}
		*/
	}
	public static long getMatrix(int first, int second) {
		return matrix[first][second];
	}
	
	public static void formOddMatrix(int size) {
		setSize(size);
		int i = 1;
		int j = size / 2 -1; 
		int value = 0;
		while (value <= pow(size, 2) - 1) {
			for (int k = 1; k <= size; k++) {				
				value++;
				i--;
				j++;
				if (i < 0) { i = size - 1; }
				if (j >= size) { j = 0; }
				matrix[i][j] = value;
			}	
			i += 2;
			j--;
			if (i >= size) { i = 0; }
			if (j < 0) { j = size - 1; }
		}
	}
	public static void formEvenEvenMatrix(int size) {
		setSize(size);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = i * size + j + 1;
			}
		}
		for (int i = 0; i < size / 2; i++) {
			for (int j = 0; j < size / 2; j++) {
				if ((i + j) % 2 != 0) {
					long swap = matrix[i][j];
					matrix[i][j] = matrix[size - i -1][size - j - 1];
					matrix[size - i - 1][size - j - 1] = swap;
				}	
			}
		}
		for (int i = 0; i < size / 2; i++) {
			for (int j = size / 2; j < size; j++) {
				if ((i + j) % 2 == 0) {
					long swap = matrix[i][j];
					matrix[i][j] = matrix[size - i -1][size - j - 1];
					matrix[size - i - 1][size - j - 1] = swap;
				}	
			}
		}
	}
	public static void formEvenOddMatrix(int size) {
		setSize(size);
		/*
		int i = 1;
		int j = size / 4 -1; 
		int value = 0;
		while (value <= pow(size / 2, 2) - 1) {
			for (int k = 1; k <= size / 2; k++) {				
				value++;
				i--;
				j++;
				if (i < 0) { i = size / 2 - 1; }
				if (j >= size / 2) { j = 0; }
				matrix[i][j] = value;
			}	
			i += 2;
			j--;
			if (i >= size / 2) { i = 0; }
			if (j < 0) { j = size / 2 - 1; }
		}
		for (int k = 0; k < size; k++) {
			for (int l = 0; l < size; l++) {
				if (k < size / 2) {
					if (l >= size / 2) {
						matrix[k][l] = (long) (matrix[k][l- size/ 2] + 2 * pow(size / 2,2));
					}
				} else {
					if (l < size / 2) {
						matrix[k][l] = (long) (matrix[k - size / 2][l] + 3 * pow(size / 2, 2));
					} else {
						matrix[k][l] = (long) (matrix[k - size / 2][l - size / 2] + pow(size / 2, 2));
					}
				}
			}
		}
		boolean[][] used = new boolean[size][size];
		for (int k = 0; k < size; k++) {
			for (int l = 0; l < size; l++) {
				used[k][l] = false;
			}
		}
		
		used[size / 4][size / 4] = true;
		used[size / 4][3 * size / 4] = true;
		used[3 * size / 4][3 * size / 4] = true;
		used[3 * size / 4][size / 4] = true;
		
		long wantedValue = (long) ((pow(size, 3) + size) / 2);
		long sumOfDiagonal = sumOfFirstDiagonal();
		long numOfAction1 = (long) ((wantedValue - sumOfDiagonal) / 3 / pow(size / 2, 2));
		long numOfAction2 = (long) ((wantedValue - 3 * pow(size / 2, 2) * numOfAction1 - sumOfDiagonal) / pow(size / 2, 2));
		
		long swap;
		i = 0;
		j = 0;		
		for (int k = 0; k < numOfAction1; k++) {
			while (used[i][j]) {
				i++;
				j++;
			}
			swap = matrix[i][j];
			matrix[i][j] = matrix[i + size / 2][j];
			matrix[i + size / 2][j] = swap;
			used[i][j] = true;
			used[i + size / 2][j] = true;
		}
		i = size - 1;
		j = 0;
		for (int k = 0; k < numOfAction1; k++) {
			while (used[i][j]) {
				i--;
				j++;
			}
			swap = matrix[i][j];
			matrix[i][j] = matrix[i - size / 2][j];
			matrix[i - size / 2][j] = swap;
			used[i][j] = true;
			used[i - size / 2][j] = true;
		}
		
		i = size / 2;
		j = size / 2;		
		for (int k = 0; k < numOfAction2; k++) {
			while (used[i][j]) {
				i++;
				j++;
			}
			swap = matrix[i][j];
			matrix[i][j] = matrix[i - size / 2][j];
			matrix[i - size / 2][j] = swap;
			used[i][j] = true;
			used[i - size / 2][j] = true;
		}
		i = size / 2 - 1;
		j = size / 2;
		for (int k = 0; k < numOfAction2 ; k++) {
			while (used[i][j]) {
				i--;
				j++;
			}
			swap = matrix[i][j];
			matrix[i][j] = matrix[i + size / 2][j];
			matrix[i + size / 2][j] = swap;
			used[i][j] = true;
			used[i + size / 2][j] = true;
		}
		for (int k = 0; k < size; k++) {
			used[k][k] = true;
			used[size - k - 1][k] = true;
		}
		*/
	}
	public static void setSize(int size) {
		matrix = new long[size][size];
	}
	public static int getSize(){
		return matrix.length;
	}
	public static long sumOfFirstDiagonal() {
		long res = 0;
		int size = getSize();
		for (int i = 0; i < size; i++) {
			res += matrix[i][i];
		}
		return res;
	}
	public static long sumOfSecondDiagonal() {
		long res = 0;
		int size = getSize();
		for (int i = 0; i < size; i++) {
			res += matrix[i][size - i - 1];
		}
		return res;
	}
	public static long sumOfLine(int line) {
		long res = 0;
		int size = getSize();
		for (int i = 0; i < size; i++) {
			res += matrix[line][i];
		}
		return res;
	}
}
