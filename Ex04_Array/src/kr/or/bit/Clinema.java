package kr.or.bit;

import java.util.Scanner;

public class Clinema {
	//����
	private Scanner scanner;
	private String[][] seat;
	//�ʱⰪ
	public Clinema() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
	}
	//��� ȭ��
	private String Clinemaprint(){
		System.out.println("***********************");
		System.out.println("*******��ȭ ���� �ý���*******");
		System.out.println("***********************");
		System.out.println("1. �����ϱ�");
		System.out.println("2. ������ȸ");
		System.out.println("3. �������");
		String clinemamenu = scanner.nextLine();
		return clinemamenu;
	}
	//�Է� ���
	public void selectClinema() {
		while(true) {
			String seletnum = Clinemaprint();
			switch(seletnum) {
				case "1" :
						ClinemaScren();
			}
		}
	}
	//��ȭ ���� ȭ��
	public void ClinemaScren(){
		//�迭 ����
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				seat[i][j]="";
			}
		}
		//�¼� ��Ȳ
		System.out.println("*********�¼� ��Ȳ*********");
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat.length; j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		}
		System.out.println("�¼��� ������ �ּ���.");
	}
}
