/*
 * 6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Problem_3_6 {
	public static void main(String[] args) {
		int n = 65536;
		for (int i = 0; i <= n; i++) {
			char symb = (char) i;
			System.out.println(symb + " " + i);
		}
	}

}
