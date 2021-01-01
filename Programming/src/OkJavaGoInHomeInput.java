import javax.swing.JOptionPane; // 클래스가 로드 되어서 사용이 가능 
import org.opentutorials.iot.*;

public class OkJavaGoInHomeInput {

	// parameter , 매개변수  
	public static void main(String[] args) {  // args에 사용자가 입력한 값이 들어온다. 
		// 많은 일을 자동화 할수 있겠다고 음미화 할수 있다. 
			
//		String id = args[0]; 
//		String bright = args[1]; 
		
			
//		String id = JOptionPane.showInputDialog("아파트의 ID를 입력하세요.");  스윙 옵션으로 입력할때까지 자바가 멈춰있다가 OK누르면 값이 문자열로 바뀐다.
//		String bright = JOptionPane.showInputDialog("전구의 밝기 강도를 입력하세요."); 
		
		
		  	String id =  "JAVA APT 150";
		  	String bright = "10";
		 
		/*	
		String id = args[0]; // args 파라미터 값으로 받기 
		String bright = args[1];
		*/
		
	// Elevator call
		Elevator myElevator = new Elevator(id); // 데이터타입 Elevator 변수명 myElevator , "주소"
		myElevator.callForUp(1); // 1층으로 이동
		
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // 보안 해제 
		
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp"); 
		hallLamp.on(); // 거실 불 킴
			
		
		Lighting floorLamp = new Lighting(id + "JAVA APT 507 / Hall Lamp"); 
		floorLamp.on(); // 스탠드 불 킴 		
	
		
		DimmingLights moodLamp = new DimmingLights(id +"moodLamp");
		
		
		moodLamp.setBright(Double.parseDouble(bright)); // 10% 밝기 조절  , Double 로 입력으로 받아보기 
		moodLamp.on();
		
	}
}
