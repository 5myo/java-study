package kr.or.bit;
//디자인 패턴 (생성 패턴) >> new >>
//객체 하나를 만들어 공유하겠다
//의도 : 하나의 객체를 공유하는 것을 보장하겠다.(하나의 객체만 만들겠다)

//활용
//공유프린터
//DB 연결
//활용 >> JDBC

public class Singleton {
	private static Singleton p;
	private  Singleton() {
		//직접 객체 생성 불가, new(x) >> heap에 객체 생성 불가
	}
	public static Singleton getinstance() {
		if(p==null) {
			p = new Singleton();	//heap 메모리에 Singleton 객체 >> 객체의 주소를 p가 참조
		}
		return p;
	}
}
