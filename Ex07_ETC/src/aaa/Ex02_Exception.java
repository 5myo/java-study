package aaa;

public class Ex02_Exception {

	public static void main(String[] args) {
		
		int num=100;
		int result=0;
		System.out.println("main start");
		
		try {
			for(int i=0; i<10; i++) {
				result=num/(int)(Math.random() *10);	//0~9	//JAVA�� 0���� ������ �ȵȴ�.
				System.out.println("result :" + result + "\t i :" + i);
			}
			System.out.println("main end");
		}catch(ArithmeticException e){	//������ �߻��Ǹ� ������ �´� ��ü�� �ڵ����� �����ǰ� �ּҰ��� ����
			System.out.println("������ �߻� �Ͽ����ϴ�. \n�����ڿ��� ������ �߼��� �ֽñ� �ٶ��ϴ�.");
			System.out.println("���� : "+ e.getMessage());
			
			// catch (Exception e)>>������>>(x)
			//catch (ArithmeticException e) ���� �ڵ�(������)
			//�����Ϸ���..������ �´� ��ü�� new java.lang.ArithmeticExcetion\
			
			//�������� catch >> ���� �� ���� > ū ��
		}catch(NullPointerException e){	//NullPointerException�� ���� ó��
		}catch(Exception e){		//[���� ����] [null ����]�� ������ �������� ���� ó��
		}
	}
	

}
