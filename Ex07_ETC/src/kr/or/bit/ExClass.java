package kr.or.bit;

import java.io.IOException;

/*
 설계도(class) 문제가 발생 
 내 설계도를 사용하는 개발자가 [예외를 강제]로 처리, 안전
 생성자, 함수 만들때 강제로 예외를 처리하게
 */
public class ExClass {
	public ExClass(String path)throws IOException, NullPointerException {
		System.out.println(path);
	}
}
