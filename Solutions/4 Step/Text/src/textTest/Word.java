/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
package textTest;

public class Word {
	private String word;
	
	public Word(String aWord) {
		this.word = aWord;
	}
	
	public String getWord() {
		return this.word;
	}
	public void setWord(String newWord) {
		this.word = newWord;
	}	
	public String toString() {
		return this.word;
	}
}
