import java.util.Scanner;

public class Ex11_Quiz {

	public static void main(String[] args) {
		//알파벳(A~Z) 까지 출력하는 프로그램을 작성하세요
				//(for 문을 사용하세요) 
				for (char i = 'A'; i <= 'Z'; i++) {
			            System.out.print(i);
			      }
				 System.out.println();
				 
				 for(char i = 65 ; i <= 90 ; i++) {
			              System.out.print(i);
			     }
				 System.out.println(); 
				 
				 for(int i = 65 ; i <= 90 ; i++) {
		             System.out.print((char)i);
				 }
				 System.out.println(); 
				 
				 //1~100까지 10행 10열로 출력하는 프로그램을 작성하세요
				 //(for문을 사용하세요)
				 for (int i = 1; i <= 100; i++) {
					    System.out.printf("%d\t", i);
			            if (i % 10 == 0) {
			                System.out.println();
			            }
			        }
				 
				//1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
				 int sum = 0;
			        for(int i = 1; i <= 20; i++) {
			            if(i % 2 != 0 && i % 3 != 0) {
			            	System.out.println("i : " + i);
			                sum += i;
			            }
			            
			        }
			        
			        System.out.println("sum : " + sum);
				//두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요  
			       int count = 0;
			        for(int i= 1; i <= 6; i++) {
			            for(int j=1; j<=6; j++) {
			                if (i + j == 6) {
			                	count++;
			                    System.out.printf("[%d]+[%d]= [%d]\n",i, j, i+j);
			                }
			            }
			        }
			        System.out.println("count : " +count);
		
			        
		double random = Math.random();
		System.out.println(random); // 0<= random < 1
		random = (3*random+1); //1 <= random < 4;
		System.out.println((int)random);
		/*
		 가위 (1) , 바위(2) , 보 (3)
		 if(사용자 == 컴퓨터 ){
		 	
		 }else if((사용자 == 1) && (컴퓨터 == 2)){
		 		가위  -  바위    컴승
		 }else if((사용자 == 1) && (컴퓨터 == 3)){
		        가위   -  보       사승
		 }else if((사용자 == 2) && (컴퓨터 == 1)){
		        바위   -  가위  사승
		 }else if((사용자 == 2) && (컴퓨터 == 3)){
		        바위  -  보      컴승
		 }else if((사용자 == 3) && (컴퓨터 == 1)){
		        보  -  가위      컴승
		 }else if((사용자 == 3) && (컴퓨터 == 2)){
		        보  - 바위       사용 
		 }else{
		 
		 }
		 */
		
	/*
	  1부터 20까지의  정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하는 프로그램을 작성하세요
	  
	  두개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하세요
	  
	  가위 , 바위 ,보 게임 또 제어문을 통해서 작성하세요 (IF)
      예를 들명)
      컴퓨터가 자동으로 나온 가위 , 바위 , 보 에 대해서 사용자가 값을 입력 해서 처리 하세요
      ( 예를 들면 : 가위=> 1   , 바위 => 2  , 보 => 3)
	 */
		
			        
		boolean auto = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(auto) {
			System.out.println("**********************");
			System.out.println("1. 예금  |  2. 출금  |  3. 잔고  |  4. 종료");
			System.out.println("**********************");
			
			System.out.println("선택");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
				case 1: 
							System.out.println("예금 :");
							balance +=  Integer.parseInt(sc.nextLine());
							break;
				case 2:
							System.out.println("출금 :");
							balance -=  Integer.parseInt(sc.nextLine());
							break;
				case 3:
							System.out.println("잔고 : " + balance);
							break;
				case 4:
							System.out.println("종료합니다");
							auto = false;
							break;
				default: System.out.println("올바른 메뉴를 선택하세요");
					
			}
			
		}
	}
}
