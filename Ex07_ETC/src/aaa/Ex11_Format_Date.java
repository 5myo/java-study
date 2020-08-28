package aaa;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex11_Format_Date {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyMMddHHmm");
		System.out.println(dateFormat.format(cal.getTime()));
		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(123567.89);
		System.out.println(result);
	}
}
