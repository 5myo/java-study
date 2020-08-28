/*
 OOP
 1. 상속
 2. 캡슐화(온닉화)>>private
 3. 다형성
 
 1.상속
	 java : child extends Base
	 c# : child : Base
 
 2. 특징
	 2.1 다중 상속은 불가
	 2.2 단일 상속(계층적 상속 : 통해서 여러개의 클래스를 상속)
	 2.3 다중 상속을 지원(유일 : interface)
	 
3. 상속
	3.1 진정한 의미 : 재사용성
	3.2 단점 : 초기 설계 비용
	3.3 재사용성 >> 설계 >> 비용(시간 공통 자원(분모, 추상화))
	
4. 상속관계 Memory ?

여러개의 상속을 받으려면 객층적 상속을 받아야 한다.(ex.Child)

사용자가 만드는 모든 클래스는 default Object 클래스 상속
class Car extends Object...생략...
Object 모든 클래스의 root (최상위) : 모든 클래스의 부모 클래스
 */
//class Car extends Object {}
class Car{
	
}

class GrandFather{
	public GrandFather() {	//생성자
		System.out.println("GrandFater");
	}
	public int gmoney = 5000;
	private int pmoney = 10000; //접근 불가(객체, 상속관계) : 내부에서
	
}
class Father extends GrandFather{	//extends (클래스명)은 상속의 의미
	public Father() {		//생성자
		System.out.println("Father");
	}
	public int fmoney = 3000;
}
class Child extends Father{
	public Child() {	//생성자
		System.out.println("Child");
	}
	public int cmoney = 1000;
}
public class Ex01_inherit {
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney);	//할아버지 돈 내돈
		System.out.println(child.fmoney);		//아버지 돈 내돈
		System.out.println(child.cmoney);	//내것도 사용 
		
		Car car = new Car();
	}
}
