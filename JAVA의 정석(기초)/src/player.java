/*
 * ������� : �̸�, ����, ����
 * �������  : ������, ���� �����ϴ�, ������ �޴�, ��� 
 */
public class player {
	String name;
	int life;
	int weapon;
	int count;
	
	public player(String name, int life, int weapon) {
		this.name = name;
		this.life = life;
		this.weapon = weapon;
	}
	
	public void attack(enemy item,int count) {
		if(((item.elife)-(count * weapon)) <= 0) {
			System.out.println("���� ����߽��ϴ�.");
		}else {
			item.elife -= count * weapon;
			System.out.println(item.ename+"�� ������� "+item.elife+"���ҽ��ϴ�.");
		}
	}
}
