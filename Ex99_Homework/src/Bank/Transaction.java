package Bank;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long balance;
	
	public Calendar cal;
	public SimpleDateFormat dateFormat;
	public SimpleDateFormat timeFormat;

	Transaction(String kind, long amount, long balance) {
		this.cal = Calendar.getInstance();
		this.dateFormat = new SimpleDateFormat("yyyy년MM월dd일");
		this.timeFormat = new SimpleDateFormat("HH시mm분");
		
		this.transactionDate = dateFormat.format(cal.getTime());
		this.transactionTime = timeFormat.format(cal.getTime());
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[(" + kind + ")거래금액:" + this.amount + ", 잔액:" + this.balance + " /" + this.transactionDate + this.transactionTime + "]";
	}
	
	
}