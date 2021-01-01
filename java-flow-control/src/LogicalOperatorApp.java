
public class LogicalOperatorApp {
	public static void main(String[] args) {
		
		System.out.println(1==1); 
		// 논리연산자 AND
		System.out.println(true && true); // true
		System.out.println(true && false); // false;
		System.out.println(false && false); // false;
		
		// 논리연산자 OR
		System.out.println(true || true); // true
		System.out.println(true || false); // true;
		System.out.println(false || true); // true;
		System.out.println(false || false); // false;
	
		// not
		System.out.println(!true); // false
		System.out.println(!false); // true
		
	}
}
