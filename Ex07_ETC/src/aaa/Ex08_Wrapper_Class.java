/*
 	자바 8가지 기본 타입(값타입) : JAVA API제공
 	8가지 기본 타입에 대해서 객체 형태로 사용가능하도록 만든 것(wrapper class)
 	
 	기본타입 대신에 객체 형태 타입을 사용 >> 제너릭 >> static (문자를 -> 정수, 실수)
 	1. 매개변수 객체 요구될때
 	2. 기본형 값이 아닌 객체 형태로 저장
 	3. 객체간 값 비교
 	4. 타입 변환시 처리
 */
package aaa;

import java.util.ArrayList;

public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100;
		Integer n = new Integer(500); //stack에는 주소값, heap 안에 500
		System.out.println("n : " + n); //toString() 재정의하여 주소가 아닌 값이 나오게 한다.(주소값으로 값을 찾아가 값을 반환)
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//POINT
		//parameter 사용
		//제너릭(generic)
		//객체 생성시 타입 강제 방법(Object 막고 타입을 강제, 캐스팅)
		ArrayList<Integer> li = new ArrayList<Integer>();	//Integer는 int(정수형)을 의미
		li.add(100);
		//li.add("A"); 정수 타입만 가능하여 문자,문자열은 에러
		li.add(200);
		for(int value : li) {
			System.out.println(value);
		}
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); //==은 주소값을 비교하기 때문에 false
		System.out.println(i2.equals(i3));	//.equals은 실제 값을 비교하도록 재정의(true)
		//equals는 Object꺼
		//String 클래스 재정의
		//Integer 클래스 재정의
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5);
		
		Integer t = new Integer(500);
		intMethod(t);	//t라는 참조변수가 가지고 있는 "값"을 넘긴다
		intergerMethod(t);	//t라는 참조변수의 "주소값"을 넘긴다
	}
	static void intMethod(int i) {
		System.out.println("int param : " + i);
	}
	static void intergerMethod(Integer i) {
		System.out.println("integer param : " + i); //toString() 재정의
		System.out.println(i.MAX_VALUE);
	}

}
