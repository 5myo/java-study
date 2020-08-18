
/*
1.   static method :  설계자  static 함수를 만든 다는 것은  .... 많이 사용하니까 ... 편하게 쓰세요 ( 객체 생성 없이)
2.  Math m = new Math() (x)  .... >   Math.Random()


*/
class StaticClass{
	int iv;
	
	static int cv;
	
	void m() {  
		//일반함수
		//1. iv 값을 가지고 놀 수 있다
		iv = 100;
		
		//2. cv 값을 가지고 놀 수 있다 >> 생성시점
		//****** static  자원은 항상 일반자원보다  memory  먼저 생성 된다 *****
		cv = 200;
		//StaticClass.cv =200;  가능
		
	}
	
	static void sm() {
		//static  함수
		//1. 일반변수 iv 값을 가지고 놀 수 있다 (x) (생성시점)
		//iv = 100; (x)
		cv = 500;
		//error 끼리끼리 놀아라( static   끼리 놀아라)
	}
	
}

public class Ex09_Static_Method {

	public static void main(String[] args) {
		  StaticClass.sm();
		  System.out.println(StaticClass.cv);
		  
		  //일반자원 (객체)
		  StaticClass sc = new StaticClass();
		  sc.m();
		  System.out.println(sc.iv);
		  System.out.println(sc.cv);

	}

}







