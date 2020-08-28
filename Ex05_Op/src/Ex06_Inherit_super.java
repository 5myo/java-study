/*
 	this : 객체 자신을 가릌는 this(this.empno, this.ename)
 	this : 생성자를 호출하는 this (this(100,"red"))
 	
 	상속 
 	부모, 자식
 	
 	super (현재 자식이 부모의 접근 주소값) : 상속관계에서의 부모 접근(super : 부모객체의 주소값)
 	
 	1.super >> 상속관계에서 부모자원 접근
 	2.super >> 상속관계에서 부모의 생성자를 호출(명시적으로)	*자주쓰이는 방법
 	
 	tip) C# >> base()
 		java >> super()
 */
class Base{
	String basename;
	Base(){
		System.out.println("기본 생성자 함수");
	}
	Base(String bassename){
		this.basename = bassename;
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("부모 method");
	}
}
class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname){
		//나도 부모 생성자 (oberloasing) 호출
		super(dname); //부모 생성자 호출
		this.dname = dname;
		System.out.println("dname : " + this.dname);
	}
	@Override
	void method() {
		System.out.println("자식 method");
	}
	//어느날 부모님 자원이 그리워요
	//유일한 방법 super 자식의 기능(함수) 안에서 사용
	void parent_method() {
		super.method();
	}
}
public class Ex06_Inherit_super {

	public static void main(String[] args) {
//		Derived d = new Derived();
//		System.out.println(d.basemain);
//		System.out.println(d.dname);
//		d.method();
//		d.parent_method();
		Derived d = new Derived("Hello"); 
	}

}
