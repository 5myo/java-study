package Team_3;

import java.util.Scanner;

public class Cinema_3 {
	private Scanner scanner;

	private String[][] seat;
	private int[][] ticketNumber;

	public Cinema_3() {
		scanner = new Scanner(System.in);

		seat = new String[4][5];
		ticketNumber = new int[4][5];
	}

	// 좌석 초기화
	public void initSeat() {
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = (i + 1) + "-" + (j + 1);
			}
		}
	}

	// 예매
	// 첫 실행 메서드
	public void execution() {
		while (true) {
			int initMenuNum = showReservationMenu();
			switch (initMenuNum) {
			case 1:
				showSeat();
				selectSeat();
				break;
			case 2:
				reservationInfo();
				break;
			case 3:
				cancelReservation();
				break;
			case 4:
				showSeat();
				break;
			case 5:
				System.out.println("프로그램 종료");
				System.exit(0);
			default:
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}

	// 메뉴출력
	private int showReservationMenu() {
		System.out.println("**********************");
		System.out.println("******영화 예매 시스템******");
		System.out.println("**********************");
		System.out.println("1. 예매하기");
		System.out.println("2. 예매조회");
		System.out.println("3. 예매취소");
		System.out.println("4. 좌석현황");
		System.out.println("5. 종      료");
		int reservationMenuNum = Integer.parseInt(scanner.nextLine());
		return reservationMenuNum;
	}

	// 좌석 현황 출력
	private void showSeat() {
		System.out.println("*********좌석 현황**********");
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------------");
	}

	
	// 좌석 선택
	private void selectSeat() {
		int row;
		int col;

		String userInput;

		do {
			System.out.println("좌석을 선택해주세요. 예)1-1"
							 + "\n이미 예매된 좌석은 \"예매\"라고 표시됩니다.");
			userInput = scanner.nextLine();
		} while (seatCheck(userInput));

		row = Integer.parseInt(userInput.substring(0, 1)) - 1;
		col = Integer.parseInt(userInput.substring(2, 3)) - 1;

		if (seat[row][col].equals((row + 1) + "-" + (col + 1))) {
			System.out.println("예약 가능 좌석입니다");
			reservation();

			// 아래는 reservation case1(최종예매) 선택 시 실행
			seat[row][col] = "예매";                                              	 // 예매좌석 배정
			ticketNumber[row][col] = Integer.parseInt("1" + (row + 1) + (col + 1));  // 예매번호 배정
			System.out.printf("예매가 완료되었습니다."                                      // 예매내역 출력
							+ "\n예매한 좌석번호:[%s]/ 예매번호:[%d]"
							+ "\n감사합니다.\n", (row+1) + "-" + (col+1), ticketNumber[row][col]);
		} else {
			System.out.println("이미 예약 되었습니다");
			System.out.println("다른 좌석을 선택해주십시오.");
			showSeat();
			selectSeat();
		}
	}

	
	// 좌석번호 확인(4x5 좌석배열 안에 들어있는 숫자를 입력하는지 확인)
	// %d-%d 형식에서는 검사가 가능하지만 완전히 무관한 형식의 좌석번호를 입력하는 것은 예외처리 하지 못함(eg.4a-5)
	private boolean seatCheck(String userInput) {
		int row;
		int col;

		row = Integer.parseInt(userInput.substring(0, 1)) - 1;
		col = Integer.parseInt(userInput.substring(2)) - 1;

		if (!((row >= 0 && row <= 3) && (col >= 0 && col <= 4))) {
			System.out.println("잘못된 좌석번호를 입력하였습니다." + "\n다시 입력하여 주십시오.");
			return true;
		} else {
			return false;
		}
	}

	// 위 리턴 값에따라
	// case 1: 다시 selectSeat if문으로 돌아가 예매 완료
	// case 2: execution 돌아가기
	// case 0: execution 돌아가기
	private void reservation() {
		int reservationMenuNum = reservationMenu();
		Loop_1  :while(true) {
			switch (reservationMenuNum) {
			case 1:
				break Loop_1;
			case 2:
				System.out.println("초기 화면으로 돌아갑니다.");
				break Loop_1;
			case 0:
				break Loop_1;
			default:
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}

	// 예매 가능 시 메뉴
	private int reservationMenu() {
		System.out.println("예매 가능합니다. 예매하시겠습니까?");
		System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
		int reservationMenuNum = Integer.parseInt(scanner.nextLine());
		return reservationMenuNum;
	}
	// 예매번호 조회(예매번호 출력)
	private String reservationInfo() {
		String userInput;
		Loop_2: do {
			try {
				int row;
				int col;

				System.out.println("예매번호를 입력해주세요.");
				userInput = scanner.nextLine();

				row = Integer.parseInt(userInput.substring(1, 2)) - 1;
				col = Integer.parseInt(userInput.substring(2, 3)) - 1;

				// userInput이 ticketNumber[row][col]과 일치하면 출력
				// 없으면 예매 내역에 없는 예매번호입니다. 다시 입력해주세요.
				for (int i = 0; i < seat.length; i++) {
					for (int j = 0; j < seat[i].length; j++) {
						if (seat[i][j].equals("예매")) {
							if (ticketNumber[row][col] == Integer.parseInt(userInput)) {
								String seatNum = (row + 1) + "-" + (col + 1);
								System.out.printf("고객님이 예매하신 좌석은[%s]입니다.\n", seatNum);
								break Loop_2;
							} else {
								throw new Exception("예매 내역에 없는 예매번호입니다. 다시 입력해주세요.");
							}
						} //예매된 내역이 없을 경우 돌아가는 방법을 모르겠다
					}
				}
			} catch (Exception e) {
				System.out.println("***예매 번호 입력 오류***");
				System.out.println(e.getMessage());
			}
		} while (true);
		return userInput;
	}

	// 예매취소
	private void cancelReservation() {
		String userInput = reservationInfo();

		int row;
		int col;

		row = Integer.parseInt(userInput.substring(1, 2)) - 1;
		col = Integer.parseInt(userInput.substring(2, 3)) - 1;

		System.out.println("예매를 취소하시겠습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		int selectNum = Integer.parseInt(scanner.nextLine());
		Loop_3: while (true) {
			switch (selectNum) {
			case 1:
				seat[row][col] = (row + 1) + "-" + (col + 1);
				System.out.println("예매가 취소되었습니다. 감사합니다.");
				break Loop_3;
			case 2:
				System.out.println("초기화면으로 돌아갑니다.");
				break Loop_3;
			default:
				System.out.println("잘못된 번호를 입력하였습니다.");
			}
		}
	}
}
