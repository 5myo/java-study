
public class CinemaMain {
	public static void main(String[] args) {
		
		Cinema cinema = new Cinema();
		String[][] seatNo = cinema.makeSeat();
		cinema.showReservationStatus(seatNo);
		
		String[] userSeat = cinema.selectSeat();
		
		//예매
		System.out.println("--- 예매를 시작합니다 ---");
		cinema.booking(userSeat);
		//예매 상태 확인
		System.out.println("--- 예매 후 ---");
		cinema.showReservationStatus(seatNo);
		System.out.println();
		
		//예매번호 생성
		String bookNo = cinema.reservationNo(userSeat);
		System.out.println("예매번호 확인: " + bookNo);
		//예매 취소  
		System.out.println("--- 예매를 취소합니다 ---");
		cinema.cancleSeat(bookNo);
		//예매 상태 확인
		System.out.println("--- 취소 후 ---");
		cinema.showReservationStatus(seatNo);
		System.out.println();
		
		//모든 좌석 초기화
		System.out.println("--- 모든 좌석 초기화 ---");
		cinema.initSeat();
		//예매 상태 확인
		cinema.showReservationStatus(seatNo);
		System.out.println();
	}
}