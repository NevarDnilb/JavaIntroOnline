/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
 *  имеющим положительный и отрицательный балансы отдельно.
 */
 package bank;

public class Account {
	private static int nextId = 1;
	
	private int id;
	private int balance;
	private boolean unblocked;
	
	public Account(int value) {
		this.id = generateId();
		this.balance = value;
		this.unblocked = true;
	}
	
	private int generateId() {
		int res = nextId;
		nextId++;
		return res;
	}
	
	public int getBalance() {
		return this.balance;
	}
	public int getId() {
		return id;
	}
	public void blockAccout() {
		this.unblocked = false;
	}
	public void unblockAccount() {
		this.unblocked = true;
	}
	public boolean isAvailable() {
		return this.unblocked;
	}
	
	public String toString() {
		return "Account#" + this.id +". Balance: " + this.balance + ". Unblocked: " + this.unblocked;
	}
}
