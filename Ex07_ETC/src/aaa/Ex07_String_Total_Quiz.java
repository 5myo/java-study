//주민번호 : 뒷번호 첫자리 : 1,3 남자 , 2,4 여자 라고 출력 ... 하는 문제
//main 함수 Scanner  사용 주민번호 입력받고
//앞:6자리     뒷:7자리
//입력값 : 123456-1234567 
//1. 자리수 체크 (기능)함수 (14 ok) return true, false
//2. 뒷번호 첫번째 자리값 1~4까지의 값만 허용 기능함수	return true, false
//3. 뒷번호 첫번째 자리값을 가지고 1,3 남자 , 2,4 여자 출력 기능함수 void 출력
//3개의 함수 static 
package aaa;

import java.util.Scanner;

public class Ex07_String_Total_Quiz {
//	 String jumin = "123456-1234567";
//	 static Scanner scanner = new Scanner(System.in);
//	
//	//1번 문제
//	static boolean juminCheck(String jumin) {
//		System.out.println("주민번호 14자리를 입력해 주세요" );
//		String input = scanner.nextLine();
//		boolean juminnum = (input.length()==14)? true : false;
//		System.out.println(juminnum);
//		return true;
//	}
	static boolean juminCheck(String jumin) {
		return (jumin.length() == 14)? true:false;
	}
	
	static boolean limitNumber(String jumin) {
		return (Integer.parseInt(jumin.substring(7,8)) >=1 && Integer.parseInt(jumin.substring(7,8)) <=4) ? true:false;
	}
	static void outPutGender(String jumin) {
		int num = Integer.parseInt(jumin.substring(7,8));
		if(num == 1 || num == 3) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}
	
	public static void main(String[] args) {
		//주민번호를 입력받아서
		System.out.println("주민번호를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String juminnumber = scanner.nextLine();
		if(juminCheck(juminnumber) && limitNumber(juminnumber)) {
			outPutGender(juminnumber);
		}else {
			System.out.println("다시 입력해주세요");
		}
	}
}
