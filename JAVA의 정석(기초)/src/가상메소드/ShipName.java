package ����޼ҵ�;

public class ShipName {
	public static void search(Ship s) {
		if(s instanceof MyShip) { //Ship s�� ��ü �ȿ� MyShip�� ��ĳ���� �Ǹ� 
			MyShip b = (MyShip)s; // MyShip b�� ��ü�� Ship s�� ��ü�� �ٿ� ĳ���� �����ش�. �� MyShip ���󺹱� 
			System.out.println("Myship name : "+b.Name()); //Myship name : ������
		}else if(s instanceof YourShip){ //Ship s�� ��ü �ȿ� YourShip�� ��ĳ���� �Ǹ� 
			YourShip b = (YourShip)s; //YourShip b�� ��ü�� Ship s�� ��ü�� �ٿ� ĳ���� �����ش�. �� YourShip b ���󺹱� 
			System.out.println("YourShip name : "+ b.Name()); // YourShip name : Ÿ��Ÿ�� ȣ
		}
	}
}
