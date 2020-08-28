//게임 : unit(유닛)
//unit : 공통기능(이동좌표, 이동, 멈춘다) : 추상화, 일반화
//unit : 이동 방법은 각자 다르다 (이동방법은 unti마다 별도의 구현)
//abstract class 이름{abstract 이동}

abstract class Unit{
	int x, y;
	void stop() {
		System.out.println("Unit stop");
	}
	//이동(강제)
	abstract void move(int x, int y); //추상자원
}

//Tank
class Tank extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y=y;
		System.out.println("Tank 이동" + this.x+ "," +this.y);
	}
	void changeMode() {
		System.out.println("탱크변환모드");
	}
}

class Marine extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y=y;
		System.out.println("Marine이동" + this.x + "," +this.y);	
	}
	void stimpack() {
		System.out.println("스팀팩 기능");
	}
}

class Dropship extends Unit{
	@Override
	void move(int x, int y) {
		this.x = x;
		this.y=y;
		System.out.println("Dropship이동" + this.x + "," +this.y);	
	}
	void changeMode() {
		System.out.println("스팀팩 기능");
	}
}
public class Ex02_abstract_class {
	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(500, 200);
		t.stop();
		t.changeMode();
		
		Marine m = new Marine();
		m.move(500, 200);
		m.stop();
		m.stimpack();
		
		//1. 탱크 3대를 만들고 [같은 좌표]로 이동 시키세요(555,444)
		Tank[] tanklist= {new Tank(), new Tank(), new Tank()};
		for(Tank tank:tanklist) {	//tanklist를 tank에 대입한다
			
			tank.move(555, 444);
		}
		//2. 여러개의  Unit (Tank 1, Marine 1, Dropship)같은 좌표로 이동 시키세요(좌표값 : 666,444)
		Unit[] unitlist= {new Tank(), new Marine(), new Dropship()};
		for(Unit unit:unitlist) {
			unit.move(666, 444);
		}
	}
}
