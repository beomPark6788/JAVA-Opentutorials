
public class AccountingArrayApp {
	public static void main(String[] args) {
			
		// 변수를 도입해보자   Extract local variable 단축기 Alt Shift L 
		// 우리가 계산한것에 변수를 붙여줬다. 
		// 만원으로 한번만 바꿔주면 전체다 계산해준다. 위대한 애플리케이션이 된다. 
			
		double valueOfSupply = Double.parseDouble(args[0]); // String 배열에 double를 넣으려면 double형으로 형변환 
		double vatRate = 0.1; // 부가가치세 
		double expenseRate = 0.3; // 비용
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; // 수입 = 물건가격 - 지출 
		
		/*
		 * double rate1 = 0.5; double rate2 = 0.3; double rate3 = 0.2;
		 */
		// ... 1억줄의 코드가 있다면
		//환상적인 코드가 배열이 있다.
		
		double[] dividendRates = new double[3];
		// 서로 연관된 데이터를 정리정돈 한다. 
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.2;
		dividendRates[2] = 0.3;
		
		double dividend1 = income * dividendRates[0]; // 수입 x 0.5
		double dividend2 = income * dividendRates[1]; // 
		double dividend3 = income * dividendRates[2];
			
		System.out.println("Value of supply : " + valueOfSupply); // 물건가격 
		System.out.println("VAT : " + vat); // 부가가치세  10프로   0.1은 앞으로 
		System.out.println("Total : " + (valueOfSupply + vat)); // 물건가격 + 부가가치세 	
		System.out.println("Expense : " + expense); // 비용     물건가격 - 30프로	
		System.out.println("Income : " + income); // 수익  		
		System.out.println("dividend 1 : " + dividend1);// 배당 7000 10분의 2 , 10분의 3 , 10분의 5 
		// (10000.0 - 10000.0*0.3) * 0.5);
		System.out.println("dividend : " + dividend2);// 배당 7000 10분의 2 , 10분의 3 , 10분의 5 
		System.out.println("dividend : " + dividend3);// 배당 7000 10분의 2 , 10분의 3 , 10분의 5 	
		// 공부를 잘하는것보다 일을 잘하는것이 중요하다. 
	}
}
