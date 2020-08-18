import java.util.Scanner;

public class Ex07_Printf_format {
	public static void main(String[] args) {
		//System.out.println()
		//c# : Console.WriteLine()
		System.out.println(); //줄바꿈
		System.out.print("A");
		System.out.print("B");
		System.out.println("C"); 
		System.out.println("D"); 
		
		int num = 100;
		System.out.println(num);
		System.out.println("num 값은 " + num + " 입니다");
		// 형식   format
		System.out.printf("num 값은 %d 입니다",num);
		// format  형식문자
        //  %d (10 진수 형식의 정수) >> d  자리에
		// %f (실수)
		// %s (문자열)
		// %c (문자)
		// \t > tab    \n > 줄바꿈
		System.out.printf("num  값은 [%d] 입니다 그리고 [%d]  도 있어요 \n",num,12345);
		
		float f = 3.14f;
		System.out.println(f);
		System.out.printf("f  변수값 %f  입니다\n",f);
		
		//입력을 받는데   (console (cmd))  사용자가 입력한 값을 ...
		Scanner sc = new Scanner(System.in);
		//단축키
		// ctrl + shift + o  >>  import 자동 생성 
		
		System.out.println("값을 입력하세요");
		//String value = sc.nextLine();  //입력하고 엔터 칠 때까지 대기 .... 입력값을 문자열로 리턴
		//System.out.println("value : " + value);
		
		//int number = sc.nextInt();
		//System.out.println("정수값 : " + number);
		
		//float number = sc.nextFloat();
		//System.out.println("실수값 : " + number);
		
		//권장사항 :  nextInt  , nextfloat  보다는  nextLine() read 
		//Today Point
		// [문자를] ->  숫자로 ( 정수 , 실수)
		//Integer.parseInt("11") >>  정수로 변환
		//Float.parseFloat(s)    >>  실수로 변환
		
		System.out.println("숫자 입력하세요");
		int number = Integer.parseInt(sc.nextLine());
		System.out.println("정수값 : " + number);
	}

}






