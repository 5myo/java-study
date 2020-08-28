
interface Irepairable{		//~할 수 있는 (수리할 수 있는)
	
}
class Unit2{
	int hitpoint; //기본 에너지
	final int MAX_HP;	//최대 에너지
	Unit2(int hp){
		this.MAX_HP=hp;
	}
}

//지상유닛
class GroundUnit extends Unit2{
	GroundUnit(int hp){
		super(hp);
	}
}
//공중유닛
class AirUnit extends Unit2{
	AirUnit(int hp){
		super(hp);
	}
}
//건물
class CommandCenter implements Irepairable{
}
class Tank2 extends GroundUnit implements Irepairable{
	Tank2() {
		super(50);
		this.hitpoint = this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Tank2";
	}
}
class Marine2 extends GroundUnit{
	Marine2() {
		super(50);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Marine2";
	}
}
//Scv 광물캐고, 치료......에너지를 올릴 수 있다
class Scv extends GroundUnit implements Irepairable{
	Scv() {
		super(60);
		this.hitpoint=this.MAX_HP;
	}
	@Override
	public String toString() {
		return "Scv";
	}
	
	//Scv 구체화, 특수화 된 고유한 기능
	//repair (수리하다)
	
	void repair(Tank2 tank) {
		if(tank.hitpoint != tank.MAX_HP) {
			tank.hitpoint += 5;
		}
	}
	void repaor(Scv scv) {
		if(scv.hitpoint != scv.MAX_HP) {
			scv.hitpoint += 5;
		}
	}	
	//Scv repair 해야하는 Unit 증가하면...함수를 Unit 개수만큼
	//고민 : 하나의 함수가 모든 Unit repair 할 수 있다면
	//다형성, 상속 관계, 부모타입, 부모는 자식 객체에 주소를 가질 수 있다. (전자제품 매장을 떠올려보자)

	//***우리가 가지고 있는 모든 Unit2은 repair의 대상이 아니다***
	//void repair(Unit2 unit) { >> Marine2(x), Scv(o)}

	//void repair(GroundUnit unit){} >> Marine2(x), Scv(o), Tank(o)
	//**CommandCenter repair 가능

	//고민
	//Marine2	Scv	Tank2	CommandCenter 서로 연관성이 없어

	//implements Irepairable -> 연관성이 없어도 서로 연관성이 만들어진다	
	//class CommandCenter implements Irepairable
	//class Tank2 extends GroundUnit implements Irepairable
	//class Scv extends GroundUnit implements Irepairable

	void repair(Irepairable repairunit) {
		//Irepairable을 구현하고 있는 객체의 주소 : Irepairable 부모타입 : 자식타입(Tank2, CommandCenter, Scv)
		//repair Tank2 Scv2 >> scv.hitpoint += 5;
		//repair 방법 >> CommandCetner
		//repairunit >> CommandCetner 이거 나 아니거나 구분 처리
		
		//Irepairable repaieunit >> Tank2
		//repairunit 볼 수 있는 것은 아무것도 >> 그런데 >> hitpoint, MAX_HP >> 
		
		//downcasting -> Tank2 tank = (Tank2)repaieunit; (상위 타입을 하위 타입으로)
		//downcasting -> Scv scv = (Scv)repaieunit; (상위 타입을 하위 타입으로)
		
		//위 코드는 무엇이 올지 모른다
		//Tank2 >> GroundUnit >> Unit2
		//Scv	   >> GroundUnit >> Unit2
		//공통점 : Unit2
		
		//또 문제점
		//그런데 CommandCenter >> Unit2 연관성이 없다
		//1. parmeter 들어온 [주소]가 Unit2 타입이냐 아니냐
		//2. 충전방법 2가지로
		//3. 연산자(instanceof)
		//void repair(Irepaitable repairunit)		>>	repair(new Tank2(())
		//void repair(Irepaorable repairunit)	>>	repair(new CommandCenter(())
		
		//repairunit >> Tank2 주소
		//repairunit >> Command
		
		//if(repairunit instanceof Unit2)
		
		//POINP : 
		if(repairunit instanceof Unit2) {	//부모 repairunit이 Unit2에 인스턴스가 될 수 있다면 true고 아니면 false
			Unit2 unit =(Unit2)repairunit;
			if(unit.hitpoint !=unit.MAX_HP) {
				unit.hitpoint = unit.MAX_HP;
			}
		}else {	//부모가 Unit2
			System.out.println("다른 충전 방식을 제공합니다...Unit2 타입이 아니에요");
		}
	}
}

public class Ex04_Interface {
	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Marine2 marine = new Marine2();
		Scv scv = new Scv();
		
		//전투
		tank.hitpoint-=20;
		System.out.println("탱크 : "+ tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(tank);
		System.out.println("탱크 수리 완료 : "+ tank.hitpoint);
		
		tank.hitpoint-=10;
		System.out.println("Scv : "+ tank.hitpoint);
		System.out.println("Scv 수리 요청");
		scv.repair(scv);
		System.out.println("탱크 수리 완료 : "+ scv.hitpoint);
		
		CommandCenter center = new CommandCenter();
		scv.repair(center);
	}

}
