
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 손실이 없어서 자동으로 캐스팅 
		double b2 = (double) 1; // 손실이 없어서 자동으로 캐스팅 
		System.out.println(b); // 정수가 실수로 
		
//		int c = 1.1; // 잃어버리는 부분이 생긴다.
		double d = 1.1;
		int e = (int) 1.1; // 손실이 일어나기 때문에 강제적인 형변환 
		System.out.println(e); // 1 
		
		// 1 to String 정수를 문자열로 변환
		String strI = Integer.toString(e);
		System.out.println(strI.getClass()); // .getClass 어떤 데이터 타입인지 알려준다. 
	}

}
