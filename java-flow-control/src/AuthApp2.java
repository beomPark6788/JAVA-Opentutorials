import javax.swing.JOptionPane;

public class AuthApp2 {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String inputid = JOptionPane.showInputDialog("아이디를 입력하세요.");	
		
		String inputpwd = "1234";
		String inputpwd2 = "1235";
		
		
		String id = args[0]; // egoing
		String pwd = args[1]; // 1234
		String pwd2 = args[2]; // 1235
		
		 
		boolean isRightPass = (inputpwd.equals(pwd) || inputpwd2.equals(pwd2));
		
		if(inputid.equals(id) && isRightPass) {
			System.out.println("Hi. Master!");
			System.out.println("주인님 어서오세요");
		}
		 else {
			System.out.println("who are you ? ");
			System.out.println("주인님이 아닙니다.");
		}
	}
}
