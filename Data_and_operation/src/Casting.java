
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // �ս��� ��� �ڵ����� ĳ���� 
		double b2 = (double) 1; // �ս��� ��� �ڵ����� ĳ���� 
		System.out.println(b); // ������ �Ǽ��� 
		
//		int c = 1.1; // �Ҿ������ �κ��� �����.
		double d = 1.1;
		int e = (int) 1.1; // �ս��� �Ͼ�� ������ �������� ����ȯ 
		System.out.println(e); // 1 
		
		// 1 to String ������ ���ڿ��� ��ȯ
		String strI = Integer.toString(e);
		System.out.println(strI.getClass()); // .getClass � ������ Ÿ������ �˷��ش�. 
	}

}
