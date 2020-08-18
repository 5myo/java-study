public class Ex10_Static_Method {
     
	public void method() {
		System.out.println("나 일반함수 야");
	}
	
	public static void smethod() {
		System.out.println("나 static 함수 야");
	}
	
	public static void main(String[] args) {
		// method()  , smethod()  호출 해서 사용
		smethod();
		Ex10_Static_Method.smethod();
		
		Ex10_Static_Method ex10 = new Ex10_Static_Method();
		ex10.method();

	}

}



