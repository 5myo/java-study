import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {

	public static void main(String[] args) {
		 Fclass fc = new Fclass();
		 fc.m();
		 fc.m2(100);
		 int result = fc.m3();
		 System.out.println("result : " + result);
		 
		 result = fc.m4(-1);
		 System.out.println("result : " + result);
		 
		 result = fc.sum(10, 20, 30);
		 System.out.println("result : " + result);
		 
		 fc.callSubSum();
		 
		 result =  fc.opSum(20);
		 System.out.println("result : " + result);
		 
		 result = fc.max(100, -100);
		 System.out.println("max result : " + result);
		 
		 Tv t2 =   fc.tCall();
		 
		 fc.tCall3(t2);
		 
	}

}






