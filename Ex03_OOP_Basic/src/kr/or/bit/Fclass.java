package kr.or.bit;

/*
 기능 (행위)  만드는 방법
 함수 (function , method)
 
 method : 행위 또는 기능 (최소 단위) : 하나의  함수는 하나의 기능만 구현
ex)   먹는다 , 잔다 , 걷는다 

클래스 : 필드 + 함수 + 생성자

ex)  게임방 : 게임기 동전넣고 ....  함수  (돌려주는 것 ( x)
                     인형뽑기 동전넣고 인형을 받는 것 (돌려주는 것 (0)

--함수는 호출에 의해서만 동작 ....
                     
JAVA)
1. void , parameter(0) :        void print(String str) { 실행코드 }
2. void, parameter(x) :         void print() { 실행코드}
3. return type , parameter(0) :    int print(int data) { return 100; }
4. return type , parameter(x) :    int print() {return 100;}

****
void >> 돌려주는 것이 없다 >> return value  가 없어요
return type       >> 8가지 기본 타입 + String  , Array , Class , Collection , Interface
parameter type >>  8가지 기본 타입 + String , Array , Class , Collection , Interface
void print(int a , int b , int c  , int d){}  ...  인자 , 인수 , 매개값 , 전달값 >> parameter
ex)  print(10,20,30);  (x) ,     print(1,2,3,4) (0)


Car print() {  Car c = new Car();   return c; }  ,,, 단축  { return  new Car();}
boolean print(boolean bo) {  return true;}

함수의 이름  : 관용적 ...
의미있는 단어의 조합
: getChnnelNumber()
: getEmpListByEmpno()

함수는 반드시 호출( call)  되어야 실행 ... : 누군가 그의 이름을 부르지 않으면 실행이 안된다

*/
public class Fclass {
	public int data;

	// void m() //컴파일러가 default void m() : 같은 폴더 내에서만
	public void m() { // 다른 package 에서 사용가능
		System.out.println("일반함수 :  void , parameter(x)");
	}

	// void m2(int ..)
	public void m2(int i) {
		System.out.println("일반함수 :  void , parameter(0)");
		System.out.println("parameter value : (scope 함수내부)" + i);
	}

	public int m3() {
		return 100; // return Type 존재하면 반드시 return 키워드 필수
	}

	public int m4(int data) {
		return 100 + data;
	}
	// 요기 까지 함수 기본 ....

	// 확장
	public int sum(int i, int j, int k) {
		return i + j + k;
	}

	// default int subSum() ...
	// 설계자의 의도 : subSum() 이라는 함수는 다른 함수를 도와주는 ... 함수 [내부]에서 호출
	// 내부에서 공통적인 내용 ..
	// 이런 경우는 : private 접근자 : 클래스 내부에서만 ... 같은 package 에서 접근
	// **클래스 내부 : public , private , default 구분하지 않아요
	private int subSum(int i) { // 클래스 내부의 공통함수
		return i + 100;
	}

	public void callSubSum() {
		int result = subSum(100);
		System.out.println("call result : " + result);
	}

	private int operationMethod(int data) { // 클래스 내부에서 .... 공통함수 ....
		return data * 200;
	}

	public int opSum(int data) {
		int result = operationMethod(data);
		if (result > 0) {
			return 1;
		} else {
			return -1;
		}
	}

	// Quiz
	// a 와 b 둘중에 큰 값을 return 하는 함수를 만드세요
	// ex) max(300,100) return 값은 300
	// public int max(int a, int b) {}

	// 30점 : return 을 최소 (반복적 사용 (x)
	/*
	  public int max(int a , int b) { 
	  		if(a > b) {
	  		 	return a; 
	  		 }else { 
	  		 	return b; 
	  		 } 
	  }
	 */

	//60점
	/*
	public int max(int a, int b) {
		int result = 0;
		if (a > b) {
				result = a;
		} else {
				result = b;
		}
		return result;
	}
	*/
    //90점
	// int max = (a > b) ?  a  :  b ;
	// return max;
	
	//100점
	//return  (a > b) ?  a  :  b ;
	
	public int max(int a, int b) {
		return (a > b) ?  a  :  b ;
	}
	
	//함수를 사용할때 기본타입(값타입)
	//함수에 참조타입
	//return Type >>  클래스 
	public Tv tCall() {   //Tv 타입을 가지는 [***주소***]를 리턴  >> new ...
		//return null;
		Tv t = new Tv();
		t.brandname = "A";
		return t;
	}
	
	public Tv tCall2() {  //^^
		return new Tv();
	}
	
	
	public void tCall3(Tv t) { //Tv 타입을 가지는 주소 
		System.out.println("t 주소값 : " + t);
	}
	
	/*
	      main()
	      {
	      		1. 	tCall3(new Tv())
	      		
	      		2.  Tv t = new Tv();
	      		     tCall3(t);
	      } 
	 */
	
	
}








