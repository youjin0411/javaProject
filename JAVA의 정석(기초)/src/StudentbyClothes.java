
public class StudentbyClothes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("������", 'S', 100000);
		Student s2 = new Student("������",'L',100000);
		
		Clothes c1 = new Clothes("Ƽ����",10000,50);
		Clothes c2 = new Clothes("����",4000,20);
		Clothes c3 = new Clothes("���ǽ�",20000,10);
		
		s1.buyClothes(c1, 3);
		s1.printResult(c1);
		c1.printCresult();
		
		s2.buyClothes(c3, 2);
		s2.printResult(c3);
		c3.printCresult();
	}

}
