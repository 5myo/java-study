class Product2 {
	int price;
	int point;
	Product2(int price){
		this.price = price;
		this.point = (int)(this.price/10.0);
	}
}
class KtTv2 extends Product2 {
	KtTv2(){
		super(500);
	}
	@Override
	public String toString() {
		return "KtTv";
	}
}
class Buyer2 {
	int money=100;
	int point;
	void Buy2(Product2 p){
		if(this.money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} 
		this.money-=p.price;
		this.point+=p.point;
		System.out.println("이용해 주셔서 감사합니다.\n"+p.toString()+"가 무사히 결제되었습니다.");
	}
}
public class test2 {
	public static void main(String[] args) {
		KtTv2 kttv = new KtTv2();
		Buyer2 buyer = new Buyer2();
		buyer.Buy2(kttv);
	}
}
