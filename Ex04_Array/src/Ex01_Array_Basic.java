import java.util.Arrays;

/*
	배열은  객체다 (Array)
	1.  new  를 통해서
	2.  heap 메모리에 생성
	3.  고정배열(정적배열) : 배열의 크기가 한번 정해지면 변경 불가(고정)
	4. 자료구조 기본 ...

*/
public class Ex01_Array_Basic {
	public static void main(String[] args) {
		 int s , s1 , s2 , s3; //같은 타입....
		 
		 int[] score = new int[3]; //int 방 3개를 생성  ..heap  에  방이 생성 >> 방번호 (index : 첨자)
		 System.out.println(score[0]); //read
		 score[0] = 101; //write
		 score[1] = 20;
		 score[2] = 300;
		 System.out.println(score[0]);
		 
		 //방의 개수는 항상  index  값보다 1 크다  (n-1  것이 마지막  index)
		//score[3] = 50;
	   //java.lang.ArrayIndexOutOfBoundsException: 3
		
		 //Array  배열 (궁합 :  제어문)
		 for(int i = 0 ; i < 3 ; i++) {
			 System.out.printf("[%d]=%d\t",i,score[i]);
		 }
		 System.out.println();
		 
		 for(int i = 0 ; i < score.length ; i++) {  //score.length 배열의 개수 
			 System.out.printf("[%d]=%d\t",i,score[i]);
		 }
		 System.out.println();
		 //Tip Array 도와주는 클래스
		 String resultarray =   Arrays.toString(score);  //처음 하시는 분은 금기 .... 실력이 줄어요 ...
		 System.out.println(resultarray);
		 
		  Arrays.sort(score);  //처음 하시는 분은 금기 .... 실력이 줄어요 ... 
		  resultarray =  Arrays.toString(score); 
		  System.out.println(resultarray);
		  
		  //입사 시험
		  // 12 , 8 , 1  , 20   
		  //낮은 값 순으로 정렬해라 ..
		  // Arrays.sort(score);  10점
		  
		  
		  //Today point
		  //배열 생성 3가지
		  //내일 가장 늦게 들어오시는 분이 칠판에 ....
		  int[] arr = new int[5]; //기본 ... 
		  int[] arr2 = new int[] {100,200,300}; //초기값을 통해서 방이 만들어지고 초기화
		  int[] arr3 = {11,22,33,44,55};   //javascript   let cararr = [1,2,3,4,5];
		  //컴파일러가  int[] {100,200,300} 생성 ...
		  
		  //arr3 방에 있는 값을 출력
		  for(int index = 0 ; index < arr3.length ; index++) {
			  System.out.println(arr3[index]);
		  }
		  
		  //배열은 객체다 (new ... memory .. heap)
		  int[] arr4;  //선언
		   arr4 = new int[] {21,22,23,24,25}; //할당
		   System.out.println(arr4); //I@4aa298b7 주소값
		   
		   int[] arr5 = arr4; //주소값 할당
		   System.out.println(arr4 == arr5);
		   
		   //배열의 타입은 : 8가지 기본 + String
		   //***클래스 (사용자 정의 타입) >> Array  타입으로 ,,,
		   
		  String[] strarr = new String[] {"가" , "나" , "다라마"};
		   for(int i = 0 ; i < strarr.length ; i++) {
			   System.out.println(strarr[i]);
		   }
		  
		 char[] charr = new char[10]; // default 값 : 빈문자  \u0000
		 for(int i = 0 ; i < charr.length ; i++) {
			 System.out.println(">" + charr[i] + "<");
		 }
		 
		 //객체 배열
		 //Car
		 //Car[] cars = new Car[10];
	}

}








