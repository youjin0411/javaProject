package Game;
/*
 * ������� : �Ǵ缱��(����(����),���Ź�(���Ź���),������(��)), �����
 * ������� : ������, ������ �����ϴ�,���(�̰��, ����)
 */
import java.util.Scanner;
public class Villain {
	Scanner scan = new Scanner(System.in);
	int VillainCho;
	int life;
	int attack;
	int power;
	String name;
	
	public Villain(int VillainCho, int life,int power) {
		this.VillainCho = VillainCho;
		this.life = life;
		this.power = power;
	}
	
	public void attack_hero(hero item) {
		while(life != 0 && item.life != 0) {
		System.out.println("������ �� �� ������ ���ΰ��� >> ");
		attack = scan.nextInt();
		if(item.life > (attack * power)) {
			item.life -= (attack * power);
			System.out.println("������� ���� ������� "+item.life+" �Դϴ�.");
		}else {
			switch(VillainCho) {
			case 1: name="����(����:����)"; break;
			case 2: name="���Ź�(����:���Ź���)"; break;
			case 3: name="������(����: ��)"; break;
			}
			System.out.println(item.name+ "�� �׾����ϴ�." +this.name+" �� �¸��Դϴ�.");
			item.life=0;
		}
		}
	}
}
