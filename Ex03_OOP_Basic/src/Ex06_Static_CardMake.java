import kr.or.bit.Card;

public class Ex06_Static_CardMake {

	public static void main(String[] args) {
		//Card 53제작 
		//메모리에 
		/*
		Card c = new Card();
		c.number =1;
		c.kind = "heart";
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind = "heart";
		c2.cardInfo();
		*/
		// 53 카드를  new 통해서 만들었어요
		// 클라이언트 .. 어 .. 크기가 잘못되었어요 ..
		//현실세계 다시 찍어야 합니다 
		//프로그램 세계 ....  h= 70    w=50
		
		//1. 한 장씩 수정한다  (10000장 10000번)
		//c.h = 70;
		//c.w = 50;
		
		//2. 설계도 변경 (기존 것 버리는 ...)
		//다시 제작
		
		Card c = new Card();
		c.number =1;
		c.kind = "heart";
		c.h= 70;
		c.w= 50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number =2;
		c2.kind = "heart";
		c2.cardInfo();
		
	

	}

}


