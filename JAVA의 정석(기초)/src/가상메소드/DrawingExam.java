package ����޼ҵ�;

public class DrawingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw(); //�� �׸���
//		c.painting(); //��ĥ�ϱ� 
//		Shape s = new Shape();
//		s.draw();
//		s.paintiin(); => ���� �߻� : ��� ���� �� ����Ŭ������ ����Ŭ������ �޼ҵ� ��� �Ұ�
		Shape s = new Circle(); // ��ĳ���� (����Ŭ������ ����Ŭ���� ����)
		s.draw();
		//s.painting => �����߻� : ��ĳ���� �� ����Ŭ������ ����Ŭ������ �������̵�(������)�� �޼���� ����� �� ������ �������̵� ���� ���� �޼���� ��� �Ұ�
		}

}
