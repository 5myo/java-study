/*
1.  자바가 제공하는 기본 타입 (시스템 타입) 자료형 >> 8가지 
2. 8가지 기본타입을 [ 값을 저장 ]하는 타입
3. 숫자   >>  정수  >> (음의 정수 , 0 , 양의정수) >>  byte (-128 ~ 127)
                                                                      >> char (한문자를 표현하는 타입)  >> 'A' , '가'
                                                                          >>>  한글 1자 2byte
                                                                          >>>  영문자 , 특수문자 , 공백 1byte
                                                                          >>>  협의 >>  char(2byte) (한글 ,영문 , 특수문자 , 공백) 상관없이 한글자
                                                                          >>>   국가가 협의 (unicode) >>> 아스키 코드표
																	 >> short  (c언어 호환성 2byte)
																	 >> int (-21억 ~ 21억 : 4byte) *** Java 정수의 연산의 기본 타입 ***	
																	 >> long (8byte) 
	     
	      >> 실수 (부동소수점)                             >> float (4byte)
	                                                                >> double (8byte)	>> 정밀도 (표현 범위가 크다) ***Java  실수의 연산의 기본 타입***															 
  
  논리 >> 참 , 거짓 >>  true, false                 >> boolean ( 프로그램의 논리적인 흐름제어)


*** 문자열의 표현 >> "홍길동"   , "HELLO"
String name = "홍길동"; >>   String  클래스 타입 (참조타입)
그럼에도 불구하고 ....
다른 이야기를 하기 전까지   String 문자열을 담을 수 있는 타입
int , double  처럼 사용하세요
그래야 삶이 편안해요 ...당분간

9가지 ( String)

자바는 크게
1. 값 타입                     : 8가지 기본 :    int i =100;   int j = i;                                               -> value type
2. 참조 타입 (주소값)    :  클래스 , 배열 : 변수에 값이 저장되는 것이 아니라 주소값 저장(참조값) ->  ref type
*/

