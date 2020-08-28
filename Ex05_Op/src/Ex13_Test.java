

/*
문제 풀어 보세요 ^^
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy())
hint) Buyer ..>> summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다
*/

class Product3{	//상품 클래스 생성	//부모 클래스
	int price;	//상품가격
	int bonuspoint;	//보너스 포인트
	Product3(int price){	//멤버필드 기능할당
		this.price = price;
		this.bonuspoint= this.price%10;
	}
}

//--------------가전제품 생성 START
class Monitor extends Product2{	//자식 클래스 Monitor 생성
	Monitor(){	//Monitor 생성자(기능 할당)
		super(30000);	//extends는 상속을 의미, super는 부모 클래스의 기능을 사용하도록 가져오는 것
	}
	@Override
	public String toString() {
		return "Monitor";
	}
}
class Mouse extends Product2{	
	Mouse(){	
		super(5000);	
	}
	@Override
	public String toString() {
		return "Mouse";
	}
}
class Keyboard extends Product2{	
	Keyboard(){
		super(30000);	
	}
	@Override
	public String toString() {
		return "50000";
	}
}//--------------가전제품 생성 END

//--------------구매자 생성 START
class Buyer3{
	Product3[] cart;	//장바구니
	int total;
	int money=100000;
	int bonuspoint;
	void Buy(Product3 p) {
		if(this.money<p.price) {	//잔액 부족 시
		    System.out.println("잔액이 부족합니다.");
		    return;
		}
		Product3[] Cart = new Product3[10];	//장바구니 안에 담을 수 있는 상품의 개수는 10개까지
		for(int i=0; i< this.cart.length; i++) {	//실구매
			this.money-=p.price;
			this.bonuspoint+=p.bonuspoint;
		}
		System.out.println(p.toString()+"의 구매가 완료되었습니다.");
		System.out.println("총" + Cart + "개의 상품을 구매 하셨으며 보너스 포인트 " + p.bonuspoint + "이 적립되었습니다.");
	}
}//--------------구매자 생성 END

public class Ex13_Test {
	public static void main(String[] args) {
		//--------------매장 START
		Monitor moniter = new Monitor();
		Mouse mouse = new Mouse();
		Keyboard keyboard = new Keyboard();
		//--------------매장 END
		
		Buyer2 buyer = new Buyer2();
		buyer.Buy(moniter);
		buyer.Buy(mouse);
		buyer.Buy(keyboard);
	}
}
