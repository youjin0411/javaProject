package ��������;
import java.util.Scanner;
public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
		
		String input = scan.nextLine();
		ch = input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.println("�����Դϴ�.");
		}
		if(('a'<=ch && ch <='z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("�������Դϴ�.\n");
		}
	} //main

}
