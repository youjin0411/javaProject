/*
 * �������: �̸�, ������, �ܾ�
 * �������: ������, �л��� ���� ���, ���(� ���� ��°�? �ܾ��� ���ΰ�); 
 */
public class Student {
	String name;
	char size;
	int balance;
	int scount;
	
	public Student(String name,char size,int balance) {
		this.name= name;
		this.size = size;
		this.balance = balance;
	}
	
	
	public void buyClothes(Clothes item,int count) {  //�л��� ���� ���
		if(item.quantity >= count) {
			item.sellClothes(count);
			balance -=(count * item.cprice);
			scount = count;
		}
	}
	
	public void printResult(Clothes item) {
		System.out.println(">>>> "+name+"�� �� ���� ��Ȳ  <<<<");
		System.out.println(item.cname+"("+item.cprice+")"+"�� "+scount +"�� �����Ͽ����ϴ�.");
		System.out.println("�ܾ��� "+this.balance+"�Դϴ�");

	}
}
