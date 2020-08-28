
/*
 	변수 <-> 상수
 	상수 : 한번 값이 [초기화]되면 변경 불가
 	상수자원 : 고유값(주민번호), 수학 PI=3.1415...,버전번호 : 시스템 관리번호
 	상수는 관용적으로 대문자
 	
 	java : final int NUM=10;
 	C# : const integer NUM=10;
 	
 	final 키원드
 	클래스 앞에 >> final  class Car{} >> fabak Math >> 상속금지
 	함수 앞에 >> public final void print() {} 상속 >> 재정의 하지마(override 금지)
 					  public static void print() >> 객체간 공유 함수
 */
class Vcard {
	final String KIND="heart";
	final int Num=10;
	void method() {
		System.out.println(Math.PI);
	}
}
class Vcard2{		//설계도를 제작할 때 초기화를 보장(생성자) //클래스 헤더
	final String KIND;	//타입별 변수 생성
	final int NUM;
	
//	Vcard2(){	//생성자 메소드, 변수 값 지정
//		this.KIND="heart";
//		this.NUM=10;
//	}
	Vcard2(String kind, int num){	//오버로딩	//카드 53장의 모양과 숫자는 다르다(한번 정해지면 변경 불가)
		this.KIND=kind;
		this.NUM=num;
	}

	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}
public class Ex07_Final {

	public static void main(String[] args) {
		Vcard v= new Vcard();
//		v.KIND ='AAA';
		v.method();
		
		Vcard2 v1 = new Vcard2("spade",1);
		System.out.println(v1.toString());
		Vcard2 v2 = new Vcard2("spade",2);
		System.out.println(v1.toString());
		Vcard2 v3 = new Vcard2("spade",3);
		System.out.println(v1.toString());
	}

}
