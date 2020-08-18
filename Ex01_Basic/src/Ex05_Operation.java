
public class Ex05_Operation {
	public static void main(String[] args) {
	
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2; //몫
		 System.out.println(result);
		 
		 //나머지를 구하는 연산자(%)
		 result = 13%2;
		 System.out.println(result);
		 
		 //증가 , 감소 (증가감 연산자 : ++ , --) 1씩 증가 , 1씩 감소
		 int i = 10;
		 ++i; //전치증가
		 System.out.println("전치 : " + i);
		 i++; //후치증가
		 System.out.println("후치 : " + i);
		 //위 코드는 전치 , 후치 의미 없다
		 
		 //Point ( 연산자 결합 , 전치 , 후치)
		 int i2 = 5;
		 int j2 =4;
		 int result2 = i2 + ++j2; 
		 System.out.println("result2 : " + result2 + " j2 : " + j2);
		 
		 result2 = i2 + j2++;
		 System.out.println("result2 : " + result2 + " j2 : " + j2);
		 
		 byte b = 100;
		 byte c = 1;
		 
		// byte d = b + c;  //Type miss
		 
		// byte d = (byte)(b + c);  //손실
        // int  d = b + c;
		 int d = b + c;
		 System.out.println("d : " + d);
		 
	     //Today point 
		 //자바의 연산 규칙
		 //정수의 모든 연산은 [int] 타입 변환 후 처리
		 
		 //byte + short => 컴파일러가  int + int
		 //char + char   =>  컴파일러가  int + int
		 //연산 처리시
		 //정수 연산에서  int  보다 작은 타입 int 변환 ( long 제외)
		 // byte , char , short  >> int  변환
		 
		 // byte + short  ->  int + int
		 // char + int ->        int + int
		 // int + long ->        long + long
		 
		 //정수 + 실수 > 타입의 크기와 상관없이 > 실수 승자
		 
		 long ln = 10000000000L;
		 float fl = 1.2f;
		// long lnresult = fl + ln;
		 long lnresult = (long)(fl + ln);
		 System.out.println("lnresult : " + lnresult);
		
		 //소수부가 손실
		 //손실 .... float 받으면 ...
		 
		  float num2 = 10.45f;
		  int num3 = 20;
		  //num2 + num3
		  //float + int >> float + float
		  float result5 = num2 + num3;
		  System.out.println(result5);
		  
		  //int result5 >> 30 ....
		  
		  char c2 = '!';  //33
		  char c3 = '!';  //33
		  //c2 + c3
		  int result6 = c2 + c3;
		  System.out.println("result6 : " + result6);
		  System.out.println((char)result6);
		  
		  //제어문
		  //중소기업 시험문제 (구구단 출력)  >> 별찍기 >> 삼각형  >> 연습
		
		  int sum= 0;
		  for(int j = 1 ; j <= 100 ; j++) {
			  //System.out.println("j : " + j);
			  //sum= sum + j;
			  //sum+=j;
			  if(j%2 == 0) {
				  sum+=j;  //짝수의 합
			  }
		  }
		  System.out.println(sum);
		  
		  //== 연산자 (값을 비교하는 연산자)
		  if(10 == 10.0f) { //타입을 비교하지 않아요 .. 값으로 비교
			  System.out.println("true");
		  }else {
			  System.out.println("false");
		  }
		  
		  // ! 부정 연산자
		  if('A' != 65) {  //같지 않니
			  System.out.println("어 같지 않아");
		  }else {
			  System.out.println("어 같은 값이야");
		  }
		
		  //암기하자 (Today Point)
		  int p = 10;
		  int k = -10;
		  int result8 = (p == k) ?   p  :  k;
		  System.out.println("result8 : "  +result8);
		  
		  if(p == k) {
			  result8 = p;
		  }else {
			  result8 = k;
		  }
		  System.out.println("result8 : " + result8);
		  
		  //진리표
		  //논리연산
		  // 0 :  false
		  // 1 :  true
		  
		  //0 , 1 조합 (순서...)
		  
		  /*                OR        AND
		  		0  0        0            0
		  		0  1         1             0
		  		1   0        1             0
		  		1   1         1             1
		  
		  Oracle (sql)
		  
		  select *
		  from emp
		  where job='IT' and sal > 2000		  //그리고 (둘다 참인 경우)
		  
		  select *
		  from emp
		  where job='IT' or sal > 2000		 //또는 이거나 (둘중에 하나만 참이어도 만족)  
		  
		  연산자 (비트)
		  |    or 연산자
		  &   and 연산자
		  
		  ||    논리연산 (OR)
		  && 논리연산  (AND)
	  */
		 int x = 3;
		 int y = 5;
	
		 System.out.println("x|y : " + (x|y)); // 7
		 //십진수 -> 2진수(0,1)
		 // 128   64  32  16  8   4  2  1
		 //                             0  0  1   1  >>십진수 3은  2진수  0011
		 //                             0  1  0   1  >>십진수 5는  2진수  0101
		 //OR                        0  1   1   1  >>  4 + 2 + 1 >> 7
		 //AND                      0  0 0   1  >>  1  > 1 
		 System.out.println("x&y : " + (x&y)); // 7
		 
		 //Today Point ( && (and) ,   || (or))
		 //if(10 > 0 && -1 > 1 && 100 >2 && 1 > -1 ..... 10개) { 실행문 }
		//if(10 > 0 || -1 > 1 || 100 >2 || 1 > -1 ..... 10개) { 실행문 }
		 
		 
		 int data = 80;
	     switch(data) {
	     		case 100 : System.out.println("100입니다");
	     			break;
	     		case 90 : System.out.println("90입니다");
	     			break;
	     		case 80 : System.out.println("80입니다");
	     			break;
	     		default : System.out.println("default");
	     }
	     
	     //break  강제 사항 입니까 (필요에 따라서 선택적으로)
	     //
	     System.out.println("*************************");
	    data = 90;
	     switch(data) {
	     		case 100 : System.out.println("100입니다");
	     		case 90 : System.out.println("90입니다");
	     		case 80 : System.out.println("80입니다");
	     		default : System.out.println("default");
	     }
	     
	     int month =5;
	     String res=""; //빈 문자열로 초기화
	     switch(month) {
	     		case 1:
	     		case 3:
	     		case 5:
	     		case 7:
	     		case 8:
	     		case 10:
	     		case 12: res="31";
	     			break;
	     		case 4:
	     		case 6:
	     		case 9:
	     		case 11: res="30";
	     			break;
	     		case 2: res="29";
	     		    break;
	     		default : res ="월 데이터가 아닙니다" ;   
	     }
	      System.out.println(month + "  달의 일수는 " + res);
	
	      //난수 (랜덤값 : 임의의 추출값)
	      //https://docs.oracle.com/javase/8/docs/api/index.html
	      //폴더 (package) 
	      //java.lang.Math (Math  클래스)
	      //java 페이지는  default  열려있는 폴더 (java.lang)
	      //생략> import java.lang.*
	      //Math  클래스 가지고 자원 ( static ) : 객체 생성 없이도 사용 가능한 자원
	      //Math.random()
	      //a pseudorandom double greater than or equal to 0.0 and less than 1.0
	      // 결과 : double 실수  return    0.0 <=  random < 1.0
	          System.out.println("Math.random() : " + Math.random());
	          System.out.println("Math.random()   * 10  : " + ( Math.random() * 10));
	          //0 ~ 9
	          System.out.println("(int)Math.random()   * 10  : " + (int)( Math.random() * 10));
	      	  //1 ~ 10
	          System.out.println("(int)Math.random()   * 10  + 1  : " + ((int)( Math.random() * 10) +1));
	
	          /*
	  		문제를 풀어 보세요
	  		--3분 또는 2분이 같이 풀어보세요
	  		--문제를 푸시면 지금까지 배운 것 이해 하고 있으신 거죠
	  		우리는 백화점 경품 시스템을 만들려고 한다
	  		경품 시스템은 나오는 점수에 따라 경품을 지급하는 시스템이다
	  		경품 추첨시 1000 점수가 나오면
	  		경품으로 TV , NoteBook , 냉장고 , 한우세트 , 휴지
	  		경품 추첨시 900 점수가 나오면
	  		경품으로  NoteBook , 냉장고 , 한우세트 , 휴지
	  		경품 추첨시 800 점수가 나오면
	  		경품으로  냉장고 , 한우세트 , 휴지
	  		경품 추첨시 700 점수가 나오면
	  		경품으로  한우세트 , 휴지
	  		경품 추첨시 600 점수가 나오면
	  		경품으로  휴지
	  		그외 점수는 100 ~ 500 까지는 칫솔 
	  		경품시스템의 점수 범위는 100 ~ 1000 점까지 한정되어 있다
	  		사용자가 경품 시스템을 사용시 랜덤하게 100 ~ 1000까지의 값이 나오게 되어 있습니다.
	  		
	  		*/
	          int jumsu = ((int)(Math.random()* 10) + 1)*100;
			  System.out.println("추첨번호 : " + jumsu);
			  String msg="";//초기화
			  msg+= "고객님의 점수는 :" + jumsu + " 이고 상품은 : ";
			  switch(jumsu) {
			  	case 1000:msg+="Tv";
			  	case 900:msg+="NoteBook ";
			  	case 800:msg+="냉장고 ";
			  	case 700:msg+="한우 ";
			  	case 600:msg+="휴지 ";
			  	     break;
			  	default:msg+="칫솔";     
			  }
			  System.out.println(msg);
			 
			  
			  String m = "F";
			  String r="";
			  switch(m) {   //조건식에  문자열 또느 한문자
			  		case "A":
			  		case "B":
			  		case "C":
			  		case "D":
			  		case "E":
			  		case "F":
			  		case "G": r = "ok";
			  			break;
			  		case "H":
			  		case "K": r="no";
			  			break;
			  		default : r = "데이터가 아닙니다";
			  }
			  System.out.println(r);
			  
			  
	}

	
	
	
	
}





