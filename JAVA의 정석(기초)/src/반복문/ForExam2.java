package �ݺ���;
//�ִ밪 ���ϴ� ���α׷�(0�� �Ǹ� ����)
/*import java.util.Scanner;
public class ForExam2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max=0;
		int input;
		do {
			System.out.print("���ڸ� �Է����ּ���: ");
			input = scan.nextInt();
			if(input >= max) {
				max = input;
			}
		}while(input != 0);
		System.out.println("�ִ밪��  "+max+" �Դϴ�.");
	}

}
*/
import java.util.Scanner;
public class ForExam2{
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int input; //�Է¹��� �� 
		int max = 0; //�ִ밪 
		
		do {
			System.out.print("���ڸ� �Է����ּ��� > ");
			input = scan.nextInt();
			if(input >= max) {
				max = input;
			}
		}while(input != 0);
		System.out.println("�ִ밪��  "+max+" �Դϴ�.");
	}
}
