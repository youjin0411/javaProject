package ���;
 
public class Leader extends Student {
	boolean president;
	public Leader(String name, int hakbun,boolean president) {
		super(name, hakbun);
		this.president = president;
	}
	
	void hello() {}
	
	void isLeader() {
		if(president == true) {
			System.out.println(name+"�� "+"�б�ȸ���̴�");
		}else {
			System.out.println(name+"�� �б�ȸ���� �ƴϴ�.");
		}
	}
}
