//�ִ밪 ���ϴ� ���α׷� (0�� �Է� �� ���� �Է� ����) 
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num;
		int max = 0;
	
		do {
			System.out.print("���ڸ� �Է����ּ���.> ");
			num = scan.nextInt();
			if(num >=  max) {
				max = num;
			}
		}while(num != 0);
		
		System.out.println("�ִ밪�� "+max +" �Դϴ�.");
	}

}
