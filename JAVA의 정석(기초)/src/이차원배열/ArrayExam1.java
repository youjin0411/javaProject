package �������迭;
//10 10 10
//20 20 20
//30 30 30
//40 40 40
//���� �迭�� ������ �� ����Ͻÿ�.
public class ArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[4][3];
		for(int i = 0; i < num.length;i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(10+(i*10)+"\t");
			}
			System.out.println();
		}
	}

}
