
public class AccountingArrayLoopApp {
	public static void main(String[] args) {
			
		double valueOfSupply = Double.parseDouble(args[0]); // String 배열에 double를 넣으려면 double형으로 형변환 
		double vatRate = 0.1; // 부가가치세 
		double expenseRate = 0.3; // 비용
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; // 수입 = 물건가격 - 지출 
		
		System.out.println("Value of supply : " + valueOfSupply); 
		System.out.println("VAT : " + vat); 
		System.out.println("Total : " + (valueOfSupply + vat));
		System.out.println("Expense : " + expense); 
		System.out.println("Income : " + income); 	
		
		
		double[] dividendRates = new double[3];
		dividendRates[0] = income * 0.5;
		dividendRates[1] = income * 0.3;
		dividendRates[2] = income * 0.2;
		
		double dividend1 =  dividendRates[0]; 
		double dividend2 =  dividendRates[1];  
		double dividend3 =  dividendRates[2];
		
		int i = 0; // 초기화
		while(i < dividendRates.length) { // 조건식
			System.out.printf("dividend %d :" + dividendRates[i] , i + 1); // 반복을 통해 println 한줄로 표현할수 있게 된다. 
			System.out.println();
			i++; // 거짓이면  반복문을 벗어날수있도록 증가 
		}
	}
}
