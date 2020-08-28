package Pizza_Store;

import java.util.Scanner;

/*
요구사항

1. 피자는 도우, 토핑1, 토핑2 + 사이드메뉴로 구성되어 있습니다.
2. 고객님들이 선택한 정보를 확인할 수 있게 만들어주세요.

ex) 1. 도우선택(3개) (쌀, 밀, 씬) 중 택 1 /// ex)쌀 
>이후에 무조건 2번으로 넘어감 
>2. 토핑(4개) (베이컨, 치킨, 불고기, 스테이크) 중 택 1 ///ex)베이컨
>이후에 무조건 3번으로 넘어감
>3. 2번에서 선택한 토핑 제외하고 나머지 중 택 1 //ex)치킨
>4. 사이드(3개) 제로콜라, 버팔로윙, 스파게티 중 택 1 ///ex)제로콜라
​
결과예시)
 : 주문하신 '베이컨 치킨 피자(도우: 쌀)'와 '제로콜라' 나왔습니다. 
 */
class Dough{
	String rice;
	String wheat;
	String thin;
}
class Topping{
	String bacon;
	String chicken;
	String bulgogi;
	String steak;
}
class side{
	String zeroCoke;
	String buffaloWing;
	String spaghetti;
}
public class Pizza {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반갑습니다 피자 가게입니다.\n"+"앞에 놓여 있는 도우들 중 하나를 골라주세요.");
		String age = scan.nextLine();	//문자형만 받는 메소드
		
		System.out.printf("도우는 %s로 할게요",age);
	}
}
