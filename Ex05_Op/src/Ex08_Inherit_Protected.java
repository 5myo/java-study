import kr.or.bit.Pclass;

/*
 	public, private, default, 상속관계에서 >> protected
 	
 	protceted : 양면성 (박쥐) : >> default, public
 	>>상속이 없는클래스 안에서 protected 접근자는 default와 같아요
 	>>결국 상속관계에서만 의미를 가진다
 */
class Dclass{
	public int i;
	private int p;
	int s; //default
	protected int k;	//default (일반 클래스는 사용할 이유가 없다)
}
class Child2 extends Pclass{
	void method() {
		//ths.j
		this.k=1000;	//상속관계에서 자식은 부모의 protrcted 접근 (public 처럼)
		System.out.println(this.k);
	}

}

public class Ex08_Inherit_Protected {

	public static void main(String[] args) {
		Pclass p = new Pclass();
		//p.j	//참조변수 >> public 접근
		//p.k	//default
		
		
	}

}
