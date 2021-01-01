import org.opentutorials.iot.*;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		// 많은 일을 자동화 할수 있겠다고 음미화 할수 있다. 
		
		
		
		String id = "JAVA APT 507"; // 변수로 중복을 한번에 관리 할수 있다. 
		
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
	}
}
