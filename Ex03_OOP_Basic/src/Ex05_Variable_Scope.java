/*
	instance variable >> class Car { private String color;}
	local variable >> class Car { public void move(){ int speed; }} //사용전에 초기화 (default (x))
	main  함수안에 만드는 모든 변수는 : local variable >> 반드시 초기화
	static variable >> 공유자원 ( 객체간 ) , 객체 생성 이전에 memory  올라가는 자원(class area , method area)
	

*/

class Variable{
	 int iv;
	 /*
	  1. member field , instance variable
	  2. Variable v = new Variable() : heap 메모리에 생성(객체) >> iv 생성
	  3. Variable v2 = new Variable() :  heap 메모리에 생성(객체) >> iv  생성
	  4. 목적 :  정보를 담을 려고 한다 
	  --정보 :  고유  , 상태 , 부품 (참조 : class)
	  --생성되는 객체마다 다른 값을 가질 수 있다
	  --그래서 굳이 초기화를 하지 않는다 
	  --default : int > 0 ,  double > 0.0 ,   char > 빈문자 ' '  , boolean > false  ,  String  > null  , Car > null
	  --iv 변수의 생성 시점 : new 라는 연산자를 통해서  heap  객체가 만들어지고 나서 바로 생성 (그 안에)
	  */
	 
	 void method() {
		 int lv=0;
		 /*
		    local variable (함수 : 지역변수 : 사용전에 반드시 초기화)
		    생명주기 : 함수가 호출되면 생성( stack )  ....  함수가 끝나면 같이 소멸 
		    
		    ** 함수안에  block 변수
		    for(int i ...)  >> for  시작되면  생성 .... for  끝나면 소멸
		    
		    for(int i ..)
		  */
	 }
	 
	 static int cv;
	 /*
	   
	  1. class variable (클래스변수) ,  static variable(객체간 공유자원)
	  2. 목적 : 정보를 담는 것 (생성되는 모든 객체가 공유하는 자원) 
	     heap  영역에 생성된 [객체] 들의 공통(공유)
	  3. 특징 :  접근방법   
	            1. class 이름.static  변수명   >> variable.cv  >> why (객체가 만들어 지기 전에 접근 가능)
	            2. Variable v = new Variable();  >>  v.cv
	                Variable v2 = new Variable(); >> v2.cv  
	                v.cv ==  v2.cv  (같은 메모리 접근 : 주소를 접근)
	                
	   4. 생성시점 : Hello.java > javac Hello.java > Hello.class
	            >java.exe Hello 엔터 실행 ...
	            >class loader System 에 의해서 
	                      클래스를 정보(metadata : 설명) class area(method area) 올려요
	            --이 클래스 언제 만들었고 어떤 자원을 import 하고 있고   변수 몇개 ...기술 ..
	            --이 클래스 안에 static variable 또는 static method 있으면 
	            --이 녀석을 memory (class area) 에 올려 놓는다        
	 */
}


public class Ex05_Variable_Scope {
	public static void main(String[] args) {
		 // Variable v = new Variable();
		 //javac  Ex05_Variable_Scope.java
		 // >> Ex05_Variable_Scope.class
		 // >> java Ex05_Variable_Scope    실행 
	
		//1. 
		Variable.cv = 100;
		//2.
		Variable v = new  Variable();
		System.out.println(v.cv);  //100
		
		Variable v2 = new Variable();
		v2.cv = 500;
		
		System.out.println(Variable.cv); //500
		
		
		
	}

}











