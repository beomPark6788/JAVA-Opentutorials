import javax.swing.JOptionPane;

public class AuthApp {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String inputid = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");	
		String inputpwd = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");	
		
		String id = args[0]; // egoing
		String pwd = args[1]; // 1234
		
		
		// ==�����ڴ� ���� �޸𸮿� ���� ��� �������� Ȯ���ϴ� ���Դϴ�. 
		//  ������ args��  ���Ը��� �迭�� �ִ°��̱⶧���� id��InputId�� �ٸ��̴ϴ� 	
		//  ���ڿ��� �񱳴� equals�� ���� equals ��ȯ���� boolean �̴�.  	
//	 if(inputid.equals(id)) 
//		 if(inputpwd.equals(pwd)) {
//			System.out.println("Hi. Master!");
//			System.out.println("���δ� �������");
//		}
//		 else {
//		
//			System.out.println("wrong password");  // ����� Ʋ�� ��� 
//		}
//		System.out.println("Who are you ? ");
		 // �����ϰ�  �������ڸ� �����ִ�. �Ѵ� true ���� �Ѵ�. 
		 if(inputid.equals(id) && inputpwd.equals(pwd)) {
			System.out.println("Hi. Master!");
			System.out.println("���δ� �������");
		}
		 else {
			System.out.println("who are you ? ");
			System.out.println("���δ��� �ƴմϴ�.");
		}
	}
}
