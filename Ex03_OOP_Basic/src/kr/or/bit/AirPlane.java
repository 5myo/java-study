package kr.or.bit;
/*
우리 회사는 비행기를 주문 제작 판매 하는 회사입니다
우리 회사는 비행기를 생산하는 설계도를 작성 하려고 합니다
요구사항
1.비행기를 생산하고 비행기의 이름과 번호를 부여해야 합니다
2.비행기가 생산되면 비행기의 이름과 번호 맞게 부여되었는 확인 하는 작업이 필요합니다 (출력정보 확인)
3.공장장은 현재까지 만들어진 비행기의 총대수 (누적)을 확인 할 수 있습니다

AirPlane air = new AirPlane();
AirPlane air2 = new AirPlane();
AirPlane air3 = new AirPlane();

*/
/*
이제 생성자를 배웠으니  .....
비행기를 만들때 강제로 비행기의 번호 , 비행기의 이름을 입력하여 비행기가 만들어 지도록 코드를 바꾸세요
*/
public class AirPlane {
	private int airnum;
	private String airname;
	private static int airtotalcount; //모든 객체가 공유하는 공유자원

	//public AirPlane() {	}   default
	public AirPlane(int airnum , String airname) {	
		this.airnum = airnum;
		this.airname = airname;
		//강제
		airtotalcount++;
		System.out.printf("번호:[%d] , 이름:[%s]\n",this.airnum,this.airname);
	} 
	
	/*
	public void makeAirPlane(int num , String name) {
		airnum = num;
		airname = name;
		//강제
		airtotalcount++;
		System.out.printf("번호:[%d] , 이름:[%s]\n",airnum,airname);
		
	}
	*/
	
	public void airPlaneTotalCount() {
		System.out.printf("총 비행기 제작 대 수 :[%d]\n",airtotalcount);
	}
	
}
// 80점
//배우지 않고 코드 ... 변경  >> 100  >> 생성자 , this


