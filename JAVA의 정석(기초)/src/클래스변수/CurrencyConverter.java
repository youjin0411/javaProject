package Ŭ��������;
 
import java.util.Scanner; 

/*
 * static������ �̿��Ͽ� �޷��� ��ȭ�� ��ȯ ���ִ� ȯ�� ���⸦ ������.
 */
public class CurrencyConverter {
	private static double rate; //�ѱ� ��ȭ�� ���� ȯ��
	public static double toDollar(double won) {
		return won/rate; //�ѱ� ��ȭ�� �޷��� ��ȯ
	}
	public static double toKWR(double dollar) {
		return dollar * rate;  //�޷��� �ѱ� ��ȭ�� ��ȯ
	}
	public static void setRate(double r ) {
		rate = r; //ȯ������ . KWR / $1
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("ȯ��(1�޷�) >> ");
		double rate = scanner.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $ "+CurrencyConverter.toDollar(1000000)+"�Դϴ�.");
		System.out.println("$100�� "+CurrencyConverter.toKWR(100)+"�Դϴ�.");
		scanner.close();
	}

}
