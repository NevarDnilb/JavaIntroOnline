/*
 * 8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get- методы
 * и метод toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
 * «адать критерии выбора данных и вывести эти данные на консоль. 
 *  ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * 
 * Ќайти и вывести:
 * a) список покупателей в алфавитном пор€дке;
 * b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
 */
package CustomerTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SomeCustomers {
	private Customer[] customers;
	
	public SomeCustomers(Customer... args) {
		this.customers = args;
	}
	
	public Customer[] alphabetOrder() {
		Customer[] res = this.customers;
		Comparator<Customer> comparator = (first, second) -> {
			if (first.getSurname().compareTo(second.getSurname()) != 0) {
				return first.getSurname().compareTo(second.getSurname());
			} else if (first.getName().compareTo(second.getName()) != 0) {
				return first.getName().compareTo(second.getName());
			} else {
				return first.getPatronymic().compareTo(second.getPatronymic());
			}
		};
		Arrays.sort(res, comparator);
		return res;
	}
	public Customer[] cardNumberBetween(long left, long right) {
		ArrayList<Customer> buffer = new ArrayList<>();
		for (Customer customer: this.customers) {
			if ((left <= customer.getCardNumber()) && (right >= customer.getCardNumber())) {
				buffer.add(customer);
			}
		}
		Customer[] res = new Customer[buffer.size()];
		int i = 0;
		for (Customer customer: buffer) {
			res[i] = customer;
			i++;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Customer person1 = new Customer(10, "Ivanov", "Ivan", "Ivanovich", 
				"RB, Minsk, St. Yanki Kupaly 21-10", 1234567891, "BY06MMBN30120000101100000000");
		Customer person2 = new Customer(101, "Big", "Brother", "IsWatchigYou", 
				"UK, London, St. Sherlock Holm's 101-101", 101010101, "UK07BBIW10101010101010101010");
		Customer person3 = new Customer(21, "Klimovic", "Ivan", "Sergeevich", 
				"RB, Bobruisk, St. Kovzana 39-10", 2110977337, "BY04QWWM21103730101100000000");
		Customer person4 = new Customer(13, "Unlucky", "Jack", 
				"US, Las-Vegas, St. Hopeless 13-4", 1313131313, "US13LAMM13131313131313131313");
		SomeCustomers people = new SomeCustomers(person1, person2, person3, person4);
		Customer[] test = people.alphabetOrder();
		for (Customer elem: test) {
			System.out.println(elem.toString());
		}
		System.out.println();
		test = people.cardNumberBetween(111111111, 1999999999);
		for (Customer elem: test) {				   
			System.out.println(elem.toString());
		}
	}
}
