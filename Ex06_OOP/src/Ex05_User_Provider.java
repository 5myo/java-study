/*
 	user 사용자 : provider 제공자
 	class A{}
 	class B{}
 	관계 : A는 B를 사용합니다
 	
 	1. 상속 : A extends B
 	2. 포함 : A라는 클래스 안에서 Memeber Field B를 사용 >> class A {B b;}
 		2.1 전체
 		2.2 부분
 		
  	------------------------------------------------2.1전체 집합 방법
  	
 	class B{}
 	class A{}
 		int i;
 		B b; //A는 B를 사용합니다, 포함(참조)
 		A(){
 			b = new B();
 		}
 	>>B는 독자적으로 생성 불가능, A라는 객체가 만들어져야 B도 생성
 	>>A a = new A(); >> A 객체가 만들어지면 B객체도 같이 생성
 	>>A와 B는 운명 공동체(전체집합)
 	
 	------------------------------------------------2.2부분 집합 방법
 	
 	class B{}
 	class A{
 		int i;
 		B b; //A는 B를 사용합니다, 포함(참조)
 		A(){}
 		A(B b){
 		this.b = b;
 		}
 	}
 	
 	>> B b = new B();
 	>> A a = new A(b);
 	>>위 코드의 A와 B는 운명공동체가 아니다(부분집합)
 	
 	------------------------------------------------
 	A는 B를 참조한다(member Field 선언 B가)
 	------------------------------------------------
 	
 	class B{}
 	class A{
	 	int i;
	 	member field B라는 타입을 가지지 않는다
	 	
	 	void print(B b){}
	 	B print(){
	 		B b = new B();
	 		return b;
	 	}
 	}
 	
 	>> B b = new B();
 	>> A a = new A();
 	>>a.print(b);
 	>>B b2 = a.print();
 	
 */
interface Icall{
	void m();
}
class D implements Icall{
	@Override
	public void m() {
		System.out.println("D lcall 인터페이스의 m() 재정의");
	}
}

class F implements Icall{
	@Override
	public void m() {
		System.out.println("F lcall 인터페이스의 m() 재정의");
	}
}

//현대적인 프로그래밍 방식(interface)
class C {
	void method(Icall ic) {	//ic는 Icall에서 구현한 모든 객체의 주소를 받을 수 있다(확장성)
		ic.m();
	}
//	void method2(D d) {
//		d.m();
//	}
//	void method3(F f) {
//		f.m();
//	}
}

public class Ex05_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();
		c.method(d);
		c.method(f);
	}
}
