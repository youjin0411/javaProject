import java.util.Scanner;
//1~3���� ���� ���� ������ ������ ��¹����ÿ�. (��,0~100 ������ ������ �Է°���)

public class Score_print {
	public static void main(String[] args) {

		int score[][]=new int[3][3];
		inputScore(score);
		PrintResult(score);
	}
		
		//�� ���� ���� �Է¹ޱ�
	public static int[][] inputScore(int[][] score) {  //�Է�
	      Scanner scan=new Scanner(System.in);
	      
	      for(int i=0; i<score.length; i++){   //�Է��� 5�� ���� �� �ֵ��� �迭 ���� 0,1,2,3,4 �ݺ�
	          System.out.println((i+1)+"���� �׸� ���� �Է�");
	          for(int j=0; j<score.length; j++){  
	        	  switch(j+1) {  
	        	  case 1: System.out.print("���� �Է�:"); break;
	        	  case 2: System.out.print("���� �Է�:"); break;
	        	  case 3: System.out.print("���� �Է�:"); break;
	        	  }
	             score[i][j]=scan.nextInt();  
	             
	             while(score[i][j]>100||score[i][j]<0) {   //20�ʰ� �̰ų� 0�̸��� �� �ٽ� �Է�
	                System.out.println("�ٽ� �Է�:");
	                  score[i][j]=scan.nextInt();
	             }
	           }
	      }
	      return score; //�Է¹��� �� ���� �ϼ��� â�Ǽ� ���ص��� main�޼��忡 ���� �����ش�. 
	    }
	    
	public static void PrintResult(int[][] score) {
		System.out.println("������ Ȯ�����ּ���");
		System.out.println("��\t����\t����\t����");

		for(int i=0; i<score.length; i++){ //�� 5�� 
	    	  System.out.print((i+1)+"��"+"\t");   //1-5�� ���
	         for(int j =0; j<score[i].length; j++) { //5��  
	               System.out.print(score[i][j]+"\t"); //���� ���
	         }  
	         System.out.println(""); // �� �� ����
		}
	}
}

