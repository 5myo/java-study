//라인주석
/*
 블럭주석 (해석되지 않는 자원)
 1. Ex02_Variable  클래스 >> 설계도 >>  타입이다
  
  -클래스의 종류 
   --  class Test { } >>  독자적인 실행이 불가능 : 다른 클래스(설계도) 참조하는 클래스 : main  함수( x)  >>  lib
   --  class Test {  public static void main(String[] args){}    }  >>  실행가능한 클래스 
   -- static void main(String[] args) >> main 이름을 가지는 함수 >>프로그램 진입점 , 시작점 >> 약속
 
 Tip)
 c# : static void Main(){}
 
 변수 : variable
  데이터(자료) 담을 수 공간의 이름
  공간(크기) : 타입(자료형)
  데이터 타입  변수명 >>  int i =100;
  
  변수가 선언되는 위치 (   scope :   유효범위 )
  1. instance variable :    객체변수  >>  class Person { int age;}
  2. local variable :  지역변수 (지역 :  함수안) >>   class Person { public void run() {  int speed }}
  3. 함수안에  if 블럭 ,    for 블럭 안에 있는 변수도 블럭안에서 유효
  4. static variable :   공유자원 (객체간)
 */

//class 설계도이다  ==   class Type  이다 ( 여러개의 의미있는 작은 타입을 가지는 큰 타입) == 사용자 정의 타입
class Test{
	int iv=100;  // 초기화 > 100
	//instance variable
	//이 변수는 초기화를 하지 않아도 된다 ( 내부적으로 기본값 :   default)
	int window; //  기본값 > 0
	
	//초기화 : 변수가 처음 값을 갖는 것(할당을 통해서)
	//질문 :   why window 변수는 초기화를 하지 않아도 사요 가능 할까요 
    //window 아파트의 창문의 개수 ......
	//hint)  설계도는 하나 ... 설계도를 기반으로 아파트 여러개 ..... 아파트 마다 창문의 개수는 다를 수 있다
	// 아파트 마다 (객체) 창문의 개수를 다르게 가져 가겠다.
	
	// Test  삼성아파트 = new Test();
	//  삼성아파트.window = 4;
	
	// Test  현대아파트 = new Test();
	//  현대아파트.window = 2;
	
	 Test(){ // 생성자 함수 (특수한 함수)  객체가 생성될때 자동으로 호출되는 함수 :  객체 생성과 동시에 : constructor 
		 System.out.println(" 나는 생성자");
	 }
	 
	  Test(int data){ //오버로딩  : overloading  : 하나의 이름으로 여러가지 기능을 수행
		                         // 자동으로 호출 되는 함수 : 아파트가 지어질때 ...
		  window = data; //창문의 개수 강제 초기화 
	  }
	 
	 void write() { //기능 . 행위 method 
		  int num;  //선언
		  //local variable 
		  //The local variable num may not have been initialized
		  // 당신이 만약 지역변수를 사용하고 싶다면 전에 받드시 초기화를 해라 ..
		  //write 함수가 호출되면 생성되고 함수가 종료되면 메모리에서 사라진다 
		  num = 100;
		  System.out.println(num);
		  
		  int age = 15;
		  //지역변수는 사용하기 전에 반드시 초기화 값을 할당 행위 선행
		  
	 }
	 
	 void print() {
		 
		//안에서   age  변수 사용  (사용불가)  다른 함수 ...접근불가
		// System.out.println(age); 
		  System.out.println(window);
	 }
	 
	 
}

class Apt{
	int window;
}

public class Ex02_Variable {

	public static void main(String[] args) {
		 Test t = new Test(10); // 설계도를 구체화 .... 객체 생성  ... 아파트를 짓는 것
		 t.print();
		 
		 // 수업
		 int lv = 100; // local 
		 System.out.println("lv  지역변수 : " +  lv);
	    
		 //Ex02_Variable 
		 //javac Ex02_Variable.java   >> Ex02_Variable.class  생성
		 //java Ex02_Variable 실행
		 // JVM   동작  >>  OS  >>   app 메모리 구성 >> 자원 할당 ... >> 프로그램 종료 >> 사용했던  공간은 반환  OS
		 //이클립스 통합 개발툴 ( ctrl + F11  컴파일 >> 실행 )
		 
		 //1. 지역변수는 반드시 초기화를 하고 사용 (변수에 처음 값을 할당 초기화)
		 //2. 약속 >>   main  도 함수다 >>  초기화
		 
		 int number = 0; //선언과 동시에
		 number = 100;
		 number = 200;
		 System.out.println("number : " +  number);
		 
		 int a;  // 선언
		 int b;
		// System.out.println(a);
		 a = 100; //  초기화
		 b = 200;
		 System.out.println(a);
		 
		 int c, d; // 선호하지 않아요 (초기화) >>  배열
		
		 Apt ssung = new Apt();
		 System.out.println(ssung.window);
		 Apt ppark = ssung;
		 ppark.window = 100;
		 System.out.println(ssung.window);
		 System.out.println(ssung); //Apt@15db9742     >>   설계도의 이름 + @ + 주소값
		 System.out.println(ppark); 
		 
		 
		 int f = 100;
		 int k = f;
		 f = 200;
		 
		 
	}

}



