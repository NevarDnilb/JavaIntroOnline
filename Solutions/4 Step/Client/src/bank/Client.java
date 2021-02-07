/*
 * 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, 
 *  имеющим положительный и отрицательный балансы отдельно.
 */
package bank;

import java.util.Arrays;

public class Client {
	private Account[] accounts;
	
	public Client(Account...theAccounts) {
		this.accounts = theAccounts;
	}
	
	public Account[] getAccounts() {
		return this.accounts;
	}
	
	public long sumAllAccounts() {
		long res = 0;
		for (Account acc: this.accounts) {
			res += acc.getBalance();
		}
		return res;
	}
	public long sumPositiveAccounts() {
		long res = 0;
		for (Account acc: this.accounts) {
			if (acc.getBalance() > 0) {
				res += acc.getBalance();
			}
		}
		return res;
	}
	public long sumNegativeAccounts() {
		long res = 0;
		for (Account acc: this.accounts) {
			if (acc.getBalance() < 0) {
				res += acc.getBalance();
			}
		}
		return res;
	}
	public Account[] sortById() {
		Account[] res = Arrays.copyOf(this.accounts, this.accounts.length);
		Arrays.sort(res, (first, second) -> (first.getId() - second.getId()));
		return res;
	}
	public Account[] sortByBalance() {
		Account[] res = Arrays.copyOf(this.accounts, this.accounts.length);
		Arrays.sort(res, (first, second) -> (first.getBalance() - second.getBalance()));
		return res;
	}
	
	public static void main(String[] args) {
		Account acc1 = new Account(100);
		Account acc2 = new Account(200);
		Account acc3 = new Account(-10);
		Account acc4 = new Account(-100);
		
		Client client = new Client(acc1, acc2, acc3,acc4);
		for (Account acc: client.sortByBalance()) {
			System.out.println(acc);
		}
		System.out.println();
		for (Account acc: client.sortById()) {
			System.out.println(acc);
		}
		System.out.println(client.sumAllAccounts() + " " + client.sumPositiveAccounts() + " " + client.sumNegativeAccounts());
	}
}
