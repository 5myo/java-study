//https://cafe.naver.com/springbit
package aaa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_Format_Date {
	public static void main(String[] args) {
		Date curdate = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println("date : " + curdate);
		System.out.println("cal : " + cal);
		System.out.println("cal getTime() 함수 : " + cal.getTime());
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyMMddHHmm");
		System.out.println(curdate);	//날짜형식
		System.out.println(cal.getTime());	//getTime
		
		//사이트 정보 입력
		//문자열 >> 날짜 형식으로 변환
		String StringDate = "20200821212";
		try {
			Date stringdate = dateformat.parse(StringDate);
			System.out.println("stringdate : " + stringdate);
			
			long datelong = stringdate.getTime();
			System.out.println(datelong);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}

