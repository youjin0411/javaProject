/*
 * ���� ���: �� �̸�, �� ����, �����
 * ���� ���: ������, ���� �Ǹ��ϴ�, ���(� �ʵ��� �Ⱦ�, ������� ���̴�)
 */
public class Clothes {
	String cname;
	int cprice;
	int quantity;
	int take;
	int ccount;
	
	public Clothes(String cname, int cprice, int quantity) {
		this.cname = cname;
		this.cprice = cprice;
		this.quantity =quantity;
	}
	
	public void sellClothes(int count) {
		if(quantity >= count) {
			quantity -= count;
			take += (count * cprice); 
			ccount = count;
		}
	}
	
	public void printCresult() {
		System.out.println(">>>> "+cname+" "+ccount+"�� �Ǹ��Ͽ����ϴ�.");
		System.out.println("������� "+this.take+"�Դϴ�.");
		System.out.println();
	}

}
