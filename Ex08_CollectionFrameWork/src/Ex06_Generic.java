import java.util.ArrayList;

/*
 	Today Point
 	Generic jdk 1.5
 	c#, java 필수 기능
 	
 	Collection 클래스 >> 데이터 기본 저장 공간 : Object
 	1. Object 타입 저항 >> 타입 문제 >> 타입 강제(객체 생성 타입) >> 제너릭
 	2. 타입의 안정성(타입 강제)
 	3. 강제 형변환(casting) : (Car)object (x)
 	
 	시점 : 클래스 설계시에 제너릭 적용 코드
 */
class MyGen<T>{ //type parameter
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	T get() {
		return this.obj;
	}
}
class Person extends Object {
	int age = 100;
}
public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		//저장공간의 타입 : Object[] elements
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		//출력
		//개선된 for문
		for(Object obj:list) {
			//person 객체는 나이를 출력하고 나머지는 값을 출력
			//System.out.println(obj);
			//객체인 것과 아닌 것
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
		}
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		for(Person p:plist) {
			System.out.println(p.age);
		}
	}

}
