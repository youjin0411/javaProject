//���ڸ� �Է¹޾� �� ���� ������ ���� �� ���ϱ� ex)�Է��� �� : 18, ������ �� : 81 =>�� ���� �� : 18 + 81 = 99
import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int number[]= new int[2];
		int cnumber[]= new int[2];
		int sum;
		System.out.print("���ڸ� �Է��Ͻÿ� >>  ");
			
			number[0]=scan.nextInt();
			number[1]=scan.nextInt();
		
		cnumber[0] = number[1]*10;
		cnumber[1] = number[0];
		
		sum = (number[0]*10)+(number[1])+(cnumber[0])+(cnumber[1]);
		
		System.out.println(sum);
		

	}

}
