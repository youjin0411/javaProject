/*
 * ������� : ���̸�, �����, ����
 * ������� : ������, ������ �ϴ�, ������ �޾�, ���
 */
public class enemy {
	 String ename;
	 int elife;
	 int eweapon;
	 
	 public enemy(String name, int elife, int eweapon) {
		 this.ename = name;
		 this.elife = elife;
		 this.eweapon= eweapon;
	 }
	 
	 public void eattack(player item,int acount) {
		 if((item.life)-(acount * eweapon)==0) {
			 System.out.println(item.name+"�� �׾����ϴ�.");
		 }else {
			 item.life -= (acount * eweapon);
			 System.out.println(item.name+"������� "+item.life+"���ҽ��ϴ�.");
		 }
	 }
}
