package ���ǹ�;
import java.util.Scanner;
public class FlowEx4 {
/*
 * 		����(1)  ����(2)	��(3)   => ��ǻ��
 * ����    ���º�0	�Ľ�-1	�����-2
 * ����	��� ��1 	���º�0	�Ľ�-1
 * ��	�Ľ�2		�����1	���º�0
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ���.");
		
		int user = scan.nextInt();
		int com = (int)(Math.random() *3)+1; //1,2,3 �� �ϳ��� com�� ����
		
		System.out.println("����� "+user+"�Դϴ�.");
		System.out.println("���� "+ com + "�Դϴ�.");
		
		switch(user - com) {
		case -1: 
		case 2: 
			System.out.println("����� �����ϴ�.");break;
		case 1:
		case -2:
			System.out.println("����� �̰���ϴ�.");break;
		case 0:
			System.out.println("�����ϴ�."); break;
	}

	}
}
