package SuperTest;

class Myclass extends Grandfather{
	
	public Myclass(String str,int age) {
		super(str, age);
		System.out.println("MyClass ������");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass s = new Myclass("������",18);
	}

}
