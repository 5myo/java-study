/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price=price;
		this.bonuspoint=(int)(this.price/10.0);
	}
}
class KtTv extends Product{	//KtTv(자식)에 Product(부모)를 상속
	KtTv(){
		super(500);//500원
	}//KtTv(int price){super(price);}

	@Override
	public String toString() {
		return "KtTv";
	}
}
class Audio extends Product{	//KtTv(자식)에 Product(부모)를 상속
	Audio(){
		super(100);//500원
	}//KtTv(int price){super(price);}

	@Override
	public String toString() {
		return "Audio";
	}
}
class NoteBook extends Product{	//KtTv(자식)에 Product(부모)를 상속
	NoteBook(){
		super(150);//500원
	}//KtTv(int price){super(price);}

	@Override
	public String toString() {
		return "NoteBook";
	}
}
/*
구매자 구매행위 (기능)
구매행위 (잔액 - 제품의 가격, 포인트 정보)
***구매자는 매장에 있는 모든 물건을 구매할 수 있다***

1차 코드

개발자 재형 하와이 휴가

공식오픈
매장에 저품이 1000개 다른 제품이 추가(마우스, 토스트기) (제품 등록 POS 등록 자동화)
매장에 제품이 전식(1000개)
>>매장에서 구매자가 3개까지밖에 구매를 못하는 일이 발생
	 나머지 997개의 제품을 구매하는 기능이 없음
	 

재형 >> PC방 >> 국내 전산망 >> 개발 서버 접속 >> 997개의 함수 >> 휴가 종료
>>코드를 짤 때 변화에 대응할 수 있게 만들어야 됨

즐거운 휴가를 보내기 위한 방법을 제시
1. 사는 기능을 하나로 통합
2.
3. 하나의 함수 모든 구매 행위, parameter
4. 


물건을 3개 구매할 수 있는 함수 3개
*/
class Buyer{
	int money = 1000;
	int bonuspoint;
	//1차
	/*
	void KttvBuy(KtTv n) {	//함수가 제품 객체의 주소를 parameter 받아서 가격, 포인트
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다."+ this.money);
			return;	//함수 종료(탈출)
		}
		//실 구매 행위
		this.money-=n.price; //잔액
		this.bonuspoint+=n.bonuspoint; //누적
		System.out.println("구매한 물건은 : " + n.toString());
	}
	void Audio(Audio n) {	//함수가 제품 객체의 주소를 parameter 받아서 가격, 포인트
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다."+ this.money);
			return;	//함수 종료(탈출)
		}
		실 구매 행위
		this.money-=n.price; //잔액
		this.bonuspoint+=n.bonuspoint; //누적
		System.out.println("구매한 물건은 : " + n.toString());
	}
	void NoteBook(NoteBook n) {	//함수가 제품 객체의 주소를 parameter 받아서 가격, 포인트
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다."+ this.money);
			return;	//함수 종료(탈출)
		}
		this.money-=n.price; //잔액
		this.bonuspoint+=n.bonuspoint; //누적
		System.out.println("구매한 물건은 : " + n.toString());
	}*/
	
	//2차 개선 (리팩토링)
	/*
	void Buy(KtTv n) {  //함수가 제품 객체의 주소를  parameter  받아서 가격 ,포인트
		   if(this.money < n.price) {
			     System.out.println("고객님 잔액이 부족합니다 ^^! " + this.money);
			     return; //함수 종료  (구매행위 종료)
		   }
		   //실 구매 행위
		   this.money -= n.price; //잔액
		   this.bonuspoint += n.bonuspoint; //누적
		    System.out.println("구매한 물건은 :" +  n.toString());
	}
	
	void Buy(Audio n) {  //함수가 제품 객체의 주소를  parameter  받아서 가격 ,포인트
		   if(this.money < n.price) {
			     System.out.println("고객님 잔액이 부족합니다 ^^! " + this.money);
			     return; //함수 종료  (구매행위 종료)
		   }
		   //실 구매 행위
		   this.money -= n.price; //잔액
		   this.bonuspoint += n.bonuspoint; //누적
		    System.out.println("구매한 물건은 :" +  n.toString());
	}
	
	void Buy(NoteBook n) {  //함수가 제품 객체의 주소를  parameter  받아서 가격 ,포인트
		   if(this.money < n.price) {
			     System.out.println("고객님 잔액이 부족합니다 ^^! " + this.money);
			     return; //함수 종료  (구매행위 종료)
		   }
		   //실 구매 행위
		   this.money -= n.price; //잔액
		   this.bonuspoint += n.bonuspoint; //누적
		    System.out.println("구매한 물건은 :" +  n.toString());
	}
}*/
	//3차개선
	//제품이 추가 되더라도 구매행위 계속 ....
	//하나의 이름 , 중복 코드 제거 , ,,,
	//모든 제품이  product 를 상속 (부모)
	//Product p;
	//Audio audio = new Audio();
	//p = audio;
	void Buy(Product n) {  //함수가 제품 객체의 주소를  parameter  받아서 가격 ,포인트
		   if(this.money < n.price) {
			     System.out.println("고객님 잔액이 부족합니다 ^^! " + this.money);
			     return; //함수 종료  (구매행위 종료)
		   }
		   //실 구매 행위
		   this.money -= n.price; //잔액
		   this.bonuspoint += n.bonuspoint; //누적
		    System.out.println("구매한 물건은 :" +  n.toString());
	}
}
//Kt tv = new Kt(500);
public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		//매장
		KtTv tv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);
	}
}
