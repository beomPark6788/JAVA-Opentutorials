
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		System.out.println("while");
		int i = 0;
		// ..
		while(i < 3) { // while�κ��� ������ ���� 
			System.out.println(2);
			System.out.println(3);
			// ..
			i++;
		}		
		
		System.out.println("for");
		// ����ݺ����� ���ϴ°� for���� ����
		
		for(int j=0; j < 3; j++) { // ������ �ѹ� ���� ��ӵǾ� �ִ�. 
			// �ϳ��� ��Ű�� �Ǽ� �߸��� �ڵ尡 �� Ȯ���� ���� 
			System.out.println(2);
			System.out.println(3);
		}	
		System.out.println(4);
	}
}
