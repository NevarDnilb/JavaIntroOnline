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

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookShelf {
	private Book[] shelf;
	
	public BookShelf(Book...books) {
		this.shelf = books;
	}
	
	public Book[] booksByAuthor(String anAouthor) {
		ArrayList<Book> buffer = new ArrayList<>();
		Pattern pattern = Pattern.compile(anAouthor);
		for (Book book: this.shelf) {
			Matcher matcher = pattern.matcher(book.getAuthors());
			if (matcher.find()) {
				buffer.add(book);
			}
		}
		Book[] res = new Book[buffer.size()];
		int i = 0;
		for (Book book: buffer) {
			res[i] = book;
			i++;
		}
		return res;
	}
	
	public Book[] booksOfPublisher(String aPublisher) {
		ArrayList<Book> buffer = new ArrayList<>();
		Pattern pattern = Pattern.compile(aPublisher);
		for (Book book: this.shelf) {
			Matcher matcher = pattern.matcher(book.getPublisher());
			if (matcher.find()) {
				buffer.add(book);
			}
		}
		Book[] res = new Book[buffer.size()];
		int i = 0;
		for (Book book: buffer) {
			res[i] = book;
			i++;
		}
		return res;
	}
	
	public Book[] booksAfterYear(int aYear) {
		ArrayList<Book> buffer = new ArrayList<>();
		for (Book book: this.shelf) {
			if (book.getYear() > aYear){
				buffer.add(book);
			}
		}
		Book[] res = new Book[buffer.size()];
		int i = 0;
		for (Book book: buffer) {
			res[i] = book;
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Book book1 = new Book(10, "How to Write Your First Book", "Blinov E.S.", "Bobruisk Typography", 1997, 404, 1387, Book.Format.HARDCOVER);
		Book book2 = new Book(101, "Little Sister", "Orwell G.", "Ministry of Truth", 1984, 101, 501, Book.Format.SOFTCOVER);
		Book book3 = new Book(123, "One Two Three", "One T.T.", "OTT Typography", 1234, 123, 123, Book.Format.SOFTCOVER);
		Book book4 = new Book(13, "It's Your Unlucky Day", "Unluky J.", "Who Knows Typography", 1313, 6, 1313, Book.Format.BOOKLET);
		Book book5 = new Book(42, "The AnswerIs...", "Bigbrain A.I.", "Some Planet", 1982, 42, 420, Book.Format.HARDCOVER);
		Book book6 = new Book(456123789, "Sky Legacy", "Lukas G., Abramse J.J.", "Far Far Galaxy", 1977, 456, 66, Book.Format.HARDCOVER);
		Book book7 = new Book(15, "Frendly Heibhor", "Lee S., Ditco.S", "Multivers Typography", 1962, 37, 1000, Book.Format.JOURNAL);
		Book book8 = new Book(11, "How to Sell Your First Book", "Blinov E.S.", "Bobruisk Typography", 1997, 404, 387, Book.Format.SOFTCOVER);
		
		BookShelf myShelf = new BookShelf(book1, book2, book3, book4, book5, book6, book7, book8);
		
		System.out.println("Books by Blinov E.S: ");
		for (Book book: myShelf.booksByAuthor("Blinov E.S.")) {
			System.out.println(book.toString());
		}
		System.out.println();
		
		System.out.println("Books of 'Far Far Galaxy'");
		for (Book book: myShelf.booksOfPublisher("Far Far Galaxy")) {
			System.out.println(book.toString());
		}
		System.out.println();
		
		System.out.println("Books after 1917");
		for (Book book: myShelf.booksAfterYear(1917)) {
			System.out.println(book.toString());
		}
		System.out.println();
	}
}
