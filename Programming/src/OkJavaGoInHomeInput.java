import javax.swing.JOptionPane; // Ŭ������ �ε� �Ǿ ����� ���� 
import org.opentutorials.iot.*;

public class OkJavaGoInHomeInput {

	// parameter , �Ű�����  
	public static void main(String[] args) {  // args�� ����ڰ� �Է��� ���� ���´�. 
		// ���� ���� �ڵ�ȭ �Ҽ� �ְڴٰ� ����ȭ �Ҽ� �ִ�. 
			
//		String id = args[0]; 
//		String bright = args[1]; 
		
			
//		String id = JOptionPane.showInputDialog("����Ʈ�� ID�� �Է��ϼ���.");  ���� �ɼ����� �Է��Ҷ����� �ڹٰ� �����ִٰ� OK������ ���� ���ڿ��� �ٲ��.
//		String bright = JOptionPane.showInputDialog("������ ��� ������ �Է��ϼ���."); 
		
		
		  	String id =  "JAVA APT 150";
		  	String bright = "10";
		 
		/*	
		String id = args[0]; // args �Ķ���� ������ �ޱ� 
		String bright = args[1];
		*/
		
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
	
		
		DimmingLights moodLamp = new DimmingLights(id +"moodLamp");
		
		
		moodLamp.setBright(Double.parseDouble(bright)); // 10% ��� ����  , Double �� �Է����� �޾ƺ��� 
		moodLamp.on();
		
	}
}
