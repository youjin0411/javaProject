import java.util.Scanner;
public class average {
//�� ���� ��� ���ϸ� ����ϴ� ���α׷� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num1[] = new int[10];
		int sum =0;
		for(int i =0; i<num1.length;i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��Ͻÿ�.");
		num1[i]=scan.nextInt();
		sum += num1[i];
		}
		int avg = sum / num1.length;
		
		for(int j=1;j<=avg;j++) {
			System.out.println("��� ������ �� :" + j);
		}
		
	}

}
