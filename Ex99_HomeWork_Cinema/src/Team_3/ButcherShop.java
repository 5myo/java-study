package Team_3;

import java.util.Scanner;

public class ButcherShop {
Scanner scanner = new Scanner(System.in);
	
	// 메뉴 출력
	int displayMenu() {
		System.out.println("================");
		System.out.println("1. (구매자) 메뉴보기");
		System.out.println("2. (구매자) 주문하기");
		System.out.println("3. (구매자) 잔액확인");
		System.out.println("4. (판매자) 판매하기");
		System.out.println("5. (판매자) 매출확인");
		System.out.println("6. 프로그램 종료");
		System.out.println("================");
		System.out.printf(">메뉴 번호를 입력하세요:");
		
		int menu = 0;
		do {
			  try {
			      menu = Integer.parseInt(scanner.nextLine());
				  if(menu >= 1 && menu <= 6) {
					  break;
				  }else {
					  throw new Exception("번호가 잘못 선택되었습니다");
				  }
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~6번까지 입력");
			  }
		}while(true);
		return menu;
	}
}
