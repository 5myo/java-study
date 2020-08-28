package Team_1;

import java.util.Scanner;

public class Pizza{
	
	private Scanner sc;
	private String[] dough;
	private String[] topping;
	private String[] sidemenu;
	private String[] menuconfirm;
	
	
	public Pizza(){
		sc = new Scanner(System.in);
		dough = new String[] {"쌀","밀","씬"};
		topping = new String[] {"베이컨","치킨","불고기","스테이크"};
		sidemenu = new String[] {"제로콜라","버팔로윙","스파게티"};
		menuconfirm = new String[] {"","","",""};
	}
	
	
	//기능
	public void menuStart() {
		while(true) {
			String selectnum = displayMenu();
			switch (selectnum) {
			case "1": doughSelect();
					  break;
			case "2":  
					System.out.println("프로그램 종료");
					System.exit(0);
			default:
				System.out.println("다시 입력해주세요");
			}
		}
	}
	
	private String displayMenu() {
		System.out.println("**************************");
		System.out.println("****피자메뉴 선택하기 프로그램****");
		System.out.println("1. 메뉴 선택하기");
		System.out.println();
		System.out.println("2. 프로그램 종료");
		System.out.println();
		
		String selectnum = sc.nextLine();
		return selectnum;
	}
	
	
	public void doughSelect() {
		while(menuconfirm[0].equals("")) {
			System.out.printf("도우선택 1.%s 2.%s 3.%s\n",dough[0],dough[1],dough[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3":
					System.out.println(dough[Integer.parseInt(food)-1]+"을 선택하셨습니다.");
					menuconfirm[0] = dough[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println();
		topping1Select();
	}
	
	private void topping1Select() {
		while(menuconfirm[1].equals("")) {
			System.out.printf("토핑1: 1.%s 2.%s 3.%s 4.%s\n",topping[0],topping[1],topping[2],topping[3]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": 
			case "4":	
				System.out.println(topping[Integer.parseInt(food)-1]+"을 선택하셨습니다.");
					menuconfirm[1] = topping[Integer.parseInt(food)-1];
		        	for(int i=Integer.parseInt(food);i<topping.length;i++) {
		                String temp = topping[i-1];
		                topping[i-1] = topping[i];
		                topping[i] = temp;
		        	}
					break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println();
		topping2Select();
	}
	
	private void topping2Select() {
		while(menuconfirm[2].equals("")) {
			System.out.println("토핑2: " +"1."+topping[0]+" 2."+topping[1]+" 3."+topping[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": System.out.println(topping[Integer.parseInt(food)-1]+"을 선택하셨습니다.");
					menuconfirm[2] = topping[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println();
		sideMenuSelect();
	}	
	
	private void sideMenuSelect() {
		while(menuconfirm[3].equals("")) {
			System.out.printf("사이드메뉴: 1.%s 2.%s 3.%s\n",sidemenu[0],sidemenu[1],sidemenu[2]);
			String food = sc.nextLine();
			switch(food) {
			case "1": 
			case "2": 
			case "3": System.out.println(sidemenu[Integer.parseInt(food)-1]+"을 선택하셨습니다.");
					menuconfirm[3] = sidemenu[Integer.parseInt(food)-1];
					break;
			default:
				System.out.println("다시 입력해주세요");
			}
		}
		System.out.println();
		menuInfo();
	}
	
	private void menuInfo() {
		System.out.printf("주문하신 %s %s 피자(도우: %s)와 %s 나왔습니다\n",menuconfirm[1],menuconfirm[2],menuconfirm[0],menuconfirm[3]);
		for(int i=0;i<menuconfirm.length;i++) {
			menuconfirm[i]="";
		}
		System.out.println();
	}
	
	
	
}