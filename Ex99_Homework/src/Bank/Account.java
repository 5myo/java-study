package Bank;

import java.util.ArrayList;

public class Account {
//	private static Account account;
	
	private String accountNo;
	private String name;
	private long balance;
	private ArrayList<Transaction> transactions;
	

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		transactions = new ArrayList<Transaction>();
	}

	
	//메서드
	public void deposit(long amount) {
		this.balance += amount;
		transactions.add(new Transaction("입금", amount, this.balance));
	}
	
	public void withdraw(long amount) {
		this.balance -= amount;
		transactions.add(new Transaction("출금", amount, this.balance));
	}
	
	//잔고 확인
	public long getBalance() {
		return this.balance;
	}
	
	//거래내역 확인
	public void getTransactions() {
		for(Transaction value : transactions) {
			System.out.println(value.toString());
		}
	}
	

	@Override
	public String toString() {
		return "[계좌번호=" + this.accountNo + ", 소유자 명=" + this.name + ", 잔액=" + this.balance + "]";
	}
	
	//getter
	public String getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return name;
	}
	
	
}