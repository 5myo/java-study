package Team_2;

import java.util.Scanner;

public class RentalService {
	Scanner sc = new Scanner(System.in);

	public void main() {
		while (Bicycle.count < 3) {
			System.out.println("=========자전거 대여=========");
			System.out.print("이름입력 해 주세요 :");
			String name = sc.nextLine();
			System.out.print("생년월일을 입력해 주세요 :");
			int birth = Integer.parseInt(sc.nextLine());
			System.out.print("전화번호를 입력 해 주세요 :");
			int phoneNumber = Integer.parseInt(sc.nextLine());
			rental();
			choice();
		}
		System.out.println("오늘 대여할 수 있는 자전거가 모두 소진 됐습니다.");
	}

	public void choice() {
		System.out.println("============가격표============");
		System.out.print("1.1시간권 2.3시간권 3.6시간권  4.종일권  ");
		int choice = Integer.parseInt(sc.nextLine());
		int price = 1000;

		loop_1: while (true) {
			switch (choice) {
			case 1:
				System.out.println("1시간권은 " + 1 * price + "원 입니다.");
				break loop_1;
			case 2:
				System.out.println("3시간권은 " + 3 * price + "원 입니다.");
				break loop_1;
			case 3:
				System.out.println("6시간권은 " + 6 * price + "원 입니다.");
				break loop_1;
			case 4:
				System.out.println("종일권은 " + 20 * price + "원 입니다.");
				break loop_1;
			default:
				System.out.println("다시 입력해주세요");
				System.out.print("1.1시간권 2.3시간권 3.6시간권  4.종일권  ");
				choice = Integer.parseInt(sc.nextLine());
			}
		}
	}
	public void rental() {
		Bicycle b = new Bicycle();
		System.out.println("======색상을 입력해 주세요 (기본 black)======");
		System.out.print("색상 : ");
		b.setColor(sc.nextLine());
		if (b.getColor().equals("black")) {
			System.out.println(b.getColor() + "선택하셨습니다.");
		} else {
			System.out.println(b.getColor() + "선택하셨습니다.");
		}
		Bicycle.count++;
		System.out.println(
				"휠 크기: " + b.getWheel() + "inch 몸통 크기: " + b.getBody() + "cm 핸들 크기:" + b.getHandle() + "cm 색상: "
						+ b.getColor() + "\n" + "현재까지 총 " + b.count + "개 대여 됐습니다.\n남은 자전거는 " + (3 - b.count) + "대입니다.");
	}
}