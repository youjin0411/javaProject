package ĳ����;

public class CastiogExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar,yourcar;
		Bus mybus, yourbus;
		Truck mytruck,yourturck;
		mycar = new Bus(); //��ĳ����
		mybus = new Bus(); //��ü ���� 
		mytruck = new Truck(); //��ü ����
		
		System.out.println("["+mycar.print()+"]");
		System.out.println("["+mybus.print()+"]");
		System.out.println("["+mytruck.print()+"]");
		yourcar = mybus;
		yourbus = (Bus)yourcar; //�ٿ� ĳ����
		System.out.println("["+yourbus.print()+"]");
		yourcar = mytruck;
		yourturck = (Truck)yourcar; //�ٿ� ĳ���� 
		System.out.println("["+yourturck.print()+"]");
	}

}
