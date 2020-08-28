package aaa;

import java.lang.Character.Subset;
import java.util.StringTokenizer;

public class Ex06_String_Function {

	public static void main(String[] args) {
		String str = "hello";
		String concatstr = str.concat("world");	//concat은 기존의 문자열에 합치는 것
		System.out.println(concatstr);
		
		boolean bo = str.contains("elle");	//contains은 그 문자열 중에서 내가 입력한 문자열이 있는 지를 묻는 것
		System.out.println(bo);
		
		String str2 = "a b c d"; //[a][][b][][c][][d]
		System.out.println(str2.length()); //7 //공백도 문자열에 포함됨 
		
		String filename = "hello java world";	//[h][e][l][l]
		System.out.println(filename.indexOf("h"));		//filename의 배열(방) 번호
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망"));	//-1	
		//신문 사설 검색, 폭망이라는 단어가 있는 지
		//indexOf는 내가 원하는 문자열이 포함되어 있는지를 물을 때 쓴다, 0보다  큰 값이 1개는 포함되어 있는지?
		if(filename.indexOf("wo")!= -1) {
			System.out.println("wo를 하나라도 가지고 있네요");
		}
		
		System.out.println(filename.lastIndexOf("a"));	//끝에서 처음 만나는 a에 관한 index를 출력해라
		
		//length(), indexOf(), substring(), replaca(), split()
		
		String result="superman";//[s][u][p][e][r][m][a][n]
		System.out.println(result.substring(0));
		System.out.println(result.substring(1,2));	//자기자신 //u ebdindex - 1
		System.out.println(result.substring(0,0));	//(0,1) 안나와요
		System.out.println(result.substring(0,1));	//s
		System.out.println(result.substring(1,1));	
		System.out.println(result.substring(2,3));	
		//endindex-1 ^^ java에만 해당
		
		//Quiz
		String filename2="aaa.zip"; //또는 hong.png 또는 h.jpeg
		//여기서 파일명과 확장자를 분리해서 출력하세요
		//1.파일명 >> aaa
		//2.확장자 >> zip
		//위에서 배운 함수만 가지고 문제를 푸세요
		//기준
		int position=filename2.indexOf(".");
		String file = filename2.substring(0, position);
		
		String extention = filename2.substring(++position);
		
		System.out.println(filename2.substring(0));
		System.out.println(filename2.substring(0,3));
		System.out.println(filename2.substring(4,7));
		
		//replacs(치환함수)
		String str3="ABCDADDDDDDA";
		String result3=str3.replace("DDDDD", "오늘은 목요일");
		System.out.println(result3);
		
		result3=str3.replace("A","a");
		System.out.println(result3);
		
		//ETC
		System.out.println(str3.charAt(0));	//0번째에 있는 캐릭터 값을 뽑아라
		System.out.println(str3.charAt(3));
		System.out.println(str3.endsWith("DDDA"));	//true
		System.out.println(str3.endsWith("BDDDA"));	//false
		System.out.println(str3.equalsIgnoreCase("abcdADDDDDA"));	//대소문자 구별없이 비교
		
		//Today Point(Split)
//		String str4 = "슈퍼맨, 팬티, 노랑색, 우하하, 우하하";
//		String[] namearray = str4.split(",");
//		for(String s : namearray) {
//			System.out.println(s);
			
		String str4 = "슈퍼맨. 팬티. 노랑색. 우하하. 우하하";
		String[] namearray = str4.split("\\.");
		for(String s : namearray) {
			System.out.println(s);
		}
		/*
		 . >> 정규 표현식 문법 >> 문자 그대로 사용할 땐 \\.을 입력 
		 
		 정규 표현식 표준(javascript, Oracle, c#)공통적인 규칙
		 어떠한 문자를 만들 때 [규칙] 부여	>> 유효한 판단 근거
		 
		 주민번호 : 숫자 6자리 - 숫자 7자리	{\d6}-{\d7}규칙에
		 12345-1234567	>>	false		>> \d6을 입력했는데 다섯자리 수를 입력해서
		 핸드폰 번호
		 차량번호
		 우편번호
		 도메인주소
		 이메일주소 등 검증 정규 표현식 개발자
		 
		 (정규표현 테스트 사이트)
		 https://regexper.com/
		 https://regexr.com/
		 조별과제 ^^... 단 해석은 본인이 해오기(주석 및 설명 달아서 올리기)
		 */
		
		String fliename3="bit.hwp";
		//split 사용해서 파일명과 확장자 출력
		String[] namearray2 = fliename3.split("\\.");		//split
		for(String s : namearray2) {
			System.out.println(s);
		}
		String str5="a/b,c-d.f";
		StringTokenizer sto = new StringTokenizer(str5, "/,-.");	//Toksnizer
		while(sto.hasMoreElements()) {
			System.out.println(sto.nextToken());
		}
		
		 //넌센스
		 String str6 = "홍           길        동";
		 //저장 >> 공백제거 >> "홍길동"
		System.out.println(str6.replace(" ",""));
		
		String str7 = "        홍길동           ";
		 System.out.println(">" + str7 + "<");
		 //공백제거 "홍길동"
		 System.out.println(">" + str7.trim() + "<");
		 
		String str8 = "        홍       길        동           ";
		   //"홍길동"
		String result5 = str8.trim();
		String result6 = result5.replace(" ","");
	
		System.out.println(result6);  //무식한 인간 ...
		
		//***********여러개의 함수를 적용 ( method chain 기법)
	  System.out.println(	str8.trim().replace(" ","").substring(2));
	  
	  //문제 1
	   int sum=0;
	   String[] numarr = {"1","2","3","4","5"};
	   //문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
	   for(String s : numarr) {
		   sum+=Integer.parseInt(s);
	   }
	   System.out.println("sum : " + sum);
	   
	 //문제 2
	   String jumin="123456-1234567";
	   //위 주민번호의 합을 구하세요_1
	   int sum2=0;
	   for(int i = 0 ; i < jumin.length() ; i++) {
		   String numstr =jumin.substring(i, i+1);
		   if(numstr.equals("-")) continue;
		   sum2+= Integer.parseInt(numstr);
	   } 
	   System.out.println("주민번호 합:" + sum2);
	   
	 //위 주민번호의 합을 구하세요_2
	 //String jumin="123456-1234567";
	   String[] numarr2 = jumin.replace("-","").split("");
	   int sum3=0;
	   for(String i : numarr2) {
		   sum3+= Integer.parseInt(i);
	   }
	   System.out.println("주민번호 합2:" + sum3);
	   
	 //위 주민번호의 합을 구하세요_3
	   String jumin4 = jumin.replace("-", "");
	   int sum4=0;
	   for(int i = 0 ; i < jumin4.length() ;i++) {
		   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
	   }
	   System.out.println("주민번호 합4:" + sum4);		
	}
}
