package �߻�Ŭ����_�߻�޼ҵ�;

public class ShapeTest extends ShapeExam{
		public double getArea(int a,int b) {
			return a * b;
	}
		public double getCircum(int a, int b) {
			return a + b;
		}
		
		public static void main(String args[]) {
			ShapeTest shape = new ShapeTest();
			System.out.println(shape.getArea(3, 5));
			System.out.println(shape.getCircum(3, 3));
		}
}
