package Team_4;

public class CoffeeMachine {
	Stock stock = new Stock();
// 물, 우유 등 추가 기능 O
// 돈 계산 기능 O
// 변수 : 메뉴가격, 이름 O
// 잔액 확인 o
// 재고 확인 o
	String cup;
	private int americano;
	private int latte;
	private int mocha;
	public CoffeeMachine() {
		this(1000, 2000, 3000);
	}
	public CoffeeMachine(int americano, int latte, int mocha) {
		this.americano = americano;
		this.latte = latte;
		this.mocha = mocha;
	}
	public String makeAmericano() {
		stock.water1();
		stock.shot1();
		return "아메리카노가 준비되었습니다"; 
	}
	public String makelatte() {
		stock.milk1();
		stock.shot1();
		return "카페라떼가 준비되었습니다"; 
	}
	public String makemocha() {
		stock.milk1();
		stock.shot1();
		stock.syrup1();
		stock.whipping1();
		return "카페모카가 준비되었습니다"; 
	}
	public void calcMoney(int userMoney, int menu) {
		switch(menu) {
		case 1 : System.out.println("거스름 돈 : " + (userMoney-this.americano));
		stock.setMoney(this.americano);
		break;
		case 2 : System.out.println("거스름 돈 : " + (userMoney-this.latte));
		stock.setMoney(this.latte);
		break;
		case 3 : System.out.println("거스름 돈 : " + (userMoney-this.mocha));
		stock.setMoney(this.mocha);
		break;
		default : System.out.println("오류!!!!!!!!!!!!!");
		}	
	}
	public void checkMoney() {
		System.out.println("현재 기계에 있는 돈은 : "+this.stock.getMoney());
	}
	public void checkStock() {
		System.out.println("현재 남은 물은 : "+this.stock.getWater());
		System.out.println("현재 남은 우유는 : "+this.stock.getMilk());
		System.out.println("현재 님은 시럽은 : "+this.stock.getSyrup());
		System.out.println("현재 휘핑은 : "+this.stock.getWhipping());
		System.out.println("현재 샷은: "+this.stock.getShot());
	}
}