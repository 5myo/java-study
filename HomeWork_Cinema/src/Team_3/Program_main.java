package Team_3;

public class Program_main {

	public static void main(String[] args) {
		Seller seller = new Seller();
		Buyer buyer = new Buyer();
		ButcherShop butcherShop = new ButcherShop();
		
		// 메뉴 선택 시 각 메서드 호출
		while(true) {
			switch (butcherShop.displayMenu()) {
				case 1 : seller.showMenu();
					break;
				case 2 : buyer.buyMeat(seller);
					break;
				case 3 : buyer.balance();
					break;
				case 4 : seller.saleMeat(buyer);
					break;
				case 5 : seller.salesResult();
					break;					
				case 6 : System.out.println("프로그램 종료");
					System.exit(0);
			}
		}

	}

}
