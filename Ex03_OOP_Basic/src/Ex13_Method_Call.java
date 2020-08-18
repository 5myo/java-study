class Data{
	int i;
}


public class Ex13_Method_Call {
	public static void main(String[] args) {
		 Data d = new Data();  //d 의 주소값  ox12
		 d.i = 100;
		 System.out.println("d.i : " + d.i);
		 
		 scall(d);  //주소값 할당
		 
		 System.out.println("after d.i : " + d.i);
		 
		 vcall(d.i);  //111   값만 .... 
		 System.out.println("d.i : " + d.i); //111
	}
	
	static void scall(Data sdata) {  //d 의 주소값  ox12
		System.out.println("함수 : " + sdata.i);
		sdata.i = 111;
	}
	
	static void vcall(int x) {
		System.out.println("before  x : " + x);
		x = 8888;
		System.out.println("after x : " + x);
	}
	

}







