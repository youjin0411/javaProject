package Scanner;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �ڸ� ������ �ϳ� �Է����ּ���>");
		String input = scan.nextLine();
		int num = Integer.parseInt(input); //�Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		System.out.println("�Է³��� :"+input);
		System.out.printf("num=%d%n", num);
	}

}
