//�迭�� �����Ͽ� ���ϴ� ������ŭ ���� �� �Է��� ���� �� �ִ񰪰� �ּҰ��� ���� �� �� ���� �ִ������� ���Ͻÿ�.
import java.util.Scanner;
public class ArrayResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� > ");
		int arrsize = scan.nextInt();
		int number[] = new int[arrsize];
		int max = 0;
		int min = 100;
		int result = 0; 
	
		for(int i =0; i < arrsize; i++) {
			System.out.println("�迭�� �Է��� ���� �Է��Ͻÿ�");
			System.out.print((i+1)+"��° ���� �Է��Ͻÿ�.");
			number[i] = scan.nextInt();
			
			if(number[i] > max ) {
				max = number[i];
			}
			if(number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("�ִ밪 :"+max+", �ּҰ� : "+min+"�� �ּҰ������ ?");
			//��Ŭ���� ȣ���� Ǯ�� ��� 
			do {
			    result = max % min;
			    max = min;  //max�� min�� ���������� ��� �� max�� ������־�� �Ѵ�.
			    min = result;
			} while (result != 0);
		
		System.out.println("�ִ������� "+ max +"�Դϴ�.");
	}

}
