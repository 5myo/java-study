import kr.or.bit.AirPlane;

public class Ex07_Static_AirPlane {

	public static void main(String[] args) {
		// AirPlane air  = new AirPlane();
				
		AirPlane air = new AirPlane(707, "대한항공");
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(808, "아시아나");
		air2.airPlaneTotalCount();
		
		AirPlane air3 = new AirPlane(909, "부산항공");
		air3.airPlaneTotalCount();
		
		
	}

}
