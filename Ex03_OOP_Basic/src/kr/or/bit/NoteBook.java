package kr.or.bit;

public class NoteBook {
		public String color;
		//public int year;
		private int year; 
		//캡슐화 , 은닉화 : 직접할당을 막고 간접할당을 통해서 보호 (개발자가 원하는 값) 처리
		//간접할당
	   // public int year >> 음수값 입력	NoteBook notebook = new NoteBook();   notebook.year = -2000;
		
		//마우스를 가지고 있다
		//마우스는 여러개의 속성 과 기능 ....
		//별도의  class
		
		//public Mouse mouse;
		//int i = 100;
		//Car c = new Car();
		//Mouse m2 = new Mouse();
		//handle(m2)

		public Mouse handle(Mouse m) {  //Mouse 타입의 [주소]값이  >> new
		
			m.x = 100;
			m.y = 200;
			return m;
		}
		
		
		
		//캡슐화  된  member field    write , read  (set , get) >> 전용 함수
		//setter 함수 ,   getter 함수
		public void setYear(int y) {
			if(y < 0) {
				year = 1999;
			}else {
				year = y;
			}
			   
		}
		
		public int  getYear() {
			return year;
		}
}









