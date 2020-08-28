package Team_1;

import java.util.Scanner;

public class Cinema {
	private String[][] seat;
	private Scanner scanner;
	private int[][] reservedNumber;
	
	public Cinema() { //초기화 (member field)
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		reservedNumber = new int[4][5];
	}
	
	public void selectSeatStart(){
loop_1:	while(true) {
			String selectnum = showMenu();
			switch (selectnum) {
			case "1": selectSeat();
				break;
			case "2": seatInfo();
				break;
			case "3": reserveConfirm();
				break;
			case "4": cancleReserve();
				break;		
			case "5":  //프로그램 종료 : 함수 종료(return), 프로그램 종료(System.exit(0)), 라벨값
				System.out.println("Good Luck");
				break loop_1; //break의 지점이 switch가 아니라 라벨(loop_1) 위치로 감, while문 탈출
			default: 
				break;
			}
		}
	}
	
	public void seatInit() {		//좌석 초기화
		for(int i=0;i<seat.length;i++) { //기능1
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j] = (i+1)+"-"+(j+1); //좌석
			}
		}
	}
	
	private String showMenu() {
		System.out.println("************************");
		System.out.println("*1. 예매하기*");
		System.out.println("*2. 좌석조회*");
		System.out.println("*3. 예매조회*");
		System.out.println("*4. 예매취소*");
		System.out.println("*5. 프로그램 종료*");
		System.out.println("************************");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
		
	private void selectSeat(){		//1번 메뉴 좌석 선택 실행코드
		
		System.out.println("좌석을 선택해주세요 예)1-1");
		System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다");
		String select1 = scanner.nextLine();
		
		System.out.println("예매 가능합니다. 예매 하시겠습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		int select2 = Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i=0;i<seat.length;i++) { 
				for(int j=0;j<seat[i].length;j++) {
					if(select1.equals(seat[i][j])){
						seat[i][j] = "예 매";
						reservedNumber[i][j] = (int)(Math.random()*100000000);
						System.out.println("예매가 완료되었습니다.");
						System.out.printf("예매한 좌석번호:[%d-%d] / 예매번호:[%d]\n",i+1,j+1,reservedNumber[i][j]);
					}else if(seat[i][j] == "예 매") {
						System.out.println("이미 예약중입니다.");
					}
				}				
			}
			break;
		case 2:
			System.out.println("다시 선택해주세요.");
			break;
		default:
			break;
		}
	}
private void seatInfo(){			//2번메뉴 실행코드
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}
	}
	
	
	private void reserveConfirm(){		//3번 메뉴 실행코드
		System.out.println("예매번호를 입력해주세요.");
		int select = Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(select==reservedNumber[i][j]){
				System.out.printf("고객님이 예매하신 좌석은 [%d-%d]입니다.\n",i+1,j+1);
				}				
			}
		}
	}
	
	private void cancleReserve(){		//4번 메뉴 실행코드
		System.out.println("예매번호를 입력해주세요.");
		int select1 = Integer.parseInt(scanner.nextLine());
		
		for(int i=0;i<seat.length;i++) { 
			for(int j=0;j<seat[i].length;j++) {
				if(select1==reservedNumber[i][j]){
				System.out.printf("고객님이 예매하신 좌석은 [%d-%d]입니다.\n",i+1,j+1);
				}				
			}
		}
		
		System.out.println("예매를 취소하시겠습니까?");
		System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
		int select2 = Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i=0;i<reservedNumber.length;i++) {
				for(int j=0;j<reservedNumber[i].length;j++) {
					if(reservedNumber[i][j]==select1) {
						seat[i][j] = (i+1)+"-"+(j+1);
						reservedNumber[i][j] = 0;
						System.out.println("예매가 취소되었습니다.");
					}
				}
			}
			break;
		case 2:
			System.out.println("다시 선택해주세요.");
			break;
		default:
			break;
		}
	}
}

