/*
OOP (객체지향 프로그래밍)
1. 상속 (재사용성)
2. 캡슐화(은닉화) :  private  ....  setter , getter (직접할당을 막고 간접할당을 통해서  데이터 보호)
3. 다형성 : 하나의 타입으로 여러개의 객체를 가질 수 있는 것

// >> method overloading
// 하나의 이름으로 여러가지 기능을 하는 함수
//	System.out.println();  >>  println() 오버로딩을 구현하고 있는 함수
1. 오버로딩은 성능향상 (x)
2. 편하게 사용하라고 설계라 배려  (개발자)
3. 오버로딩 모르면 20개 다름 이름 만들면 되요 .....  

문법) 함수 이름은 같고  parameter  [개수] 와 [타입]을 다르게
1.  함수 이름은 같아야 한다
2. parameter  개수 또는 타입은 달라야 한다
3. return type 오버로딩의 판단 기준이 아니다
4. parameter    순서가 다름을 인정 (주의)
*/

class Human {
	 String name;
	 int age;
}

class OverTest{
	   int add(int i) {
		   return 100+ i;
	   }
	   
	   int add(int i , int j) {
		   System.out.println("오버로딩 : " + i  + ", " + j);
		   return i + j;
	   }
	   
	   String add(String s) {
		   System.out.println("오버로딩 : " + s);
		   return "hello " + s;
	   }
	   
	   String add(String s , int i) {  //parameter   순서가 다름을 인정 
		   return null;
	   }
	   
	   String add(int i , String s) {
		   return null;
	   }
	
	   void add(Human human) {  //오버로딩
		    human.name = "홍길동";
		    human.age = 100;
		    System.out.println(human.name + " , " + human.age);
	   }
	   
}


public class Ex14_Method_Overloading {
	public static void main(String[] args) {
		 OverTest ot = new OverTest();
		 int result = ot.add(100,200);
		 System.out.println(result);
		 
		 String str = ot.add("world");
		 System.out.println(str);
		 
		 Human h = new Human();
		 ot.add(h);
		 System.out.println(h.name);

	}

}






