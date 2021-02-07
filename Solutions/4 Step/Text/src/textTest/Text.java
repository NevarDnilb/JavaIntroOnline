/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */
package textTest;

public class Text {
	private Sentence[] text;
	
	public Text(Sentence...sentences) {
		this.text = sentences;
	}
	
	private void setText(Sentence[] newText) {
		this.text = newText;
	}
	
	public String toString() {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < this.text.length; i++) {
			res.append(this.text[i].toString());
			res.append(". ");
		}
		return res.toString();
	}
	
	public String printHeadline() {
		return this.text[0].toString();
	}
	 public void addToText(Sentence sentence) {
		 Sentence[] buffer = new Sentence[this.text.length + 1];
		 for (int i = 0; i < this.text.length; i++) {
			 buffer[i] = this.text[i];
		 }
		 buffer[buffer.length - 1] = sentence;
		 this.setText(buffer);
	 }
	 public void addToText(Word...words) {
		 Sentence[] buffer = new Sentence[this.text.length + 1];
		 Sentence sentence = new Sentence(words);
		 for (int i = 0; i < this.text.length; i++) {
			 buffer[i] = this.text[i];
		 }
		 buffer[buffer.length - 1] = sentence;
		 this.setText(buffer);
	 }
	 
	 public static void main(String[] args) {
		 Word word1 = new Word("HEADLINE");
		 Word word2 = new Word("ENILDAEH");
		 Word word3 = new Word("Second");
		 Word word4 = new Word("sentence");
		 Word word5 = new Word("Added");
		 Word word6 = new Word("sentence");
		 
		 Sentence headline = new Sentence(word1, word2);
		 Sentence secondSentence = new Sentence(word3, word4);
		 Sentence addedSentence = new Sentence(word5, word6);
		 
		 Text text = new Text(headline, secondSentence);
		 
		 System.out.println(text.printHeadline());
		 System.out.println(text.toString());
		 
		 text.addToText(addedSentence);
		 System.out.println(text.toString());
		 
		 text.addToText(word5, word6);
		 System.out.println(text.toString());
	 }
}
