import java.util.Scanner;
public class Test {
//�� ���� �Է¹޾� 100������ �ڿ��� �� �� ���� ������� ���ϴ� ���α׷� �ۼ� 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("num1�� �Է¹����ÿ� : ");
		int num1= scan.nextInt();
		System.out.println("num2�� �Է¹����ÿ� : ");
		int num2 = scan.nextInt();
		
		for(int i =1; i<=100; i++) {
			if((i % num1 == 0)&&(i % num2 == 0)) { 
				/*
				 * �Է��� �� : 24 , 12
				 * for(����)
				 * if((1 % 24 ==0) && (1%12==0) ) => false 
				 * if(48 % 24 ==0) && (48 % 12 ==0) => true �� ���� �ּ� ����� 
				 * if(96 % 24 ==0) && (96 % 12 ==0) => true �� ���� ����� 
				 */
				System.out.println(i);
				continue;
			}
		}
		}

	}


