import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*
 	File 처리 (Disk) : 한 Byte 단위 read, write
 	모아 모아서 한번에 read, write (여행 각자... 버스 한번에...)
 	버스 : buffer
 	<장점>
 	1. I/O 성능개선
 	2. Line 단위(엔터) 작업 가능
 	
 	BufferedInputStream 보조 (주 클래스 의존)
 	생성자를 통해서 강제
*/
public class Stream_Buffer {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt"); //파일이 없으면 자동 파일 생성
			for(int i=0; i<10; i++) {
				bos.write('A'); //10개
			}
			//JAVA Buffer 크기 : 8kbyte : 8192byte
			//1. buffer 안에 내용이 채워지면 스스로 비우는 작업 : 내부적으로 flush
			//2. buffer 강제로 비우기 (flush(), close())
			//3. bos.close() 자원해제 >> close() >> 내부적으로 flush() 호출
			bos.flush();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
	}
}
