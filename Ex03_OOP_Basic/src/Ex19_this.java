/*
this
1. 객체 자신을 가르키는 this (앞으로 생성될 주소를 담을 곳이라고 가정)
2. this 객체자신 (생성자 호출) >> 원칙 : 여러개의 생성자 호출
*/
class Test{
	int i;
	int j;
	
	Test(){  //default 
		
	}
	
	Test(int i , int j){  //Test(int k , int y)
		//위 코드는 문제가 없어요
		//그런데 가독성 ......
		//parameter  이름을   ... member field 며와 같이
		//Test(int i , int j) {}
		//>> this >> Test >> 
		this.i = i;
		this.j = j;
		  //i = i;
		  //j = j;
	}
}

class Book2{
	String bookname;
	
	Book2(String bookname){
		 this.bookname = bookname;
	}
}

//Today Point
class Socar{
	String color;
	String geartype;
	int door;
	
	Socar() {  // 기본설정
		  this.color = "red";
		  this.geartype = "auto";
		  this.door = 2;
	}
	
	Socar(String color , String geartype , int door){
			 this.color = color;
			 this.geartype = geartype;
			 this.door = door;
	}
	
	void print() {
		 System.out.println(this.color + " / " + this.geartype + " / " + this.door);
	}
}

public class Ex19_this {

	public static void main(String[] args) {
		  Test t = new Test(10,20);
		  System.out.println(t.i  + " ," + t.j);
		  
		  Book2 book = new Book2("홍길동전");
		  
		  Socar socar = new Socar();
		  socar.print();
		  
		  Socar socar2 = new Socar("gold", "auto", 5);
		  socar2.print();

	}

}






