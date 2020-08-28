import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

	public static void main(String[] args) {
		Emp emp = new Emp(100, "김유신", "군인");
		System.out.println(emp.toString());
		
		//사원 2명 Array
		Emp[] emplist = {new Emp(100, "김씨", "일반"), new Emp(200,"박씨","학생")};
		for(Emp e : emplist) {	//정적배열
			System.out.println(e.toString());
		}
		//1명 입사를 더 했어요 추가하세요(기존)
		//ArrayList
		//ArrayList 타입을 지정해 주지 않아도 사용이 가능하다
		//ArrayList는 동적배열
		//ArrayList는  가지고 있는 배열 방의 개수를 초과해서 값을 넣어도 자동적으로 x2배하여 방을 만듦(동적 배열
		
		ArrayList elist = new ArrayList();	//타입이 없는 Object
		elist.add(new Emp(1,"강","IT"));
		//new Emp를 통해서 
		
		elist.add(new Emp(2,"김","IT"));
		//1명 입사
		elist.add(new Emp(3,"OI","IT"));
		System.out.println(elist.size()); 
		//참조변수.size는 .length같이 배열의 길이를 알수 있음
		//참조변수.capacity이게 빈 방 포함 배열 방의 개수를 알려줌
		//System.out.println(elist.get(0).toString());
		for(int i=0; i<elist.size(); i++) {
			System.out.println(elist.get(i));
		}
		//toString() 사용하지 말고 사원의 사번, 이름, 직종을 출력하세요
		//일반 for문으로 getEmpno(), getEname(), hetJob() 함수를 호출 출력
		for(int i=0; i< elist.size(); i++) {
			Object obj = elist.get(i);
			//Object는 Emp 타입의 부모 타입이다
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		for(Object e : elist) {
			Emp em = (Emp)e;
		}
		//위와같은 코드는 개발자들이 싫어한다.
		//다시 다운 캐스팅 반복
		//Object 쓰지 않고도 객체
		//제너릭(객체 생성 타입 강제)
		//현업에서 만드는 코드는 90%가 제너릭 코드다.
		
		//타입<>는 이 타입만 받을 수 있다는 의미
		ArrayList<Emp> list2 = new ArrayList<Emp>();	//List는 순서가 있다, 중복을 허용한다, [배열]관리
		list2.add(new Emp(1,"A","IT"));	//new Emp 생성자를 ArrayList의 값에 추가
		//1번 방에 강, IT/2번 방에 김, IT/3번 방에 OI, IT/4번방에 A, IT를 추가
		
		for(Emp e : list2) {
			System.out.println(e.getEmpno());
		}
	}
	

}
