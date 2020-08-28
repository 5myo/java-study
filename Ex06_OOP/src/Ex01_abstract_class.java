/*
 	추상클래스
 	>> 미완성 클래스 (설계도)
 	1. 완성된 코드 + 미완성 코드 
 	2. 완성(함수) 실행블럭이 있는 함수 + 미완성(함수) 실행블럭이 없는 함수 (public void run(); (x)){})
 	3. 완성된 클래스(new 가능) - 미완성 클래스(스스로 객체 생성 불가능)
 	
 	정리
 	1. 추상클래스(미완성) : 스스로 객체 생성 불가(new 불가)
 	2. 추상 클래스는 결국 완성된 클래스 만드는 것이 목적(상속을 통해서 완성해라)
 	3. 상속관계에서 미완성된 자원(추상함수) 완성해라 (구현) >> 재정의 해라(추상함수를)
 	
 	설계자 입장에서
 	>> 의도 >> 반드시 재정의 해라 >> 강제적 구현이 목적(믿지 못하니까) 
 */
//=============================================================
class Car{
	void run() {}
}
class Hcar extends Car{	
}
//=========================위코드는 강제성이 없다=========================
abstract class Abclass{
	//abstract class 안에서 최소 1개의 추상함수(자원) 만들겠다
	//완성된 코드
	int pos;
	void run() {
		pos++;
	}
	//민완성 코드
	abstract void stop(); //추상함수 >> 실행 블럭이 없다 >> 재정의 강제
}

class  Child extends Abclass{
	@Override
	void stop() {
		this.pos=0;
		System.out.println("stop : " + this.pos);
	}
}
class Child2 extends Abclass{
	@Override
	void stop() {
		this.pos=-1;
		System.out.println("stop : " + this.pos);
	}
}
public class Ex01_abstract_class {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		//Abclass ab = new Abclass();
		
		Child2 ch2 = new Child2();
		//==========================================================
		//다형성
		Abclass ab = ch;
		//부모 타입의 참조변수는 자식 타입의 객체 주소를 가질 수 있다.(다형성)
		//단 부모는 자기 타입의 자원만 볼 수 있다.
		ab.run();
		ab.stop();	//재정의
		//재정의 된게 있다면 부모로 저장되도 자식의 것을 호출한다.
		//===============부모 타입 접근 -> 그 자원이 추상함수 -> 재정의 된 자식 타입 접근 -> 재정의된 함수 호출
		
	}

}
