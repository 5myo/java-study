package Team_4;

import java.util.Scanner;
public class Cafe {
	static Scanner sc = new Scanner(System.in);
	int displayMenu() {
		System.out.println("***************");
		System.out.println("****메뉴 선택****");
		System.out.println("1. 아메리카노 / 1000원");
		System.out.println();
		System.out.println("2. 카페라떼 / 2000원");
		System.out.println();
		System.out.println("3. 카페모카 / 3000원");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while 탈출 (1<= menu <=4)
						}else {
							throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~4번까지 입력");
			  }
		}while(true);
		//실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
		return menu;
	}
	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Cafe cafe = new Cafe();
		while(true)	{
		int menu = cafe.displayMenu();
			switch (menu) {
			case 1 : System.out.println("아메리카노를 선택하였습니다.");
			 		 System.out.println("금액을 투입하세요.");
				break;
			case 2 : System.out.println("라떼를 선택하였습니다.");	
					 System.out.println("금액을 투입하세요.");
				break;
			case 3 : System.out.println("모카를 선택하였습니다.");	
					 System.out.println("금액을 투입하세요.");
				break;
			case 4 : System.out.println("프로그램 종료");
					 //return;  //main 종료
					 System.exit(0); //프로그램 강제 종료 (kill)
			}
		int userMoney = Integer.parseInt(sc.nextLine());
		cm.calcMoney(userMoney, menu);
		String mention="";
		switch(menu) {
		case 1 :mention=cm.makeAmericano();
		System.out.println(mention);
		break;
		case 2 :mention= cm.makelatte();
		System.out.println(mention);
		break;
		case 3 :mention=cm.makemocha();
		System.out.println(mention);
		break;
		}
		cm.checkMoney();
		cm.checkStock();
		}
	}
}