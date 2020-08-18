package kr.or.bit;
//class == 설계도 == 데이터 타입
//설계도는 구체화(메모리) 를 통해서 객체 생성
//구체화된 것 : 객체 , 인스턴스

//설계도 : 필드(고유 , 상태 , 부품)  + 함수 ... + 생성자
// 속성 + 기능 
public class Person {
	
	public String name;      //기본값 :  null
	public int age;               //정수 : 0
	public boolean power;  //false 
	

	//member field  >> instance variable
	//초기화 하지 않아도 된다 >> default  가진다 >> 초기화(변수가 처음으로 값을 할당 받는 것)
	//의미 : 초기화 ...... public String name="김유신";  하지 않는 이유
	//[ 생성되는 객체 (사람) 마다 ] [ 다른 이름을 가지기 때문에 ]
	//Person p = new Person();    p.name = "아무개";   p.age  출력 >> 0 
	//Person p2 = new Person();   p2.name = "김유신"
	
	//기능(행위) >>  method 
	 public void personPrint() {
		 System.out.println("name : " + name + " age : " + age + " power : "  + power);
	 }
}













