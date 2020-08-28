package aaa;

import java.io.IOException;

/*
 >>CD 한장 게임 설치
 >>1.설치 파일>>C:Temp>>복사
 >>2.복사한 파일 >>프로그램 설치
 >>3.정상 설치>>C:Temp>>복사한 파일 삭제
 >>4.비정상 설치>>강제 종료>>복사한 파일 삭제
 */

public class Ex03_Finally {
	static void startlnstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("FILE DETE");
	}
		public static void main(String[] args) {
	
//		copyFiles();
//		startlnstall();
//		//실제로는 예외가 아니지만
//		//강제로 예외 발생 : 개발자가 임의로 문제를 발생시켜서 강제로 예외를 처리 하는 방법
//		//코드 : 예외 객체를 직접 생산...new...발생...예외...알려...>>throw
//		//throw new IOException();
//		fileDelete();
	
		try {
			copyFiles();
			startlnstall();
			throw new IOException("Install중에 문제가 발생...");//개발자에 임의로 예외 발생
		}catch(Exception e){
			System.out.println("예외 메세지 출력 : " + e.getMessage());
			//fileDelete();
		}finally {	//강제 실행 블럭 예외가 발생 실행, 예외가 발생하지 않아도 실행
			fileDelete();
			
			//자원 해제
		}
		System.out.println("main end");
		//*****************************************************************
		//함수의 강제 종료 : return 있다 하더라도 finally 강제로 실행 (먼저)
	}
}
