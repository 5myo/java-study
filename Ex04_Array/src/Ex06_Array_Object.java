import kr.or.bit.Emp;

public class Ex06_Array_Object {

	public static void main(String[] args) {
		//1. 사원 3명을 만드세요 (단 배열을 사용하세요)
		//1000,  홍길동
		//2000, 김유신
		//3000, 유관순
		//만들고 각각의 사번과 이름을 출력하세요
		
		 Emp[] emplist = new Emp[3];
		 
		 emplist[0] = new Emp();
		 emplist[0].setEmpno(1000);
		 emplist[0].setName("홍길동");
		 
		 emplist[1] = new Emp();
		 emplist[1].setEmpno(2000);
		 emplist[1].setName("김유신");
		 
		 emplist[2] = new Emp();
		 emplist[2].setEmpno(1000);
		 emplist[2].setName("유관순");
		 
		 for(int i = 0 ; i < emplist.length ; i++) {
			 emplist[i].empInfoPrint();
		 }
		 
		 //2 
		 Emp[] emplist2 = new Emp[] {new Emp(1,"이씨"), new Emp(2,"박씨")};
		 for(int i = 0 ; i < emplist2.length ; i++) {
			 emplist2[i].empInfoPrint();
		 }
		 
		//3  사용빈도 ...^^
		 Emp[] emplist3 = {new Emp(3,"김씨"), new Emp(4,"홍씨")};
		 for(int i = 0 ; i < emplist3.length ; i++) {
			 emplist3[i].empInfoPrint();
		 }
		 
		 Emp[] emplist4 = {new Emp(1000, "홍길동"), new Emp(2000, "김유신"), new Emp(1000, "유관순")};
		 for(int i=0; i<emplist4.length; i++) {
			 emplist4[i].empInfoPrint();
		 }
		 //그럼 개선된  for 문을 배웠으니 ..... 객체 배열 출력도 .....  개선된  for문 사용해 보세요
		 //^^	
		for(Emp e : emplist3) {
			e.empInfoPrint();
		}	 
	}
}






