import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 	HashMap<K, V>
 		HashMap<String, String>
 		HashMap<Integer, String>
 		HashMap<String, Student> *****
 		>>put("kim", new Student()) *****
 */
class Student {
	int kor;
	int math;
	int eng;
	String name;
	public Student(int kor, int math, int eng, String name) {
		super();
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.name = name;
	}
}
public class Ex14_HashMap {
	public static void main(String[] args) {
		HashMap<String, Student> sts = new HashMap<String, Student> ();
		sts.put("hong", new Student(100,99,98,"홍길동"));
		sts.put("kim", new Student(50,40,60,"김유신"));
		
		Student std = sts.get("hong");
		System.out.println(std.kor);
		System.out.println(std.name);
		
		//Tip
		//Map 안에 key, value >> key + "=" + value >>
		Set set = sts.entrySet(); //kim=Student@6d06d69c
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
