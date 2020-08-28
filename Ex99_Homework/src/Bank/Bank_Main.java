package Bank;

public class Bank_Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		//계좌 생성
		System.out.println("=========계좌생성========");
		bank.addAccount("1", "김");
		bank.addAccount("2", "이");
		bank.addAccount("3", "박");
		bank.addAccount("4", "김");
		
		//계좌 찾기(계좌번호로)
		System.out.println("\n=====계좌찾기(계좌번호)=====");
		System.out.printf("계좌정보(계좌번호:1):%s\n" ,
						   bank.getAccount("1"));
		
		//계좌 찾기(소유자명으로)
		System.out.println("\n=====계좌찾기(소유자명)=====");
		System.out.printf("계좌정보(소유자 명:김):%s\n",
						   bank.findAccounts("김"));
		
		
		//계좌 목록 보기
		System.out.println("\n=========계좌목록========");
		bank.getAccounts();
		
		//총 계좌수
		System.out.println("\n========총 계좌 수========");
		System.out.println("총 계좌수:" + bank.getTotalAccount() + "개");

	
		//거래
		//입금
		System.out.println("\n==========입금==========");
		System.out.printf("입금액(계좌번호:1):%d원\n", 5000);
		bank.getAccount("1").deposit(5000);

		//출금
		System.out.println("\n==========출금==========");
		System.out.printf("출금액(계좌번호:1):%d원\n", 1000);
		bank.getAccount("1").withdraw(1000);
		
		//잔고확인
		System.out.println("\n=========잔고확인========");
		System.out.printf("잔고(계좌번호:1):%s\n", bank.getAccount("1").getBalance());
		
		
		//거래내역
		System.out.println("\n=========거래내역========");
		System.out.println("<계좌번호:1>");
		bank.getAccount("1").getTransactions();
	}
}