/*
클래스는 설계도이다 , 클래스는 타입이다
클래스 == 설계도 == 타입
클래스는 구체화 통해서 사용 (집을 짓는 행위)
프로그램 세계에서는 new  연산자를 통해서  memory  만든다  >> 만든것 (객체:인스턴스)

설계도
2가지
1.  main  함수를 가지는 설계도  >> 독자적인 실행이 가능한 클래스
>>java  Ex04_Ref_Type >>  실행

2. main 함수 없는 설계도 >> 도와주는 역할 >> 라이브러리 (lib)


*/
//class Apt {  //The type Apt is already defined
	
//}
class Apt2{
	int door = 10;  //member field 
	int window=20;
}


public class Ex04_Ref_Type {
	public static void main(String[] args) {
		//Apt2 설계도  >>  구체화 >>  메모리 올려야 >>   new   연산자 
	   //클래스의 초기화 (주소값)
		Apt2 lgapt = new Apt2();
		//lgapt (참조변수 , 객체변수 (주소를 가지고 있는 변수)
		System.out.println("lgapt : " + lgapt);// Apt2 + @ + 15db9742
		
		Apt2 ssapt = lgapt; // 할당도 주소를 가지게 한다 (초기화 방법)
		ssapt.door = 1000;
		
		System.out.println(lgapt.door);
	}

}
