/*
 * 9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
package bookShelfTest;

public class Book {
	protected static enum Format {HARDCOVER, SOFTCOVER, JOURNAL, BOOKLET};
	
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int year;
	private int pages;
	private int value;
	private Format cover;
	
	public Book(int anId, String aName, String theAuthors, String aPublisher, int aYear, int thePages, int aValue, Format aCover) {
		this.id = anId;
		this.name = aName;
		this.author = theAuthors;
		this.publisher = aPublisher;
		this.year = aYear;
		this.pages = thePages;
		this.value = aValue;
		this.cover = aCover;
	}

	public int getId() {
		return this.id;
	}
	public String getBookName() {
		return this.name;
	}
	public String getAuthors() {
		return this.author;
	}
	public String getPublisher() {
		return this.publisher;
	}
	public int getYear() {
		return this.year;
	}
	public int getPages() {
		return this.pages;
	}
	public int getValue() {
		return this.value;
	}
	public Format getFormat() {
		return this.cover;
	}
	
	public void setId(int newValue) {
		this.id = newValue;
	}
	public void setAuthors(String newValue) {
		this.author = newValue;
	}
	public void setBookName(String newValue) {
		this.name = newValue;
	}
	public void setPublisher(String newValue) {
		this.publisher = newValue;
	}
	public void setYear(int newValue) {
		this.year = newValue;
	}
	public void setPages(int newValue) {
		this.pages = newValue;
	}
	public void setValue(int newValue) {
		this.value = newValue;
	}
	public void setFormat(Format newValue) {
		this.cover = newValue;
	}
	
	public String toString() {
		return "Book # " + this.id + ". Name: " + this.name + ". Author(s): " + this.author + ". Publisher: " + this.publisher + ". Year: " + this.year +
				". Pages: " + this.pages + ". Cost: " + this.value + ". Format: " + this.cover;
	}
}
