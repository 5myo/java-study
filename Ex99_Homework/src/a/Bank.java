package a;

import java.util.ArrayList;
import Bank.Account;

public class Bank {
	private ArrayList <Account> accounts;
	private int totalAccount;
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	//계좌생성
	//accountNo 계좌번호, name 이름
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name));
	}
	//(계좌번호)로 계좌를 찾는다
	public Account getAcount(String accountNo) {
		
		return null;
	}
}
