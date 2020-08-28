import java.io.FileReader;
import java.io.FileWriter;

/*
 	문자 기반의 데이터 처리(char[])
 	String 클래스 : String str = "ABC" : 내부적으로 char[] [A][B][C]
 	
 	한글 1자, 영문 1자 >> 2byte 처리 >> Stream(빨대)의 크기가 커진다
 	
 	Reader, Writer 추상 클래스
 	
 	대상파일
 */
public class Ex05_Reader_Writer {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Strean.java"); //read
			fw = new FileWriter("copy_stream.txt"); //파일 생성 그 파일에 같은 내용 Write
			
			int data = 0;
			while((data=fr.read()) != -1) {
				//System.out.println(data);
				
				//코드 배포버전 만들 때(엔터 공백 제거) >>  압축버전
				fw.write(data);
				if(data != '\n'&&data != '\r'&& data !='\t'&&data!=' ')
				{
					fw.write(data);
				}
			}
		} catch (Exception e) {

		}finally {
			try {
				fw.close();
				fr.close();
			} catch ( Exception e2) {
			}
		}
	}
}






