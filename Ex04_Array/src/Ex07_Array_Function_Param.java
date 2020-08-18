import java.lang.annotation.Target;

class Human{
	String name;
}

class OverTest{
	int add(int i, int j) {
		return i+j;
	}
	void add(Human human) {	//POINT Human �̶�� Ÿ���� ������ ��ü�� �ּҸ� �־��
		System.out.println(human.name);
	}
	//1. add (new human())
	//Human h = new Human(); >> add(h)
	int add(int param) {
	return param;
	}
	
	//Today Point : �迭�� Ÿ���̴�.
	int[] add(int[] param) {	//�迭�� �ּҰ��� �޾Ƽ� �迭�� �ּҰ��� �����ض�
		int[] target=new int[param.length];
		for(int i=0; i<target.length; i++) {
			target[i]=param[i] + 1;
			}
		return target;
	}
}

public class Ex07_Array_Function_Param {

	public static void main(String[] args) {
		OverTest ot = new OverTest();	//OverTest�� ot �������� ����
		int[] source = {10,20,30,40,50};
		int[] target = ot.add(source);	//ot ���������� .�����ڸ� �̿��Ͽ� add�� �̵� add�� source�� �������ش�.
		for(int value:target) {	//int value �ȿ� target�� �ϳ��� �ִ´�.
			System.out.println(value);
		}
	}

}
