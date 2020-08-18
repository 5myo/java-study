
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];	//문자열 3행 5열 방 생성
		for(int i=0; i<seat.length; i++) {	//i가 seat의 행보다 작을 때까지 반복
			for(int j=0; j<seat[i].length; j++) {		//j(열)가 seat의 (i)행보다 작을 때까지 반복
				seat[i][j]="___";	//죄석
			}
		}
		//예매
		seat[2][1]="홍길동";
		seat[0][0]="김유신";
		
		//좌석 정보 보여주기
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___")? "좌석예매" : "예약완료");
			}
			System.out.println();
		}
		
		//좌석 예매하기
		int row, col;
		row=1;	//예약할 좌석의 행
		col=0;		//예약할 죄석의 열
		if(seat[row][col].equals("___")) {
			System.out.println("예약 가능 좌석입니다.");
		}else {
			System.out.println("이미 예약 되었습니다.");
		}
		//좌석 초기화
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				seat[i][j] = "___";
			}
		}
	}
		
	//위에는 요구사항 설계도
	//class Cinema{속성, 기능}

}
