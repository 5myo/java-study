
public class Ex04_Array_for {
	public static void main(String[] args) {
		//Today Point
		// for문  ..... 향상된 ,개선된  for문
		//JAVA :  for( Type  변수명 : 배열 or Collection) { 실행구문  변수명 ...}
        //C#    :  for( Type 변수명  in 배열 or Collection) { 실행구문  변수명 ...}
		//JavaScript : for(Type 변수명  in 배열 or Collection) { 실행구문  변수명 ...}
		
		int[] arr3 = {5,6,7,8,9};
		for(int i = 0 ; i < arr3.length ; i++) {
			System.out.println(arr3[i]);
		}
		
		//개선된
		for(int value : arr3) {
			System.out.println(value);
		}
		
		String[] strarr = {"A" , "B" , "C" , "D" , "FFFFF"};
		
		for(String value : strarr) {
			System.out.println(value);
		}
		
	}

}






