package Game;

import java.util.Scanner;

/*
 * ������� : ��������(���̾��(��Ʈ),�����̴���(�Ź���),��������(��)), �����
 * ������� : ������, �Ǵ��� �����ϴ�,���(�̰��, ����)
 */
public class hero {
	Scanner scan = new Scanner(System.in);
	int heroCho;
	int life;
	int attack;
	int power;
	String name;
	
	public hero(int heroCho,int life,int power) {
		this.heroCho = heroCho;
		this.life = life;
		this.power = power;
	}
	public void attack_villain(Villain item) {  //�Ǵ��� �����ϴ�
		while(life != 0 && item.life != 0) {
		System.out.println("�Ǵ��� �� �� ������ ���ΰ��� >> ");
		attack = scan.nextInt();
		if(item.life > (attack * power)) {
			item.life -= (attack * power);
			System.out.println("������� ���� ������� "+item.life+" �Դϴ�.");
		}else {
			switch(heroCho) {
			case 1: name="���̾��(����: ��Ʈ)"; break;
			case 2: name="�����̴���(����:�Ź���)"; break;
			case 3: name="��������(����: ��)"; break;
			}
			System.out.println(item.name+ "�� �׾����ϴ�." +this.name+" �� �¸��Դϴ�.");
			item.life=0;
		}
	}
}
}
