//369���� ���α׷� 
public class FlowExam {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			System.out.print("i="+i);
			
			int temp = i;  //i�� ���� �ٸ� ������ ���� => do _ while�� ������ while�� ���ǿ��� for���� ���� i�� ����� �� ��� 
			
			do {  
				if(temp % 10 %3 == 0 && temp % 10 != 0) {  
					System.out.print("¦");
					}
				}while((temp/=10) != 0); //10�� �������� �ÿ� ���� 0�̸� ���������� ���� 0�� �ƴϸ� �ٽ� �ݺ��Ѵ�. 
			// >> ���� temp�� 99�� �� ¦��  ���� ��µǰ� while���ǽĿ��� 99 / 10 => 9 
			//�׷��Ƿ� �ٽ� do�� ���� temp�� 9�� �ְ� �� �� �� �ϰ� while������ ������� 0�� �ǹǷ� �����. 
			
			System.out.println();
			
			}
		}
	}

