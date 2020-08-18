import kr.or.bit.BodyInfo;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

class Test{
	int i;
	void print() {
		
	}
}


//import kr.or.bit.*;    ( x )
//bit  상자안에 있는 모든 자원  사용하세요
// 가독성 ..문제 .. 
public class Ex01_Ref_Type {
	public static void main(String[] args) {
		
		//값타입  (8가지)
		//참조타입 (Class , Array ....)
		
		Person p2; //선언  stack  이라는 영역에 공간만 확보 (공간의 크기 : 4byte)
		p2 = new Person(); // p2 라는 변수에 Person  객체의 주소가 할당
		System.out.println(p2); //kr.or.bit.Person@15db9742
		
		Person p3=null;  // main  함수안에 있는   local variable  ... 초기화 해야 사용가능
		                             //참조변수의 초기화 null 로한다 >>  값이 없다 , 메모리를 가지고 있지 않다
		System.out.println(p3);
		
		
		//참조변수가 메모리를 가지는 방법
		//1.  new      >> p3 = new Person();
		//2. 주소값을 할당  p3= p2;
		p3 = p2;
		
		
		Person person = new Person();
			person.name = "홍길동";
			person.age = 100;
			person.power = true;
		    person.personPrint();
		    
	    Person  p  = new Person(); 	    
	    p.personPrint();
	    
	    //주소값 비교  (검증하기)
	    System.out.println(person == p); //비교 (변수가 가지고 있는 값)
	    System.out.println(p2 == p3); //true
	    
	    int i =100;
	    i = 300;
	    System.out.println("i : " + i);
	    
	    //Tv 생산
	    //Tv  이름 : 비트
	    //Tv 한대 만들고 채널 5까지 올리고 
	    //Tv 정보 출력
	    
	    Tv btv = new Tv();
	    btv.brandname = "비트";
	    System.out.println("현재  비트  TV 채널 정보 : " + btv.ch);
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    btv.ch_Up();
	    
	    btv.tvInfor();
	    
	    // 사원 1명을 생성
	    //사원은  사번 7788 , 이름 김유신 , 부서 IT  
	    //그리고  신체정보의 키는 190  몸무게 40
	    
	    Emp emp = new Emp();
	    emp.empno = 7788;
	    emp.name = "김유신";
	    emp.job = "IT";
	    
	    emp.bodyinfo = new BodyInfo();
	    emp.bodyinfo.height = 190;
	    emp.bodyinfo.weight = 40;
	    /*
	    BodyInfo body = new BodyInfo();
	    body.height = 190;
	    body.weight = 40;
	    
	    emp.bodyinfo = body;
	    */
	    System.out.println(emp + " / " + emp.bodyinfo);
	    System.out.println(emp.empno + " / " + emp.bodyinfo.height);
	    System.out.println(emp.name + " / " + emp.bodyinfo.weight);
	}

}







