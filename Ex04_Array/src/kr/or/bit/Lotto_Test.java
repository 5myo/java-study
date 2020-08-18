package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

/*
1. 1~45까지의 난수를 발생시켜 6개의 배열에 담으세요
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. 배열에 담긴 6개의 배열값은 중복값이 나오면 안되요  (중복값 검증 :별찍기 비슷)
3. 배열에 있는 6개의 값은 낮은 순으로 정렬 시키세요  (정렬 : 자리바꿈)
4. 위 결과를 담고 있는 배열을 출력하세요 (화면 출력)
*/
public class Lotto_Test {
	int[] number=new int[6];	//정수 배열 number 생성 //number에 6개의 방 대입
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	//출력 시 보이는 로또 프로그램 화면
	private String showMenu() {
		System.out.println("***********************");
		System.out.println("****1.당첨 예상 번호 추출하기****");
		System.out.println("****2.프로그램 종료하기^-^****");
		System.out.println("************************");
		System.out.println("원하는 메뉴를 입력해 주세요 : ");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	//번호 추출, 중복제거
	private void makeLottoNumber(){
		for(int i=0; i<6; i++) {	//i가 6보다 작을 때까지 반복
			number[i] = (int)(Math.random()*45 + 1);	//i에 1~45까지 대입
			for(int j=0; j<i; j++) {	//j가 i보다 작을 때까지 반복
				if(number[i] == number[j]) {	//i와 j가 같을 때
					i--;
					break;
				}
			}
		}
	}
	//로또 번호의 합의 평균 범위
	private boolean checkAverage() {
		int sum = 0;
		int average =0;
		for(int num:number) {	//=은 하나만 들어갈 수 있음, :는 배열 방을 전부 대입할 수 있음
			sum+=num;	//sum에 num 값을 더해준다. (sum은 로또 번호 총합계)
		}
		average=sum/number.length;	//sum(로또번호 총합계) 나누기 배열의 길이(6)
		System.out.println("평균"+average);
		return(average>=15&&average<=35);	//평균을 구해서 15~35사이 값인지 확인하는 함수
	}
	
	// 메뉴값 입력 시 돌아가는 코드
	public void selectLottoNumbers() {
		while(true) {
			String selectnum = showMenu();	//selectnum에 프로그램 화면 대입
			switch(selectnum) {
			case "1":		//1을 입력할 경우, 랜덤 번호 추출
				do {		//makeLottoNumber를 한번 이상 무조건 실행
					makeLottoNumber();	//번호추출 및 중복제거
				}while(!checkAverage());	
				showLottoNum();
				break;
			case "2":	//2번을 입력할 경우, 프로그램 종료
				System.out.println("이용해 주셔서 감사합니디.");
				break;
			default:
			System.out.println("오류가 발생하였습니다.");
			break;
			}
		}
	}
	//화면에 낮은 값순으로 출력
	private void showLottoNum() {
		for(int i=0; i<number.length; i++) {	//i가 배열의 길이보다 작을 때까지 반복
			for(int j=i+1; j< number.length; j++) {	//j가 number의 배열(6)보다 작을 때까지 반복
				if(number[i]>number[j]) {	//j가 가진 방의 객체와 i가 가진 방의 객체를 비교
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		//출력하기
		System.out.println("선택한 Lott 번호");
		for(int i =0; i<number.length; i++) {
			System.out.printf("[%2d]", number[i]);
		}System.out.println();
	}

}
