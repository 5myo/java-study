package Team_2;

import java.util.Scanner;

public class Cinema {
	private String[][] seats;
	private Scanner scanner;

	public Cinema() { // 기본 생성자
		seats = new String[5][5];
		scanner = new Scanner(System.in);
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				seats[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	private String showMenu() {
		System.out.println("**************************************");
		System.out.println("************* 영화 예매 시스템  *************");
		System.out.println("**************************************");
		System.out.printf("1. 예매하기\n2. 예매조회\n3. 예매취소\n4. 종료하기\n");
		String selectNumber = scanner.nextLine();
		return selectNumber;
	}

	public void selectSeats() {
		while (true) {
			String selectNum = showMenu();
			if (selectNum.equals("1")) { 		// 1.예매하기
				showSeats(); 
				booking(); 
			} else if (selectNum.equals("2")) { // 2.예매 조회
				showSeats();
			} else if (selectNum.equals("3")) { // 3.예매 취소
				cancle();
			} else if (selectNum.equals("4")) { // 4.종료
				System.out.println("영화관에서 나갑니다.");
				System.exit(0);
			} else {							
				System.out.println("올바른 형식으로 입력해주세요");
			}
		}
	}

	
	private void showSeats() {	// 좌석을 보여주는 기능
		System.out.println("************** 좌석 현황  **************");
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				System.out.printf("[%s]", seats[i][j].equals((i + 1) + "-" + (j + 1)) ? (i + 1) + "-" + (j + 1) : "예매");
			}
			System.out.println();
		}
		System.out.println("***********************************");
	}

	
	private String randomNumber() {	// 예매번호 출력하는 기능
		String number = Integer.toString((int) (Math.random() * 1000000));	
		return number;
	}

	
	private void booking() {	// 예매하는 기능
		System.out.println("좌석 선택해 주세요");
		System.out.println("예매된 좌석은 \"예매\"라고 표시됩니다.");
		String seatNumber = scanner.nextLine();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (seats[i][j].equals(seatNumber)) {
					System.out.println("예약 가능 좌석입니다. 예매 하시겠습니까?");
					System.out.println("네(1), 아니요(2), 초기화면(0) 중 하나를 입력해 주세요");
					int userchoice = Integer.parseInt(scanner.nextLine());
					switch (userchoice) {
					case 1: // 네
						seats[i][j] = randomNumber();
						System.out.printf("예약 좌석은 [%s]예매 번호는 [%s]입니다. 취소시 예매번호가 필요합니다.\n", seatNumber, seats[i][j]);
						break;
					case 2: // 아니요
						System.out.println("그렇다면 다른 자리를 골라 주세요");
						showSeats();
						booking();
						break;
					case 0: // 초기화면
						showMenu();
						break;
					default:
						System.out.println("올바른 형식의 값을 입력해 주세요");
						break;
					}
				} else {
					System.out.println("이미 예매된 좌석입니다. 다시 선택해주세요.");
				}
			}
		}
	}

	
	public void cancle() {	// 예매를 취소하는 기능
		System.out.println("취소하시려면 예약 번호를 입력해 주세요");
		String cancelcode = scanner.nextLine();
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				if (cancelcode.equals(seats[i][j])) {
					seats[i][j] = (i + 1) + "-" + (j + 1);
					System.out.println(seats[i][j] + "번 좌석의 예매가 취소 되었습니다. 감사합니다.");
				} 
			}
		}
	}
}
