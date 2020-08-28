/*
 	다형성 (상속관계에서 존재)
 	다형성 : 여러가지 성질(형태)를 가질 수 있는 능력
 	
 	C# : 다형성(overloading, override)...
 	
 	JAVA : [상속관계]에서 [하나의 참조변수]가 여러개의 타입을 가질 수 있다
 	[하나의 참조변수]>>[부모타입]
 	부모클래스 타입의 참조변수가 여럭의 자식클래스 객체를 담을 수 있다
 	
 	다형성 : 현실)부모는 자식에게  조건없이 모든 것을 준다
 			   자식이 부모에게 조건없이 드린다 >> 다형성
 */
class Tv2{	//부모(일반화, 추상화) 공통(분모)
	boolean power;
	int ch;
	
	void power() {
		this.power =!this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class CapTv extends Tv2 {	//CapTv 특수화, 구체화, 고유한...
	String text;
	String captionText() {
		return this.text="현재 자막 처리중";
	}
}
public class Ex10_Inherit_Poly {
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("전원"+ captv.power);
		
		captv.chUp();
		System.out.println("채널정보 : "+captv.ch);
		System.out.println(captv.captionText());
		//기본 배운 내용 
		
		//Car c = new Car();
		//Car c2 = c;
		
		Tv2 tv2=captv;
		//상속관계에서 부모타입은 자식 타입의 주소를 가질 수 있다(다형성)
		//단 부모는 자신의 자원만 접근 할 수 있다
		//단 재정의 제외하고
		
		System.out.println(tv2.toString()); //CapTv#15db9742
		System.out.println(captv.toString());//CapTv#15db9742
		
		//같은 601호에 들어가도 자식은 다 볼 수 있다(오디오) == 자식은 부모의 기능도 자식의 기능도 다 사용가눙
		//부모는 부모가 사준 것만(냉자고, TV)	== 부모는 부모의 기능만 사용가능
		//tv2.captionText() 불가
	}

}
