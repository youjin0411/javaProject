package ClassMethod;

class Studnet {
	String name;
	int grade;
	
	public Studnet() {}
	
	public Studnet(String name) {
		this.name = name;
	}
	
	public Studnet(String name,int grade) {
		this(name);
		this.grade = grade;
	}
	/*
	public void print() {
		System.out.println("�л��� �̸��� "+this.name+"�̰�, "+this.grade+"�г��Դϴ�.");
	}
	*/
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return this.grade;
	}
}
