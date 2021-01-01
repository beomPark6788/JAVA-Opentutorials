import org.opentutorials.iot.*;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		// ���� ���� �ڵ�ȭ �Ҽ� �ְڴٰ� ����ȭ �Ҽ� �ִ�. 
		
		
		
		String id = "JAVA APT 507"; // ������ �ߺ��� �ѹ��� ���� �Ҽ� �ִ�. 
		
		// Elevator call
		Elevator myElevator = new Elevator(id); // ������Ÿ�� Elevator ������ myElevator , "�ּ�"
		myElevator.callForUp(1); // 1������ �̵�
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); // ���� ���� 
		
		// Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp"); 
		hallLamp.on(); // �Ž� �� Ŵ
		
		Lighting floorLamp = new Lighting(id + "JAVA APT 507 / Hall Lamp"); 
		floorLamp.on(); // ���ĵ� �� Ŵ 		
	}
}