// class == 설계도 == 타입(Type)
class Car{   //Car  Type  이다 , Car  설계도 이다 >> 구체화된 산물 >> 객체(메모리)
	 String color;
	 int window;
}
public class Ex03_DataType {
	public static void main(String[] args) {
		  String str ="홍길동";
		  int age = 100;
		  
		  Car c;  //c 는 main  함수안에 있는 지역 변수 
		  //System.out.println(c);  지역변수 초기화 x
		  //c 라는 변수의 초기화 >> 주소를 가지게 하는 것 >> [new  연산자]를 통해서 만들어진 [주소]가 할당 되게 하는 것
		  c = new Car();
		  System.out.println(c);  //Car@15db9742
		  
		  //선언과 초기화
		  //참조타입의 초기화 : 주소값는다
		  Car c2 = new Car();
		  c2.window = 100;
		  c2.color = "blue";

		  int i = 10;
		  int j ;
		  j = 20;
		  
		  int k ;
		  k = j; //POINT [값 할당]
		  System.out.println("k : " + k);
		  k = 300;
		  System.out.println("k : " + k);
		  System.out.println("j : " + j);
		  
		 //int p , g , q; 
		 //  이런 경우라면   Array : int[] arr = new int[3];  arr[0] =1 ;.....
		  
		 //int (-21 ~ 21)
		 //Today Point
		 //literal  >> 있는 그대로 >> 소스 코드에서 개발자가 직접 입력한 값
		 //정수 리터럴 :  [****기본값 default  int   범위*****]
		//int p = 10000000000;
		 long l = 10000000000L;
	     long l2 = 100;	  
	     
	    //int p2 = 1000000000L; //Type mismatch: cannot convert from long to int
	     
	    //char : 2byte  정수값
	    //한문자를 표현하는 자료형 
	     //Today Point
	     //문자열 : "가"  , "홍길동"  >>   String str = "가나다라마바"
	     //문자(한) : 'A'    '가'        >> char ch ='A';
	     
	     char single = '가';
	     System.out.println(single);
	     char ch = 'A';
	     System.out.println(ch);
	     // char 문자를 저장하지만 내부적으로 정수값을 가지고 있다 (아스키 코드표)
	     //casting (타입 변환)
	     int intch ='A'; //내부적으로 자동 (암시적) 형 변환
	     System.out.println("intch :" + intch);
	     
	     System.out.println((int)ch);
	     
	     char ch2 = 'a';
	     System.out.println(ch2);
	     int intch2 = (int)ch2;
	     System.out.println(intch2);
	     
	     
	     int intch3 = 65;
	     char ch3 =(char)intch3;
	     System.out.println(ch3);
	     //속지말자  [값을 보지 말고 값이 가지는 타입을 보자]
	     //강제적 형변환  (명시적 형변환)
	     //Key Point : 65 라는 숫자가 char 타입 속하는 경우 (데이터 손실 없이 할당)
	     //  int intch3 = 99999999;
	     //큰 것을 작은 것으로 강제 [데이터 손실 ] ...
	     
	     int intch4 = ch3; //형변환 .. 자동으로 .. 컴파일러 
	     //자동형변환 
	     //int intch4 = (int)ch3  컴파일러가 코드 재생산
	     System.out.println(intch4);
	     
	     /*
	      Today Point
	       1. 할당에서 변수가 가지고 있는 값을 보지말고 변수의 타입을
	       2. 변수의 타입 크기를 확인하자
	       3. 큰타입에는 작은 타입을 넣을 수 있다
	       4. 작은 타입에는 큰 타입값을 못 넣어요 (casting)
	          char  <-  int    >>>>>     char <- (char)int     데이터 손실에 대한 책임은 ^^ !
	          int    <- char   >>>>>     int  <- char 실행하면 내부적으로 컴파일러가     int <- (int)char 로 변환 실행

	      */
	    // int intvalue = 1015648;
	   //  byte bytevalue = (byte)intvalue;
	    // System.out.println("bytevalue : " + bytevalue);  //원하지 않는 값 (쓰레기)
	     
	    int intvalue = 101;
		byte bytevalue = (byte)intvalue;
		System.out.println("bytevalue : " + bytevalue);  //손실되지 않았어요 (100% 가 아니다)
		
		//String (문자열)
		String name ="hello world";
		System.out.println(name);
		//syso ctrl + space
		
		String name2 = name + "  방가방가"; // + >>  산술 , 결합 
		System.out.println(name2);
		//DB (Oracle) >>  + 연산자 (산술)  ,  결합 연산자 ||    '안녕' || '방가'
		
		//TIP) Java 특수문자
		//이스케이프 문자 >> 특정 문자 앞에  \
		char sing = '\'';  
		// 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정	
		System.out.println(sing);
		
		//홍"길"동  이라는 문자를   String  변수에 저장하고 화면에 출력
		String ename = "홍\"길\"동";
		System.out.println(ename);
		
		String str3 = "1000";
		String str4 = "10";
		
		String result = str3 + str4; //"100010"
		System.out.println(result);
		
		System.out.println("100"+100);     //100100
		System.out.println(100+"100");     //100100
		System.out.println(100+100+"100"); //200100
		System.out.println(100+(100+"100"));//100100100
		System.out.println(100+"100"+100);//100100100
		
		//C:\temp  문자열을 String 변수에 넣고 화면에 출력하세요
		//String path = "C:\temp";   //C:	emp   //   \t  >> tab        \n >> new line
		String path = "C:\\temp"; //C:\temp
		System.out.println(path);
		
		//실수형 (부동소수점) :
		//float (4yte)
		//double (8byte) ** 실수 리터럴의 기본 타입   double**
		
		float f = 3.14f; //3.14 리터럴 값은  double  그릇안에  >>  float 그릇교체 >>  접미사 (F ,f)
		//float f2 = (float)3.14;
		
		float f2 = 1.123456789f;
		System.out.println("f2 : " + f2);
		//1.1234568
		// 대략 7자리 소수 표현 
		// 반올림  default
		
		double d = 1.123456789123456789; 
		System.out.println("d : " + d);
	   //1.1234567891234568
		//대략 16자리 소수 표현
		// 반올림  default
		
		System.out.println((byte)128);
		//byte -128 ~ 127   //overflow 시 순환 
		byte q = (byte)129;
	    System.out.println(q);
	     
	    double d2 = 100;  //  암시적 형변환
	    System.out.println(d2); //100.0
	    //컴파일러
	    // double d2 = 100; 
	    
	    //Quiz
	    double d3 = 100;
	    int i5 = 100;
	    //아래 코드가  error   없이 처리 될려면 ... 바꾸면 될까요
	   // int result2 = d3 + i5;   //int = int + double
	 
	 //   1 .  int result2 = (int) (d3 + i5); 
	 //  만약에  d3 = 3.1  >>  int  >>  3.0    손실이 .....
	    
	 //   2.   double result2 =d3 + i5;       손실이 없다 
	 //Today Point
	 //  작은타입 + 큰타입  >>  큰타입
	    // 타입간 변환 >>  변수가 가지는 값을 보지 말고 변수의 타입을 보고 판단하자
	    //명시적 형변환 (casting) : 손실분 고민
	    
	    int i6 = 100;
	    byte b2 =(byte)i6;  //명시적 형변환
	    System.out.println(b2); 
	    
	    byte b3 = 20;
	    int i7 = b3;
	    //컴파일러가 내부적으로 (int)b3  암시적 형변환
	}

}




