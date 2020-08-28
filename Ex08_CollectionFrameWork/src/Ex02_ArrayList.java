import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Today Point
public class Ex02_ArrayList {
	public static void main(String[] args) {
		//List 인터페이스 구현...순서가 있고, 중복(허용)을 허용하는 데이터의 집합
		
		ArrayList arraylist = new ArrayList();
		//Object 타입을 가지는 정적 배열 heap 생성
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i=0; i< arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println(arraylist.toString());	//순서대로 부르고 싶을 때
		System.out.println(arraylist.get(0));	//특정 값을 알고 싶을 때
		
		//add 순차적으로 데이터 넣기
		arraylist.add(0, 111);		//0번째 방에 111을 할당 //기존에 있던 100,200,300 하나씩 밀려서 **자리이동**
		System.out.println(arraylist);
		arraylist.add(4,444);
		System.out.println(arraylist);
		//**비순차적인 데이터를 추가하거나 삭제하는 작업은 arrylist에게는 적합하지 않다 >> 순서가 있는(순차적인) 데이터의 집합에 적합
		
//		arraylist.remove(200);	//ex..index 문제 발생
		System.out.println(arraylist);
		
		//[111, 100, 200, 300, 444]
		//ArrayList 함수를 공부(초급)
		System.out.println(arraylist.contains(200));	//contains는 해당 클래스 안에 ()가 있는지 확인 할 때 사
		
		arraylist.clear(); //데이터 삭제(공간은 남아있다)
		System.out.println(arraylist.size()); //size 데이터의 크기
		System.out.println(arraylist.isEmpty()); //true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //아니 데이터 있어 //true
		
		System.out.println("삭제 전 : " + arraylist.size());
		Object value = arraylist.remove(0); //0번째 방의 값을 삭제, 그 값을 return
		System.out.println("삭제된 데이터 : " + value);
		System.out.println("삭제후 : " + arraylist.size());
		System.out.println(arraylist.toString());
		
		//POINT
		//개발자가 쓰는 코드, 일상다반사
		//다형성을 쓰면 [확장성, 유연성]을 얻을 수 있다
		ArrayList li = new ArrayList();	//부모는 자식의 주소값을 가질 수 있다(다형성)
		li.add("가");
		li.add("나");
		li.add("다");
		li.add("라");
		
		List li2 = li.subList(0, 2);	//subList 만들어 주는 데이터 순서가 있는 데이터의 집합
		System.out.println(li2.toString());
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString());
		Collections.sort(alist);	//초급자는 쓰면 안됨(중급자 이상 권장)
		System.out.println(alist.toString()); //낮은 값
																	//높은 값
		Collections.reverse(alist);
		System.out.println(alist.toString());	
	}
}
