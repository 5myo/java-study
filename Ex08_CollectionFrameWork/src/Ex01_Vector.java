import java.util.Vector;

/*
 	Cllection Framework
 	[다수의 데이터를] 다루는 [표준화된 인터페이스]를 구현하고 있는 클래스의 집합
 	
 	Collection 인터페이스 -> List 상속 -> ArrayList(구현 : 약속을)
 								 -> Set 상속 -> HashSet, TreeSet (구현 : ...)
 	Map 인터페이스 (key, value) -> HashMap (구현)
 	
 	1. List (줄을 서시오) : 순서가 있다, 중복을 허용한다. >> 내부적으로 데이터(자료, 객체)들을 관리하는 방법 >> [배열] 관리 >> [홍길동][홍길동][홍길동]
 	
 	1.1 Vector (구버전) -> 동기화를 보장한다(멀티 스레드) -> Lock 장치(보호) -> 성능은 조금 떨어진다
 									ex) 화장실을 이용할 때는 한명씩 들어가고 프라이버시를 위해 문을 잠금다.
 	1.2 ArrayList (신버전) -> 동기화 보장(멀티 스레드) -> Lock 장치(x) 필요에 따라서 -> 성능 우선
 									ex) 한강 비빔밥 축제, 여러명이서 먹을 수 있지만 개인이 먹는 양은 일정하지 않다.
 									
 	기존 여러개의 가은 타입의 데이터관리 : Array 정적(고정)
 	- 방의 개수가 한번 정해지면(방의 크기는 변경 불가)
 	int[] arr = new int[5];
 	arr[0]=100;
 	...또는
 	갑자기 10개의 방이 필요하더라도 방을 늘릴 수(줄일 수) 없다. (유연성x)
 	int[] arr ={10,20,30};
 	
 	Array
 	1. 배열의 크기는 고정되어 있다
 		ex) Car[] cars ={new Car(), new Car()}; //방 2개
 	2. 접근 방법(index 첨자) 방번호 접근 : cars[0]...:0...n방까지 : 마지막 방의 번호는 (index) : length -1 같다
 	3. 초기 설정 불가
 	
 	Collection
 	List 구현
 	(Vector, ArrayList)
 	1. 배열의 크기를 동적으로 확장 :: 축소, 확장 가능 >> 사실은 [배열의 재할당] 이용
 	2. 순서를 유지할 수 있다(내부적으로 배열 사용 : index), 중복값을 허용한다
 	3. 데이터의 저장 공간 : Array을 사용
 	
 	Vector
 	size는 가지고 있는 배열 방의 x2를 한다.
 */

public class Ex01_Vector {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 default 용량 : " + v.capacity()); //10개방
		System.out.println("size : "+ v.size());
		v.add("AA");
		v.add("AA");
		v.add("AA");
		v.add(100);
		System.out.println("size : " + v.size());
		System.out.println(v.toString()); //[AA, AA, AA, 100] Vector toString()은 재정의 되어 있다
		//Array >> length
		//Collection >> size
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i)); //get(intdex)를 주면 값을 return 정적 arr[index]
		}
		//개선된 for
		for(Object obj : v) {	//타입이 정해져 있지 않아 가장 최상위인 Object를 사용하여 모든 타입을 다 받을 수 있게 만듬
			
			System.out.println(obj);
		}
		
		//제너릭 >> 타입을 강제 >> 추후 별도 학습
		Vector<String> v2 = new Vector<String>(); //String 담을 수 있는 그릇
		v2.add("Hello");
		v2.add("World");
		v2.add("King");
		for(String str : v2) {
			System.out.println(str);
		}
		
		Vector v3 = new Vector();
		System.out.println(v3.capacity()); //10개
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A"); //
		v3.add("A"); //11번째 //방을 늘린다
		
		System.out.println(v3.capacity()); //10개
		System.out.println(v3.size());
	}

}
