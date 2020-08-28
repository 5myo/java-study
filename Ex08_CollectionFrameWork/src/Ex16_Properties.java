import java.util.Properties;

/*
 	특수한 목적 : <string, string> (key, value)
 	고전
 	사용목적
 	APP 전체에  사용되느 자원 관리
 	환경변수
 	프로그램 버전
 	파일 경로
 	공통변수
 */
public class Ex16_Properties {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("admin", "bit@bit.or.kr");
		prop.setProperty("varsion", "1.x.x.x");
		prop.setProperty("downpath", "C:\\Temp\\images");
		//각각의 개발 페이지에서
		System.out.println(prop.getProperty("admin"));
		System.out.println(prop.getProperty("downpath"));
	}
}
