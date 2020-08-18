package kr.or.bit;

import java.util.Scanner;

public class Clinema {
	//선언
	private Scanner scanner;
	private String[][] seat;
	//초기값
	public Clinema() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
	}
	//출력 화면
	private String Clinemaprint(){
		System.out.println("***********************");
		System.out.println("*******영화 예매 시스템*******");
		System.out.println("***********************");
		System.out.println("1. 예매하기");
		System.out.println("2. 예매조회");
		System.out.println("3. 예매취소");
		String clinemamenu = scanner.nextLine();
		return clinemamenu;
	}
	//입력 기능
	public void selectClinema() {
		while(true) {
			String seletnum = Clinemaprint();
			switch(seletnum) {
				case "1" :
						ClinemaScren();
			}
		}
	}
	//영화 예매 화면
	public void ClinemaScren(){
		//배열 생성
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				seat[i][j]="";
			}
		}
		//좌석 현황
		System.out.println("*********좌석 현황*********");
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("좌석을 선택해 주세요.");
	}
}
