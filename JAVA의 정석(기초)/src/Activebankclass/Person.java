package Activebankclass;

public class Person {
	int money;  //���� ������ �ִ� �� 
	String ebank; //���� �����̸�
	int balance;	//�����ܾ�
	
	public Person(int money,String ebank,int balance) {
		this.money = money;
		this.ebank = ebank;
		this.balance = balance;
	}
	
	public void money_input() {
		balance += money;
	}
	public void money_spend(int getmoney) {
		balance -= getmoney;
	}
	public void Print() {
		System.out.println("���� "+ebank+"�� ���� �ܾ��� : "+balance+"�Դϴ�.");
	}
}

