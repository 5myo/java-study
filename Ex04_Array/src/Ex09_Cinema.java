
public class Ex09_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];	//���ڿ� 3�� 5�� �� ����
		for(int i=0; i<seat.length; i++) {	//i�� seat�� �ຸ�� ���� ������ �ݺ�
			for(int j=0; j<seat[i].length; j++) {		//j(��)�� seat�� (i)�ຸ�� ���� ������ �ݺ�
				seat[i][j]="___";	//�˼�
			}
		}
		//����
		seat[2][1]="ȫ�浿";
		seat[0][0]="������";
		
		//�¼� ���� �����ֱ�
		for(int i=0; i<seat.length; i++) {
			for(int j=0; j<seat[i].length; j++) {
				System.out.printf("[%s]", seat[i][j].equals("___")? "�¼�����" : "����Ϸ�");
			}
			System.out.println();
		}
		
		//�¼� �����ϱ�
		int row, col;
		row=1;	//������ �¼��� ��
		col=0;		//������ �˼��� ��
		if(seat[row][col].equals("___")) {
			System.out.println("���� ���� �¼��Դϴ�.");
		}else {
			System.out.println("�̹� ���� �Ǿ����ϴ�.");
		}
		//�¼� �ʱ�ȭ
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				seat[i][j] = "___";
			}
		}
	}
		
	//������ �䱸���� ���赵
	//class Cinema{�Ӽ�, ���}

}
