package aaa;

import java.io.IOException;

/*
 >>CD ���� ���� ��ġ
 >>1.��ġ ����>>C:Temp>>����
 >>2.������ ���� >>���α׷� ��ġ
 >>3.���� ��ġ>>C:Temp>>������ ���� ����
 >>4.������ ��ġ>>���� ����>>������ ���� ����
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
//		//�����δ� ���ܰ� �ƴ�����
//		//������ ���� �߻� : �����ڰ� ���Ƿ� ������ �߻����Ѽ� ������ ���ܸ� ó�� �ϴ� ���
//		//�ڵ� : ���� ��ü�� ���� ����...new...�߻�...����...�˷�...>>throw
//		//throw new IOException();
//		fileDelete();
	
		try {
			copyFiles();
			startlnstall();
			throw new IOException("Install�߿� ������ �߻�...");//�����ڿ� ���Ƿ� ���� �߻�
		}catch(Exception e){
			System.out.println("���� �޼��� ��� : " + e.getMessage());
			//fileDelete();
		}finally {	//���� ���� �� ���ܰ� �߻� ����, ���ܰ� �߻����� �ʾƵ� ����
			fileDelete();
			
			//�ڿ� ����
		}
		System.out.println("main end");
		//*****************************************************************
		//�Լ��� ���� ���� : return �ִ� �ϴ��� finally ������ ���� (����)
	}
}
