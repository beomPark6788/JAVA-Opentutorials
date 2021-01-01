
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		System.out.println("while");
		int i = 0;
		// ..
		while(i < 3) { // while부분을 조건을 두자 
			System.out.println(2);
			System.out.println(3);
			// ..
			i++;
		}		
		
		System.out.println("for");
		// 몇번반복할지 정하는건 for문이 적당
		
		for(int j=0; j < 3; j++) { // 무조건 한번 실행 약속되어 있다. 
			// 하나로 패키지 되서 잘못된 코드가 될 확률이 적다 
			System.out.println(2);
			System.out.println(3);
		}	
		System.out.println(4);
	}
}
