package ���ǹ�;
import java.util.Scanner;
public class FlowEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���.> ");
		
		score = scan.nextInt();
		
		System.out.println("����� ������ "+score+"�Դϴ�.");
		
		if(score >= 90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}else if(score<94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				grade ='+';
			}else if(score <= 84) {
				grade = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.println("����� ������ "+grade+opt+"�Դϴ�.");
	}

}
