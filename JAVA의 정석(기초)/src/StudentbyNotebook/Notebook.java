package StudentbyNotebook;
/*
 * ������� : ����, ����, �����
 * ������� : ������, ��å�� �Ǹ��ϴ�, ��� 
 */
public class Notebook {
	int Quantity; //����
	int price;
	int take; //�����
	
	public Notebook(int Quantity,int price) {
		this.Quantity=Quantity;
		this.price=price;
	}
	
	public void sale(int amount) {
		if(Quantity >= amount) {
			Quantity -=amount;
			take += (amount * price);
		}else {
			System.out.println("��� ���� !! ���� �Ұ� ");
		}
	}
	
	public void PrintNotebook() {
		System.out.println("=====��å�� �Ǹŷ� =====");
		System.out.println("���  :"+this.Quantity);
		System.out.println("����� :" + this.take);
	}
}
