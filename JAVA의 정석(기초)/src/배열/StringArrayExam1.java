package �迭;
//3���� �̸��� �迭�� ���� ��  ����ϴ� ���α׷� 
import java.util.Scanner;
public class StringArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name[] = new String[3];
		System.out.println("�̸��� �Է��Ͻÿ�.");
		for(int i=0;i<name.length;i++) {
			name[i] = scan.nextLine();
		}
		for(int j=0;j<name.length;j++) {
			System.out.println(name[j]);
		}
	}

}
