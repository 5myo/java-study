class Product{	//클래스  헤더
	int price;	//상품금액
	int point;	//적립 포인트
	Product(int price){
		this.price=price;
		this.point=(int)(this.price/10.0);
	}
}
class KtTv extends Product {	//extends는 상속
	KtTv(){	//생성자 KtTv
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}
class Buyer{
	int money=1000;
	int point;
	void Buy(Product p) {
		if(this.money<p.price) {
			System.out.println("손님, 잔액이 부족합니다.");
			return;
		}
		this.money-=p.price;
		this.point+=p.point;
		System.out.println("구매하신 상품은"+p.toString());
	} 
}
public class test {

	public static void main(String[] args) {
		KtTv tv = new KtTv();
		
		Buyer buyer = new Buyer();
		buyer.Buy(tv);
	}

}
