package test;

class Variables{	//--------------클래스 변수, 인스턴스 변수
    int iv; // 인스턴스 변수
    static int cv; // 클래스 변수
    void method()
    {
        int iv=0; // 지역변수
    }
}
public class Ex01_Class {
	// 반환값이 있는경우	----------------메서드
	int add(int a, int b)  // 메서드 선언부
	{
	    /* {} 블록사이 : 메서드의 구현부 */
	    int result = a+b;
	    return result; // 반환값
	}	
//	반환값이 없는 경우 – return 문만 써주면 된다. 
//	반환값이 있는 경우 – return 문 뒤에 반환값을 지정해 주어야 한다.
// 	return 반환값;
//	int add(int a int b)  // 메서드 선언부 - int 타입
//	{
//	    int result = a+b;
//	    return result; // 반환값 - int 
//	}
	// 반환값이 없는 경우 void 사용
	void method()
	{
	    int iv=0; // 지역변수
	}
	//---------------------------------메소드 [예제 1]

}
