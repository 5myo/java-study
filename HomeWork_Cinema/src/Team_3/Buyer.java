package Team_3;

import java.util.Scanner;

public class Buyer {
	Scanner scanner = new Scanner(System.in);
    // bTotalMoney는 구매자의 총 예산
	// totalPrice는 총 구매 금액
	// 두 변수는 구매자만 알아도 되기 때문에 getter,setter 설정하지 않음
	private int bTotalMoney;
	private int totalPrice;
	// 구매한 고기 수량은 read만 가능
	private int bNumBeef;
	private int bNumLamb;
	private int bNumPork;
	public Buyer() {
		bTotalMoney = 100000;
	}
	public void buyMeat(Seller seller) {
		
		// 구매 수량 입력 반복
		do {
			try {
				// 구매 수량 입력
				System.out.println("구매 수량을 입력해주세요.");
				System.out.printf("현재 고기 보유량\n" + "소고기:%d근, 양고기:%d근, 돼지고기:%d근\n", seller.getNumBeef(), seller.getNumLamb(),
						seller.getNumPork());
				System.out.print("소고기>");
				bNumBeef = scanner.nextInt();
				System.out.print("양고기>");
				bNumLamb = scanner.nextInt();
				System.out.print("돼지고기>");
				bNumPork = scanner.nextInt();
				// 판매자의 고기 보유량은 구매자가 구매하려는 고기 수량 보다 많거나 같아야 함
				// 구매자가 구매하려는 고기 수량은 0보다 작을 수 없음
				if ((seller.getNumBeef() >= bNumBeef && 0 < bNumBeef) && (seller.getNumLamb() >= bNumLamb && 0 < bNumLamb)
						&& (seller.getNumPork() >= bNumPork && 0 < bNumPork)) {
					// 전체 구매 금액 계산식
					totalPrice = (bNumBeef * seller.getBeefPrice()) + (bNumLamb * seller.getLambPrice())
							+ (bNumPork * seller.getPorkPrice());
					// 가격 출력
					System.out.printf("가격:%d\n", totalPrice);
					
					if (totalPrice > bTotalMoney) {
						throw new Exception("손님. 돈이 없으십니다."); // 예산 초과하면 예외처리
					} else {
						bTotalMoney -= totalPrice; // 잔액 계산
					}
					break;
				} else {
					throw new Exception("잘못된 숫자를 입력하였거나 보유한 고기 수량이 부족합니다.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	public void balance() {
		System.out.printf("구매자 잔액:%d원\n", bTotalMoney);
	}
	
	// getter
	public int getbNumBeef() {
		return bNumBeef;
	}
	public int getbNumLamb() {
		return bNumLamb;
	}
public int getbNumPork() {
		return bNumPork;
	}
}