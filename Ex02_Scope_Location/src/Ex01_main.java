import kr.or.bit.common.Car;

/*
클래스 == 설계도 == 타입

클래스 구성 요소  : [필드  + 함수]  + 생성자함수
*필드 (field) >> 고유정보 , 상태정보 , 참조(부품) 정보 자원  >> 변수 
*함수 (function) >>  기능 (행위) 
*추가적으로 생성자 >> 필드의 초기화를 목적으로 하는 함수

클래스 , 필드 , 생성자 , 함수 :  영역 (범위) >> 접근자 , 한정자 , 수정자
>> public  , private  , default , protected 

1. public class Car{} //자동차 설계도  (kr.or.bit.common)
2. class AirPlane {} // 컴파일러가 자동(내부적으로)    default 접근자 
   >> default class Air ....
   >> ** default  접근자는 : [같은 폴더에서 접근가능] [다른 폴더에 있으면 서로 접근 불가]
   >> ** default  접근자는 : 같은 폴더(package)  내에서 [연습 목적]
 3. class Air  >> src  폴더  

 4. 연습 : public class Ex01_main 파일 안에서  클래스 생성 연습
 
 하나의 물리적인 자바 파일은 여러개의 클래스를 가질 수 있다 
 Ex01_main.java  >> class Test{}
 단 대표는 하나  >>  public 하나는 존재   >> 나머지는   default
 
*/
class Test{   //연습  //default
	int data;   //default
	public int p_iv;
	private int pri_iv; //숨긴다 , 감추다 , 캡슐화 ....
}

public class Ex01_main {
	public static void main(String[] args) {
		Car c = new Car();
		c.window = 10;
		
		//AirPlane air = new AirPlane();
		Air air = new Air();
		
		Test t = new Test();
		t.data = 100;
		t.p_iv = 200;
		

	}

}
