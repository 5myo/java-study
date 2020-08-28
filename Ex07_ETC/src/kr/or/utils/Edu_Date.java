package kr.or.utils;

import java.util.Calendar;

//설계도
//편하게 (많이 사용)기능
//static, 함수를 여러개(하나의 이름)

public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "년" +
					(date.get(Calendar.MONTH) + 1) + "월" +
					date.get(Calendar.DATE) + "일";
	}
	
	public static String DateString(Calendar date , String opr) {
		return date.get(Calendar.YEAR) + opr + 
				     (date.get(Calendar.MONTH) + 1) + opr +
				     date.get(Calendar.DATE);
	}
	//요구사항
	//2020-08-26
	//1~9월 >> 01, 02 … 09
	//10, 11, 12 >> 그대로 출력
	public static String monthFormat_DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH) +1) < 10) {
			month = "0"+ (date.get(Calendar.MONTH) +1);
		}else {
			month = String.valueOf((date.get(Calendar.MONTH) +1));
		}
		//String.valueOf()  숫자를 -> 문자로
		//Integer.parseInt(s)  문자를  -> 정수로
		return date.get(Calendar.YEAR) + "년" 
				+ month + "월" 
				+ date.get(Calendar.DATE) +"일" ;
	}
}
