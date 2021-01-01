import javax.swing.JOptionPane;

public class AuthApp {
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
		
		String inputid = JOptionPane.showInputDialog("아이디를 입력하세요.");	
		String inputpwd = JOptionPane.showInputDialog("비밀번호를 입력하세요.");	
		
		String id = args[0]; // egoing
		String pwd = args[1]; // 1234
		
		
		// ==연산자는 같은 메모리에 있을 경우 동일한지 확인하는 것입니다. 
		//  하지만 args는  쉽게말해 배열에 넣는것이기때문에 id와InputId는 다른겁니다 	
		//  문자열의 비교는 equals를 쓰자 equals 반환값이 boolean 이다.  	
//	 if(inputid.equals(id)) 
//		 if(inputpwd.equals(pwd)) {
//			System.out.println("Hi. Master!");
//			System.out.println("주인님 어서오세요");
//		}
//		 else {
//		
//			System.out.println("wrong password");  // 비번만 틀린 경우 
//		}
//		System.out.println("Who are you ? ");
		 // 간단하게  논리연산자를 쓸수있다. 둘다 true 여야 한다. 
		 if(inputid.equals(id) && inputpwd.equals(pwd)) {
			System.out.println("Hi. Master!");
			System.out.println("주인님 어서오세요");
		}
		 else {
			System.out.println("who are you ? ");
			System.out.println("주인님이 아닙니다.");
		}
	}
}
