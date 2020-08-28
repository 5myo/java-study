package Bank;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Account> accounts;
	private int totalAccount;
	
	public Bank() {
		accounts = new ArrayList<Account>();
	}
	
	//계좌생성
	//accountNo 계좌번호, name 성명
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name)); //주소와 이름을 Account 객체에 초기화 해준 후 동적 배열 변수 accounts에 추가
	}
	
	//리턴값: 일치 계좌(account) 객체의 주소값
	public Account getAccount(String accountNo) {
		int accountIndex = 0;
		for(int i = 0; i < accounts.size(); i++) {
			if(accounts.get(i).getAccountNo() == accountNo) {
				accountIndex = i;
			}
		}
		return accounts.get(accountIndex);	
	}
	
	//리턴값: 동명이인 계좌(homonymAccount)배열 객체의 주소값
	public ArrayList<Account> findAccounts(String name) {
		ArrayList<Account> homonymAccounts = new ArrayList<Account>();
		for(Account account : accounts) {
			if(account.getName().equals(name)) {
				homonymAccounts.add(account);
			}
		}
		return homonymAccounts;	
	}
	
	//계좌목록 출력
	public void getAccounts() {
		for(Account account : accounts) {
			System.out.println(account.toString());
		}
	}
	
	//리턴값: 총 계좌 수
	public int getTotalAccount() {
		this.totalAccount = accounts.size();
		return this.totalAccount;
	}
	
}