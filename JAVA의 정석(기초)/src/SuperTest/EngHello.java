package SuperTest;

class EngHello extends Greeting{
	public String name = "Mr.hong";
	public void sayHello() {
		System.out.println(name+"Nice to meet you");
	}
	public void test() {
		System.out.print(super.name);
		super.sayHello();
	}
	public static void main(String args[]) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
	}
}
