package Team_3;

public class Seller {
	
	// sTotalMoney는 판매자의 총 보유액
	// totalSales는 매출
	// 두 변수는 구매자만 알아도 되기 때문에 getter,setter 설정하지 않음
	private int sTotalMoney;
	private int totalSales;
	// 고기 가격
	// 고기 가격은 read만 가능
	private int beefPrice;
	private int lambPrice;
	private int porkPrice;
	
	// 고기 수량
	// 고기 수량은 read만 가능
	private int numBeef;
	private int numLamb;
	private int numPork;
	
	
	// 생성자
	Seller() {
		// 판매자의 현재 보유액
		sTotalMoney = 500000;
		
		// 고기 가격 초기화
		beefPrice = 10000;
		lambPrice = 5000;
		porkPrice = 3000;
		
		// 고기 수량 초기화
		numBeef = 20;
		numLamb = 10;
		numPork = 5;
	}
	
	// 메뉴판 출력
	void showMenu() {
		System.out.println("=======메뉴=======");
		System.out.println("소고기(10,000원/근)\n"
				+ "양고기(5,000원/근)\n"
				+ "돼지고기(3,000원/근)");
		System.out.println("=================");
		
	}
	public void saleMeat(Buyer buyer) {
		// 총 판매액 = 소고기 구매 개수 x beefPrice + 양고기 구매 개수 x lambPrice + 돼지고기 구매 개수 x porkPrice
		// 판매액은 구매자의 구매 금액 누적
		totalSales += (buyer.getbNumBeef() * beefPrice)
				    + (buyer.getbNumLamb() * lambPrice)
				    + (buyer.getbNumPork() * porkPrice);
		
		// 판매자의 현 보유액에 판매액을 합산
		sTotalMoney += totalSales;
		
		// 각 고기의 구매 수량만큼 고기 보유량 감소
		numBeef -= buyer.getbNumBeef();
		numLamb -= buyer.getbNumLamb();
		numPork -= buyer.getbNumPork();
	}
	
	// 총매출 확인
	public void salesResult() {
		System.out.printf("판매자 총 매출:%d원\n", sTotalMoney - 500000);
	}
	
	// getter
	public int getBeefPrice() {
		return beefPrice;
	}
	public int getLambPrice() {
		return lambPrice;
	}
	public int getPorkPrice() {
		return porkPrice;
	}
	public int getNumBeef() {
		return numBeef;
	}
	public int getNumLamb() {
		return numLamb;
	}
	public int getNumPork() {
		return numPork;
	}
	
}
