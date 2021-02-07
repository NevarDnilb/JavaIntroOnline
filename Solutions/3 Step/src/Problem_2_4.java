/*
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class Problem_2_4 {
	public static void main(String[] args) {
		String informatics = "информатика";
		String cake = informatics.charAt(7) + informatics.substring(3, 5) + informatics.charAt(7);
		System.out.println(cake);
	}
}
