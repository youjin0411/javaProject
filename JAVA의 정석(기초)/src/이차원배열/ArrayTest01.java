package �������迭;
// ����, �ξ�, ������ �ڹ� ���̽� c��� ������ 2���� �迭�� �����Ͽ� �̻ڰ� ����ϴ� ���α׷�
/*
 *  ����		�ڹ�|		���̽�|	c���|	����|		���
 *  1��			
 *  2��
 *  3��
 */
import java.util.Scanner;
public class ArrayTest01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int number[][]=new int[3][5];
		int sum = 0;
		for(int i =0; i < number.length; i++) {
			System.out.println("�ڹ�. ���̽� . c��� ������ �Է��Ͻÿ�. > ");
			for(int j = 0; j < number[i].length-2; j++) {
				number[i][j]=scan.nextInt();
			}
			System.out.println();
		}
		System.out.println("����\t�ڹ�|\t���̽�|\tc���");
		for(int i =0; i < number.length; i++) {
			System.out.print(i+1+"��");
			for(int j = 0; j < number[i].length-2; j++) {
				System.out.print("\t"+number[i][j]);
			}

			System.out.println();
	}	

	}
}
