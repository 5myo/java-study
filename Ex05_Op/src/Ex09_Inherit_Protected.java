import kr.or.bit.Bird;

//Bird 상속받아서 구현
//Protected 상속관계[재정의]했으면 좋겠어
//상속 : 재정의
class Bi extends Bird{

	@Override
	protected void moveFast() {
		super.moveFast();
	}
}

class Ostrich extends Bird {
	//구체화 특수화
	void run() {
		System.out.println("run^^");
	}
	@Override
	protected void moveFast() {
		run();
	}
}

public class Ex09_Inherit_Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		b.moveFast();
		Ostrich o = new Ostrich();
		o.run();
	}
}
