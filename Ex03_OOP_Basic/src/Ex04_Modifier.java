import kr.or.bit.Car;

/*
접근자 (한정자) : modifier
public 공유 : package 구분없이 공유
private 개인 : 클래스 내부 공유자원 , 참조변수 입장에서  접근 불가(사용불가)

객체지향언어
1. 캡슐화(은닉화)
1.1 클래스 내부에 있는 자원 (member field , member method)  적용
     private int number;   직접할당을 막고 간접할당을 통해서 자원을 보호 >> 간접(함수 : write(setter) , read(getter))
     private void call(); 다른 함수의 보조(공통) >> 클래스 내부에서 다른 함수가 호출 해서 사용
     
     setter , getter 
     1. setter 만든다 (0) >>  private int num;    setNum();  내부(class)에서
     2. getter 만든다 (0)>>  getNum();  read  만 하겠다
     3. setter , getter  >>  write , read 
*/
public class Ex04_Modifier {
	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(10);
		car.setWindow(2);
		
		System.out.println(car.getSpeed());
		System.out.println(car.getWindow());
		
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		System.out.println(car.getSpeed());

	}

}






