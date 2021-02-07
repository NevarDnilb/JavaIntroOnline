/*
 * 8. ������� ����� Customer, ������������ �������� ��������� ����. ���������� ������������, set- � get- ������
 * � ����� toString(). ������� ������ �����, ������������ ������ ���� Customer, � ����������� �������������� � ��������. 
 * ������ �������� ������ ������ � ������� ��� ������ �� �������. 
 * ����� Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, ����� ����������� �����.
 * 
 * ����� � �������:
 * a) ������ ����������� � ���������� �������;
 * b) ������ �����������, � ������� ����� ��������� �������� ��������� � �������� ���������
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
