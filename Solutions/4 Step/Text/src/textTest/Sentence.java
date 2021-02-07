/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
package textTest;

public class Sentence {
	private Word[] sentence;
	
	public Sentence(Word...words) {
		this.sentence = words;
	}
	
	public Word[] getSentence() {
		return this.sentence;
	}
	public void setSentence(Word...words) {
		this.sentence = words;
	}
	public String toString() {
		StringBuilder res = new StringBuilder(this.sentence[0].toString());
		for (int i = 1; i < this.sentence.length; i++) {
			res.append(" ");
			res.append(this.sentence[i].toString());
		}
		return res.toString();
	}
}
