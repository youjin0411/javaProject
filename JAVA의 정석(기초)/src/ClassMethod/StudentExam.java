package ClassMethod;

public class StudentExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studnet kim = new Studnet("������");
		//kim.grade = 2;
		kim.setGrade(2);
	 	Studnet jang = new Studnet("�����",3);
		//kim.print();
		//jang.print();
	 	System.out.println("�л��� �̸��� "+kim.getName()+"�̰� , "+kim.getGrade()+"�г��Դϴ�.");
	 	System.out.println("�л��� �̸��� "+jang.getName()+"�̰�, "+jang.getGrade()+"�г��Դϴ�.");
	}

}
