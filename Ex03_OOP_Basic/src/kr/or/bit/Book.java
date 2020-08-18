package kr.or.bit;
/*
책은 책이름을 가지고 있고 가격을 가지고 있다 
책이 출판되면 반드시 책이름과 책의 가격을 가지고 있어야 한다
책의 이름과 가격 정보는 특정 기능을 통해서만 볼수 있고 , 출판된 이후에서 수정할 수 없다  
책이름과 가격정보는 각각확인 할 수 있다.
*/
public class Book {
	private String bname;
	private int price;
	//Default 사용 강제 구현
	//public Book(){}	
	public Book(String name , int money){
		//this.bname = bname;
		//this.price = price;
		bname = name;
		price = money;
	}
	public String getBname() {
		return bname;
	}
	public int getPrice() {
		return price;
	}
	
	public void bookInfo() {
		System.out.println("책정보 :" + bname + "/" + price);
	}
	/*
	public void makeBook(String name , int money) {
		bname = name;
		price = money;
	}
	*/

	
}
