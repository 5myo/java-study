/*
	 오류
	 1. 에러(error) : 네트워크 장애, 메모리, 하드웨어 >> 개발자가 코드적으로 해결 불가
	 2. 예외(exception) : 개발자의 코드의 실수에 의해 발생 >> 최종 : 코드수정 >> 일단 방어책
	 >>개발...예외가 발생하면...프로그램 강제 종료
	 3.예외처리 : 문제가 생길 수 있는 코드에 안전장치 >> 문제 발생 >> 강제 종료(x) >> 일단 진행
	 	비정상적인 종료를 막는다.
	 	
	 try{
	 	>>문제가 발생할 수 있는 코드 의심...
	 	>>문제가 예외가 발생하면...
	 }catch(Exception e){
	 	>>문제가 생기면 catch가 잡아서 문제를 파악
	 	>>처리
	 	>>1. 관리자에게 email
	 	>>2.로그파일에 문제 기록
	 	>>3. 강제로 종료는 일단 막는다
	 	>>결국 개발자가 해결
	 }finally{
	 	>>문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
	 	>>ex) db연결 해제 하기 
	 }
 */

package aaa;

public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0);	//연산	//문제가 발생...프로그램이 강제 종료 되지 않았으면...
			//문제가 발생하면
			//그 문제를 담을 수 있는 객체가 자동 생성
			//컴파일러가...문제에 맞는 객체를 new java.lang..ArithmeticException
			//발생한 문제의 정보를 ArithmeticException 전달
		}catch(Exception e){		//예외 수습...정보를 알려주는 것(문제에)
			//무슨 문제가 발생...원인은...정보를 보는 것
			e.printStackTrace();
			System.out.println("catch : " + e.getMessage());
		}
		
		System.out.println("main end");
	}
}
