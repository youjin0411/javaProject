package StudentbyNotebook;
/*
 * ������� : �̸� , �뵷, 
 * ������� : �����ڸ޼���, �л��� ��å�� ���, ��� 
 */
public class Student {
	String name;
	int pinmoney; //�뵷
	
	public Student(String name, int pinmoney) {
		this.name = name;
		this.pinmoney = pinmoney;
	}
	
	public void getNotebook(Notebook item,int amount) {
		if(pinmoney >= item.price*item.take ) {
			pinmoney -= item.price*item.take;
			item.sale(amount); //NotebookŬ������ sale�� ȣ���Ѵ�.
		}else {
			System.out.println("���� �Ұ�");
		}
	}
	
	public void PrintStudent() {
		System.out.println("====="+this.name+"�л��� ���� �� =====");
		System.out.println("���� �ݾ� : "+ this.pinmoney);
	}
	
}
