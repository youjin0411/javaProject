package Ŭ����;

public class Circle {
	int radius;
	String name;
	
	public Circle() {
		radius = 1;
		name = "";
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle(int radius,String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public void getArea() {
	 double area = (3.14 * radius * radius);
	 System.out.println("���̴� : "+area);
	}
	public void Print() {
		System.out.println(name+"�� ������ " + radius );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);
		c2.name = "���׶��";
		Circle c3 = new Circle(4,"����");
		
		c1.Print();
		c1.getArea();
		c2.Print();
		c2.getArea();
		c3.Print();
		c3.getArea();
	}
}
