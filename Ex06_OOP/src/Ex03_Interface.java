/*
 	추상 클래스 : 인터페이스 비교
 	인터페이스 : 표준, 약속 , 규칙, 규약 만드는 행위
 	
 	<추상클래스, 인터페이스의 공통점>
 	- 스스로 객체 생성 불가능 (new 연산자 사용 불가능)
 	<추상클래스, 인터페이스의 차이점>
 	- 추상 클래스(완성 + 미완성), 인터페이스(모든것이 미완성)
 	- 인터페이스는 다중 구현 가능 >> 작은 단위로 >> 여러개 >> 모아모아서 큰 약속
 	   약속을 만든다 >> 약속을 너무 크게 >> 사용성이 떨어진다
 	   class Test extends Object implements la, lb, lc
 	   == 인터페이스와 인터페이스는 extends 가능
 	- 추상 클래스는 단일 상속 원칙(계층적 상속)
 	- 추상 클래스(완성된 코드 + 미완성 코드)
 	- 인터페이스(상수를 제외한 나머지는 미완성(추상)자원 >> JDK 8.(Default 값, static 값))
 	- 인터페이스는 소프트웨어 설계 최상위 단계
 	   어떤 프로젝트를 진행할 때 약속을 정의
 	   
 	**개발자(초급)**
 	1. 인터페이스를 [다형성] 입장으로 접근(인터페이스 부모 타입)
 	2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능을 한다.(같은 부모를 갖는다)
 	3. JAVA API 수 많은 Interface를 만들어 놓아서 직접 설계하지 않아도 된다.(사용방법만 익히면 됨)
 	4. 인퍼에시(~able) : 날 수 잇는, 수리할 수 잇는(설계)
 	5. 객체간 연결 고리(객체 간 소통) >>> 다형성
 	
 	<사용방법>
 	추상클래스 extends 사용가능
 	인터페이스 imterments 사용가능
 	class Car extends abclass{}
 	class Car imterments la{}
 	가지고 있는 자원(추상) >> extends, implements 하는 클래스 강제 구현(재정의)
 	
 */
/*
interface la{
	String print(); //약속 //출력할 때는 print 사용하고 return은 문자로 해라
}
class Test implements la{
	@Override
	public String print() {
		return null;
	}	
}

	설계표준 >> 구현 >> 재정의
	Interface
	1. 실제 구현부를 가지고 있지 않다. : 실행 블럭이 없다 : 약속(설명)
		시스템에서 이동하는 것이 move하는 이름을 사용하고 이동시에는 좌표값을 받아야 한다.
		>> 합의 >> void move(int x, int y); (x){} >> 구현자 >> 재정의 >> 추상 메서드
		>> 활용 : collection(동적배열) 자료구조 >> Vextor, [ArrayList], HastSet, [HashMap]
		>> Vextor, [ArrayList], HastSet, [HashMap] 여러개의 Interface를 구현하고 있다.
	
	2. 생성방법
		2.1 상수(funal) : public static final int VERSION=1; >> [public static final] int VERSION=1;
		생략 : [public static final] 컴파일러가...
		2.2 함수 (method) : public abstract void run(); [public abstract] void run();
		
		Interface{
			int VERSION=1; //[public static final] ...default
			void run(); [public abstract] ...default
			String move(int x, int y); //public abstract String move(int x, int y);
		}
	interface lable{}
	interface lable{int NUM=0;}
	interface lable{void run();}
	
	class Test extends Object implememts la, lb, lc{
	}
 */
interface Ia{
	int AGE=100;
	String GENDER="남";
	String print();
	void message(String str);
}
interface Ib{
	int AGE=10;
	void info();
	String val(String s);
}
class Test extends Object implements Ia, Ib{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String val(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void message(String str) {
		// TODO Auto-generated method stub
		
	}	
}
public class Ex03_Interface {
	public static void main(String[] args) {
		Test t=new Test();
		Ia ia = t;	//부모는 자식 타입의 주소를 가질 수 있다.(다형성)
		ia.message("AA");
		System.out.println(ia.AGE);
		Ib ib = t;
		System.out.println(ib.AGE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
