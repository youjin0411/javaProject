package ���ǹ�;
import java.util.Scanner;
public class FlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���.>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0 �Դϴ�.");
		}
		if(input !=0) {
			System.out.printf("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�%n");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�",input);
		}
	}

}
