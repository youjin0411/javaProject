package ĳ����;

public class DowncastiogEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p= new Student("���繮"); //��ĳ���� (�θ� Ŭ���� = �ڽ� Ŭ����)
		Student s;
		
		s=(Student)p; //�ٿ� ĳ���� 
		System.out.println(s.name);
	}

}
