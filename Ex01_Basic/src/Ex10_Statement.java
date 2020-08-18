import java.util.Scanner;

public class Ex10_Statement {

	public static void main(String[] args) {
		 //반복문 (while , do ~ while)
		int i = 10;
		while( i >= 10) {
			//System.out.println("i : " + i);
			 i--; //반드시 증가감 논리 필요하다 
			 System.out.println("i : " + i);
		}

		//while 1~100까지의 합
		int sum=0;
		int j = 1;
		while(j <= 100) {
			
			 // j++;  //sum : 5150  주의 사항
			 sum+=j; //sum = sum + j
			 j++;   //sum : 5050
		}
		System.out.println("sum : " + sum); 
		
		//while  구구단 출력하세요
		//while(){ while(){} }
		int k = 2;
		int p =1;
		while(k <= 9) {
			    //두번째 >> p= 10
			    p = 1;
				while(p <= 9) {
					System.out.printf("[%d]*[%d]=[%d]\t",k,p,k*p);
					p++;
			}
			System.out.println();	
			k++;	
		}
		System.out.println("***********************************");
		
		int k1 = 2;
		while(k1 <= 9) {
				int p1 =1;
				while(p1 <= 9) {
					System.out.printf("[%d]*[%d]=[%d]\t",k1,p1,k1*p1);
					p1++;
			}
			System.out.println();	
			k1++;	
		}
	
	   //while(true) {  if(true) break;}	
	   //do ~while : 강제적 수행 ..... 무조건 한번은 실행 되게 하겠다
		//do {  실행문 } while(조건)
		//메뉴 구성
		//1. 인사
		//2. 회계 
		//선택 
		//당신이 원하는 업무를 선택하세요  >> do {  선택하세요 .. 값을 받아서 }
		//입력값 : 3  >> while(조건식)  에서 판단
		
		Scanner sc = new Scanner(System.in);
		int inputdata =0;
		do {
				System.out.println("숫자 입력해(0~9)");
				inputdata = Integer.parseInt(sc.nextLine());
		}while(inputdata >= 10); //조건이 true do 문을 계속 실행 ...
		                                          //조건이  false 일때 탈출
		System.out.println("당신이 입력한 숫자는 : " + inputdata);
		
	}
}








