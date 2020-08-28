import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	read, write 대상 File (물리적인) >> 1.txt, data.txt
 	FileInputStream
 	FileOutPutStream
 */
public class Ex02_Point_FileStream {
	public static void main(String[] args) {
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		
		try {
			fs = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\new.txt", true);
			//FileOutPutStream
			//1. write 하는 파일이 존재하지 않으면 >> 파일을 생성한다
			//fos = new FileOutputStream("C:\\Temp\\new.txt",false);
			//false >> overwrite
			
			//fos = new FileOutputStream("C:\\Temp\\new.txt", true);
			//true >> append
			//run의 개수만큼 늘어난다.
			int data = 0;
			while((data=fs.read())!= -1) {
				//System.out.println("정수 : " + data);
				//문자값 : char c =(char)data;
				System.out.println("문자 : " + (char)data);
				fos.write(data); //data를 read 해서 >> new.txt >> write
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//정상, 비정상
			//자원해제
			//명시적인 자원의 해제 >> 가비지 칼렉터가 관리하지 않는다 >>
			//close >> 명시적으로 >> 소멸자를 호출
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
