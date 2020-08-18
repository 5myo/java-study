package kr.or.bit;

//사원이라는 설계도
//사원의 정보를 담고 출력하는 목적


public class Emp {
	
	  //정보를 담을 수 있는 변수 
	  //사원의 번호
	  //사원은 사번을 가지고 있다
	  //변수 > 정보(고유, 상태 , 부품) 를 담을 수 있는 공간의 이름 >>   instance variable >> member field
	  private int empno;
	 //private 캡슐화 : 자원을 보호 하겠다 
	 //직접할당을 막고 간접할당을 통해서 데이터 제어 
      //setEmpno(int empno)
	  //getEmpno() 
	  
	  
	  //사원의 이름 
	  private String ename;
	  
	  //사원의 직책
	  public String job;
	  
	 //public int num;
	  private int num;
	  // 양의정수만 .....
	  
	  public void setNum(int number) {
		 
		 if(number < 0) {
			 num = 0;
		 }else {
			 num = number;
		 }
		 
	  }
	  public int getNum() {
		
		  return num;
	  }
	
	  //함수(기능) ,  행위정보 >>  method >> setter >> write
	  public void setEmpno(int empno) {
		 this.empno = empno;
	  }
	  //함수(기능) ,  행위정보 >>  method >> getter >> read
	  public  int getEmpno() {
		  return this.empno;
	  }
	  
	  
	  //화면에 출력
	  // 기능 , 행위 >>  함수 >>   method
	  public void print() {

			  System.out.println("  사원 데이터 출력 : " + this.empno);
		
	  }
}





