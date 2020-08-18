import java.lang.annotation.Target;

class Human{
	String name;
}

class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add(Human human) {	//POINT Human 이라는 타입을 가지는 객체의 주소를 넣어라
		System.out.println(human.name);
	}
	//1. add (new human())
	//Human h = new Human(); >> add(h)
	int add(int param) {
	return param;
	}
	
	//Today Point : 배열도 타입이다.
	int[] add(int[] param) {	//배열의 주소값을 받아서 배열의 주소값을 리턴해라
		int[] target=new int[param.length];
		for(int i=0; i<target.length; i++) {
			target[i]=param[i] + 1;
			}
		return target;
	}
}

public class Ex07_Array_Function_Param {

	public static void main(String[] args) {
		OverTest ot = new OverTest();	//OverTest의 ot 참조변수 선언
		int[] source = {10,20,30,40,50};
		int[] target = ot.add(source);	//ot 참조변수가 .연산자를 이용하여 add로 이동 add에 source를 대입해준다.
		for(int value:target) {	//int value 안에 target을 하나씩 넣는다.
			System.out.println(value);
		}
	}

}
