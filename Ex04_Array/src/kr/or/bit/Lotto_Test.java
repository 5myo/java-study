package kr.or.bit;

import java.util.Random;
import java.util.Scanner;

/*
1. 1~45������ ������ �߻����� 6���� �迭�� ��������
	(int)(Math.random()*45 + 1)
	lotto[0] = 44 , lotto[1] = 1 .... lotto[5] = 33
2. �迭�� ��� 6���� �迭���� �ߺ����� ������ �ȵǿ�  (�ߺ��� ���� :����� ���)
3. �迭�� �ִ� 6���� ���� ���� ������ ���� ��Ű����  (���� : �ڸ��ٲ�)
4. �� ����� ��� �ִ� �迭�� ����ϼ��� (ȭ�� ���)
*/
public class Lotto_Test {
	int[] number=new int[6];	//���� �迭 number ���� //number�� 6���� �� ����
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
	//��� �� ���̴� �ζ� ���α׷� ȭ��
	private String showMenu() {
		System.out.println("***********************");
		System.out.println("****1.��÷ ���� ��ȣ �����ϱ�****");
		System.out.println("****2.���α׷� �����ϱ�^-^****");
		System.out.println("************************");
		System.out.println("���ϴ� �޴��� �Է��� �ּ��� : ");
		String selectnum = scanner.nextLine();
		return selectnum;
	}
	
	//��ȣ ����, �ߺ�����
	private void makeLottoNumber(){
		for(int i=0; i<6; i++) {	//i�� 6���� ���� ������ �ݺ�
			number[i] = (int)(Math.random()*45 + 1);	//i�� 1~45���� ����
			for(int j=0; j<i; j++) {	//j�� i���� ���� ������ �ݺ�
				if(number[i] == number[j]) {	//i�� j�� ���� ��
					i--;
					break;
				}
			}
		}
	}
	//�ζ� ��ȣ�� ���� ��� ����
	private boolean checkAverage() {
		int sum = 0;
		int average =0;
		for(int num:number) {	//=�� �ϳ��� �� �� ����, :�� �迭 ���� ���� ������ �� ����
			sum+=num;	//sum�� num ���� �����ش�. (sum�� �ζ� ��ȣ ���հ�)
		}
		average=sum/number.length;	//sum(�ζǹ�ȣ ���հ�) ������ �迭�� ����(6)
		System.out.println("���"+average);
		return(average>=15&&average<=35);	//����� ���ؼ� 15~35���� ������ Ȯ���ϴ� �Լ�
	}
	
	// �޴��� �Է� �� ���ư��� �ڵ�
	public void selectLottoNumbers() {
		while(true) {
			String selectnum = showMenu();	//selectnum�� ���α׷� ȭ�� ����
			switch(selectnum) {
			case "1":		//1�� �Է��� ���, ���� ��ȣ ����
				do {		//makeLottoNumber�� �ѹ� �̻� ������ ����
					makeLottoNumber();	//��ȣ���� �� �ߺ�����
				}while(!checkAverage());	
				showLottoNum();
				break;
			case "2":	//2���� �Է��� ���, ���α׷� ����
				System.out.println("�̿��� �ּż� �����մϵ�.");
				break;
			default:
			System.out.println("������ �߻��Ͽ����ϴ�.");
			break;
			}
		}
	}
	//ȭ�鿡 ���� �������� ���
	private void showLottoNum() {
		for(int i=0; i<number.length; i++) {	//i�� �迭�� ���̺��� ���� ������ �ݺ�
			for(int j=i+1; j< number.length; j++) {	//j�� number�� �迭(6)���� ���� ������ �ݺ�
				if(number[i]>number[j]) {	//j�� ���� ���� ��ü�� i�� ���� ���� ��ü�� ��
					int temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		//����ϱ�
		System.out.println("������ Lott ��ȣ");
		for(int i =0; i<number.length; i++) {
			System.out.printf("[%2d]", number[i]);
		}System.out.println();
	}

}
