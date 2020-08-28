/*
 실무 (개발환경)
 1개의 클래스...거의...(x)
 
 설계도 1개...업무가 복잡...여러개
 쇼핑물>>주문관리, 회원관리, 배송, 상품>>각각의 업무>>설계도
 
 ***기준***
 여러개의 설계도의 관계 맺어주는 것
 
 1. 상속(is ~ a : 상속)은 ~이다 (부모를 뒤에)
 2. 포함(has ~a : 포함)은 ~을 가지고 있다
 
 예)
 원은 도형이다
 원		도형	//도형이 더 크기 때문에 도형은 추상화
 >>원 extends 도형
 
 원 	점 관계
 원은 점이다(x)
 원은 점을 가지고 있다(o)
 has ~ a
 >>class 원{한점}
 
 경찰		권총
 >>경찰은 권총이다(x)
 >>경찰은 권총을 가지고 있다(o)
 class 경찰	{권총}
 
 예) 원, 삼각형, 사각현 만드는 설계도
 
 원은 도형이다
 삼각형은 도형이다
 사각형은 도형이다
 
 도형 : 추상화, 일반화(그리다, 색상)>>공통자원
 원 : 구체화, 특수화 (반지름, 한점 >> 본인만이 가지는 특징)
 
 점 : 좌표값 >> (x, y)
 원은 점을 가지고 있다
 삼각형은 점을 가지고 있다
 사각형은 점을 가지고 있다
 
 class Schape{그리다, 색상}	>> 	상속관계(부모)
 class Point {조표값}	>> 포함 (부품)
 
 구체화, 특수화 : circld, triangle 
 */

//추상화, 일반화, 공통
class Shape{
	String color="gold";	//공통
	void draw() {
		System.out.println("도형을 그리다");
	}
}
class Point{
		int x;
		int y;
		Point(){
//		this.x=1;
//		this.y=1;
			this(1,1);
		}
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
}
//원을 만드세요(원의 정의 : 원은 한점과 반지름을  가지고 있다)
//1.원은 도형이다 (is ~ a) : 도형(shape)
//2.원은 점을 가지고 있다 (has ~ a):점(Point)>>member field
//3.원은 반지름을 가지고 있다(특수성):r
//원의 반지름은 초기값 10을 가진다
//점의 좌표는 초기값 (10,15) 가진다
//기본(초기값) 설정하지 않으면 반지름과 점의 값을 입력받을 수 있다(원이 만들어 질때)

class Circle extends Shape{	//member field	//extends //crecle이 shape이 가지고 있는 메소드를 전부 가지고 있음
	Point point;	//포함	//멤버필드 선언
	int r;		//특수성
	
	Circle() {		//생성자 선언	//생성자의 이름이 같고 매개변수가 다른 것을 오버로딩
//	this.r=10;
//	this.point = new Point(10,15);
		this(10,new Point(10,15));	//this는 Circle를 가리킴	//this에 10, Point (10,15)을 대입(할당)한 것을 대입(할당)
	}
	Circle(int r, Point point){	//매개변수,파라미터
		this.r=r;	//int r에 10을 대입		//객체에 circle를 생성한다면 반지름 r의 값을 받아라
		this.point=point;		//point에 (10,15) 대입
	}
}
//------------------------------------------------------------------------
//원 만드는 것을 이해하하셨다면 아래 문제를
//문제2)
//삼각형 클래스를 만드세요
//정의) 삼각형은 3개의 점과 색과 그리고 그리다라는 기능을 가지고 있다
//Shape, point 제공 받아요
//hint) (x,y) (x,y) (x,y) 3개의 좌표값
//default로 그릴 수 있고, 3개의 좌표값을 받아서 그릴 수 있다

//삼각형 클래스 만든다.
//Shape, Point 상속한다.
class Triangle extends Shape{
	Point x;	//멤버필드에 포인트라는 데이터타입을 가지는 변수 x를 선언(공간만 있음)
	Point y;
	Point z;
	
	//삼각형 3개에 좌표값을 준다.
	Triangle() {	//Triangle 생성자 함수 //생성자는 멤버필드 변수들에게 초기값을 할당해주는 역할
		this(new Point(10,20), new Point(30,40), new Point(50,60));	//this. ->인스턴스 변수들을 가르킬 때 this() ->다른 생성자를 호출하고 싶을 때, 파라미터의 값에 따라 호출되는  생성자 함수가 다르다.
	}
	Triangle(Point point1, Point point2, Point point3) {	//파라미터 안에 있는 주소값
		this.x=point1;		//주소값		//this는 멤버필드의 변수를 가르킨다.
		this.y=point2;
		this.z=point3;
	}
	//class Triangle2 extends Shape{
		//Point[] pointarray;
		/*
		Triangle2(){
			pointarray = new Point[3];
			pointarray[0] = new Point(10,20);
			pointarray[1] = new Point(30,40);
			pointarray[2] = new Point(50,60);
		}*/
//		this(new Point[] {new Point(10,20),new Point(30,40),new Point(50,60)});
//		Triangle2(Point[] pointarray){
//			this.pointarray = pointarray;
//		} 
	}
//}
public class Ex02_Inherit_Composition {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("반지름 : " + circle.r);
		System.out.println("부모 : " + circle.color);
		System.out.println("좌표 : " + circle.point.x);
		System.out.println("좌표 : " + circle.point.y);
		circle.draw();//부모
		
		Circle circle2 = new Circle(20, new Point(10,20));
		System.out.println("반지름 : " + circle2.r);
		System.out.println("부모 : " + circle2.color);
		System.out.println("좌표 : " + circle2.point.x);
		System.out.println("좌표 : " + circle2.point.y);
		circle2.draw();//부모
		
		Triangle triangle = new Triangle();	//파라미터 값을 설정하지 않은 생성자가 있어서 파라미터 값을 설정해 주지 않아도 된다.
		System.out.printf("x : (%d)\t", triangle.color);	
	}
}
