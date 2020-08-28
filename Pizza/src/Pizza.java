import java.util.Scanner;

/*
	저희는 피자를 판매하는 회사입니다.
	저희는 피자 메뉴를 선택할 수 있는 프로그램을 키오스크에 도입하려 합니다.

	요구사항
	1. 피자는 도우, 토핑1, 토핑2 + 사이드메뉴로 구성되어 있습니다.
	2. 고객님들이 선택한 정보를 확인할 수 있게 만들어주세요.
	ex) 1. 도우선택(3개) (쌀, 밀, 씬) 중 택 1 /// ex)쌀 

	>이후에 무조건 2번으로 넘어감 
	>2. 토핑(4개) (베이컨, 치킨, 불고기, 스테이크) 중 택 1 ///ex)베이컨
	>이후에 무조건 3번으로 넘어감
	>3. 2번에서 선택한 토핑 제외하고 나머지 중 택 1 //ex)치킨
	>4. 사이드(3개) 제로콜라, 버팔로윙, 스파게티 중 택 1 ///ex)제로콜라

​	결과예시)
	: 주문하신 '베이컨 치킨 피자(도우: 쌀)'와 '제로콜라' 나왔습니다. 
*/

public class Pizza {	//클래스 헤더
	private int pizza;		//멤버필드 각 타입별 변수 생성
	private int dou;
	private String[] toping;
	private Scanner scanner;	//스캐너 선언
	
	public Pizza() {	//생성자, 클래스 변수 기능 할당
		scanner = new Scanner(System.in);	
	}
	
	public void menu(String input){	
		while(true) {
			String pizzamenu = screen();
			switch(pizzamenu) {
			case "1" :
				System.out.println("파베이크 도우를 선택하셨습니다.");
				break;
			case "2" :
				System.out.println("또띠아 도우를 선택하셨습니다.");
				break;
			default :
				System.out.println("주문을 취소하셨습니다.");
			}
		}
	}
	public String screen(){
		System.out.println("어서오세요 대인기피자입니다.\n" + "앞쪽의 메뉴를 보시고 원하시는 메뉴를 주문해 주세요.");
		System.out.println();
		System.out.println("[도우선택]");
		System.out.println("1.파베이크 \n2.또띠아");
		String input = scanner.nextLine();
		return input;
	}

	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.menu(null);
	}

}
