package ����޼ҵ�;

public class ShipMainExam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Ship myship = new MyShip(); //Ship��ü�� MyShip ��ĳ���� 
			Ship yourship = new YourShip(); // Ship ��ü�� YourShip ��ĳ����
			ShipName.search(myship); //Ship ��ü�� myship ��ĳ���� ���� �� => Myship name : ������
			ShipName.search(yourship);//Ship ��ü�� yourship ��ĳ���� ���� �� => YourShip name : Ÿ��Ÿ�� ȣ
	}

}
