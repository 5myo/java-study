/*
원칙 : 생성자는 객체 생성시 1개만 호출 ( Car()  or   Car(10,20)  or ....)
this 객체 주소 

아래 코드를 보시고 마음에 안드시는 부분이 있으면 이야기 .....
  this.color = "red";  코드하고 this.color = color; 같은 코드 .....반복...  개발자 코드 ...
  해결 : 생성자 배우지 않으면 불가   ... this 불가
  
*/
class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar() {  // 기본설정
		  //this

		
		  this("red","auto",2);  //나를 다시 호출하네
		  System.out.println("default constructor");
	}
	
	Zcar(String color , String geartype , int door){
			 this.color = color;
			 this.geartype = geartype;
			 this.door = door;
		  System.out.println("overloading constructor");
	}
	
	void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}
//////////////////////////////////////////////
class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2() {
		this("red",1);
		System.out.println("default constructor");
		
	}
	
   Zcar2(String color , int door){
	    this(color,door,"auto");
	   System.out.println("overloading constructor param2개");
   }
   
   Zcar2(String color , int door, String geartype){
	     this.color = color;
		 this.geartype = geartype;
		 this.door = door;
	   System.out.println("overloading constructor param3개");
   }
   
   void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}



//////////////////////////////////////////////

public class Ex20_this {
	public static void main(String[] args) {
		 Zcar zcar = new Zcar();
		 zcar.print();
		 
		 Zcar zcar2 = new Zcar("gold","auto",10);
		 zcar2.print();

		 Zcar2 zcar3 = new Zcar2();
		 zcar3.print();
		 
	}

}
