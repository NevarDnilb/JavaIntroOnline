/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
 * отсортировать абзацы по количеству предложений; 
 * в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.
 * 
 * прим. Когда будете вводить тект, последней строкой должна быть "-The End-", ибо на данный момент я не придумал болле удобного способа.
 * И мне из условия не совсем понятно, что значит "текст храниться в строке". 
 * А именно непонятно в каком формате записана эта строка и каким образом идёт разделение на абзацы.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class Problem_3_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter symbol: ");
		String symb = in.nextLine();
		System.out.println("Enter text. Last paragraph must be ''-The End-'' (without quotation marks).");
		String[] paragraphs = readText(in);
		int textSize = paragraphs.length;
		String[][] sentences = new String[textSize][];
		for (int i = 0; i < textSize; i++) {
			sentences[i] = parseParagraphToSentences(paragraphs[i]);
		}
		String[][][] words = new String[textSize][][];
		for (int i = 0; i < textSize; i++) {
			int paragraphSize = sentences[i].length;
			words[i] = new String[paragraphSize][];
			for (int j = 0; j < paragraphSize; j++) {
				words[i][j] = parseSentenceToWords(sentences[i][j]);
			}
		}
		// Сортировка абзацев по неубыванию количества предложений
		String[] sortedParagraphs = sortParagraphs(paragraphs);
		/* Вывод в консоль
		for (String line: sortedParagraphs) {
			System.out.println(line);
		}
		System.out.println();
		*/
		// Сортировка слов в каждом предлодении по длинне
		String[][][] sortedWordsByLength = sortWordsByLength(words);
		/* Вывод в консоль
		for (int i = 0; i < textSize; i++) {
			for (int j = 0; j < sortedWordsByLength[i].length; j++) {
				for (String word: sortedWordsByLength[i][j]) {
					System.out.print(word + " ");
				}
				System.out.println();
			}
			System.out.println("_____________________");
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!");
		*/
		//Сортировка слов по невозрастанию количества вхождений в них заданного символа. 
		String[][][] sortedWordsBySymbol = sortWordsBySymbol(words, symb);
		/* Вывод в консоль
		for (int i = 0; i < textSize; i++) {
			for (int j = 0; j < sortedWordsBySymbol[i].length; j++) {
				for (String word: sortedWordsBySymbol[i][j]) {
					System.out.print(word + " ");
				}
				System.out.println();
			}
			System.out.println("_____________________");
		}
		*/
	}	
	
	public static String[] readText(Scanner input) {
		ArrayList<String> buffer = new ArrayList<>();
		while (input.hasNext()) {
			String line = input.nextLine();
			if (line.equals("-The End-")) {
				break;
			}
			buffer.add(line);
		}
		String[] res = new String[buffer.size()];
		int i = 0;
		for (String paragraph: buffer) {
			res[i] = paragraph;
			i++;
		}
		return res;
	}
	public static String[] parseParagraphToSentences(String paragraph) {
		String template = "[\\.||\\?||\\!]\\s*";
		Pattern pattern = Pattern.compile(template);
		String[] res = pattern.split(paragraph);
		return res;
	}
	public static String[] parseSentenceToWords(String sentence) {
		String template = "[\\s||,||;||:||—]\\s*";
		Pattern pattern = Pattern.compile(template);
		String[] res = pattern.split(sentence);
		return res;
	}
	public static String[] sortParagraphs(String[] paragraph) {
		int size = paragraph.length;
		String[] res = new String[size];
		int[] order = new int[size];
		String[][] sentence = new String[size][];
		for (int i = 0; i < size; i++) {
			sentence[i] = parseParagraphToSentences(paragraph[i]);
			order[i] = i;
		}
		for (int i = 0; i < size - 1; i++) {
			int minInd = i;
			for (int j = i + 1; j < size; j++) {
				if (sentence[j].length < sentence[minInd].length) {
					minInd = j;
				}
			String[] swap = sentence[i];
			sentence[i] = sentence[minInd];
			sentence[minInd] = swap;
			
			int swapOrder = order[i];
			order[i] = order[minInd];
			order[minInd] = swapOrder;
			}
		}
		for (int i = 0; i < size; i++) {
			res[i] = paragraph[order[i]];
		}
		return res;
	}
	public static String[][][] sortWordsByLength(String[][][] words){
		String[][][] res = words;
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length; j++) {
				Arrays.sort(res[i][j], (first, second) -> first.length() - second.length());
			}
		}
		return res;
	}
	public static String[][][] sortWordsBySymbol(String[][][] words, String symb){
		String[][][] res = words;
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				Arrays.sort(res[i][j], (first, second) -> {
					if (nubmberOfMatches(first, symb) > nubmberOfMatches(second, symb)) {
						return -1;
					} else if (nubmberOfMatches(first, symb) < nubmberOfMatches(second, symb)) {
						return 1;
					} else return first.compareTo(second) * (-1);
				});
			}
		}
		return res;
	}
	public static int nubmberOfMatches(String line, String template) {
		int res = 0;
		Pattern pattern = Pattern.compile(template);
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			res++;
		}
		return res;
	}
}
