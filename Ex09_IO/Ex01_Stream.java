import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 	IO
 	Stream (Byte)
 	JAVA API
 	추상클래스
 	InputStream, OutPutStream
 	두 개의 추상 클래스를 구현해서 사용해라
 	(재정의)
 	
 	대상
 	1.Memory : ByteArray	:ByteArray
 	2.File		  : File				: File
 */
public class Ex01_Stream {
	public static void main(String[] args) {
		//byte(-128 ~ 127) 정수를 저장할 수 있는 타입
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null; //현재 메모리를 가지고 있지 않다 (초기화)
		
		//데이터를 read, write 하는 대상 memory
		ByteArrayInputStream input = null;	//빨대
		ByteArrayOutputStream outout = null; //빨대
	
		input = new ByteArrayInputStream(inSrc); //inSrc 부터 data >> read
		outout = new ByteArrayOutputStream(); //write
		
		System.out.println("ourSrc before : " + Arrays.toString(outSrc));

		
		
		//공식같은 로직
		int data = 0;
		while((data = input.read()) !=-1) { //더 이상 read할 Date가 없으면 -1
			System.out.println("data : " + data);
			outout.write(data); //빨대안에 데이터를 넣는 것
			//System.out.println("in")
			//write 대상이 data가 아니고 ByteArrayOutputStream 자신의 통로 data 가지고
			outSrc = outout.toByteArray();
		}
		outSrc = outout.toByteArray();
		
		System.out.println("ourSrc before : " + Arrays.toString(outSrc));
		System.out.println("input.read() : " + input.read());
		//read() 함수는 내부적으로 next() >>
	}

}
