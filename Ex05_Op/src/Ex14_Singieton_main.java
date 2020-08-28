import kr.or.bit.Singleton;

public class Ex14_Singieton_main {

	public static void main(String[] args) {
		//Singleton s = new Singleton();
		Singleton s = Singleton.getinstance();
		System.out.println(s);
		Singleton s1 = Singleton.getinstance();
		System.out.println(s1);
		Singleton s2 = Singleton.getinstance();
		System.out.println(s2);
	}

}
