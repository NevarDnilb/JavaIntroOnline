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

public class Customer {
	
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long cardNumber;
	private String bankAccountNumber;
	
	public Customer(int anId, String aSurname, String aName, String aPatronymic, String anAddress, long aCard, String aBankAccount) {
		this.id = anId;
		this.surname = aSurname;
		this.name = aName;
		this.patronymic = aPatronymic;
		this.address = anAddress;
		this.cardNumber = aCard;
		this.bankAccountNumber = aBankAccount;
	}
	public Customer(int anId, String aSurname, String aName, String anAddress, long aCard, String aBankAccount) {
		this(anId, aSurname, aName, "", anAddress, aCard, aBankAccount);
	}
		
	public int getId() {
		return this.id;
	}
	public String getSurname() {
		return this.surname;
	}
	public String getName() {
		return this.name;
	}
	public String getPatronymic() {
		return this.patronymic;
	}
	public String getAddress() {
		return this.address;
	}
	public long getCardNumber() {
		return this.cardNumber;
	}
	public String getBancAccount() {
		return this.bankAccountNumber;
	}
	
	public void setId(int value) {
		this.id = value;
	}
	public void setSurname(String value) {
		this.surname = value;
	}
	public void setNname(String value) {
		this.name = value;
	}
	public void setPatronymic(String value) {
		this.patronymic = value;
	}
	public void setAddress(String value) {
		this.address = value;
	}
	public void setCardNumber(long value) {
		this.cardNumber = value;
	}
	public void setBancAccount(String value) {
		this.bankAccountNumber = value;
	}
	
	public String toString() {
		return  "Customer#" + this.id + ". Surname: " + this.surname + ". Name: " + this.name + ". Patronymic: " +
				this.patronymic + ". Address: " + this.address + ". Card Number: " +
				this.cardNumber + ". BanK Account: " + this.bankAccountNumber + ".";
	}
}
