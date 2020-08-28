/*
 String 클래스(문자열)
 String 수 많은 함수, 문자열을 조작(자르고 합치고)
 String >> static 함수 + 일반 함수
 15개 ~ 20개 함수
 */
package aaa;

public class Ex05_String_Class {
	public static void main(String[] args) {	
		String str = "";	//문자열의  초기화 >> null, ""
		//사용방법 : int, double처럼 쓰세요
		String[] strarr= {"aaa","bbb","ccc"};
		for(String s : strarr) {
			System.out.println(s);
		}
		//////////////////////////////////
		String stri = "홍길동";
		System.out.println(stri.length());
		System.out.println(stri.toString());
		System.out.println(stri); 	//주소값, 실제로 값(뒤에 toString() 생략)
		//Object 가지는 toString() 값을 출력하도록
		
		String stra = new String("홍길동");
		//1. String name = "가나다라마"; >>
		//String은 내부적으로 char[] 메모리를 사용한다 >> char[] >> [가][나][다][라][마]
		//																						0	 1	   2    3   4
		//class String extends Objcet{	char[]		@Override toString(){...} ength}
		
		String str1 = "AAA";
		String str2 = "AAA";
		
		System.out.println(str2.toString());
		System.out.println(str1 == str2);
		//==연산자 값을 비교(str(주소값) , str2(주소값))
		//같은 주소 판명
		//메모리에 실제로 같은 문자열이 있으면 재사용
		System.out.println(str2); //주소를 찾아서 그 안에 있는 값을 비교
		
		//그런데 반전
		String str3 = new String("BBB");
		String str4 = new String("BBB");
		System.out.println(str.equals(str4)); 	//false
		//new 새로운 메모리 생성
		
		//넌센스
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		s="A";
		
		
	}
}
