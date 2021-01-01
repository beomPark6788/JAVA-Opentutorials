
public class AccountingIfApp2 {
	public static void main(String[] args) {
					
		double valueOfSupply = Double.parseDouble(args[0]); 
		double vatRate = 0.1; 
		double expenseRate = 0.3; 
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; 

			
		 double dividend1 , dividend2 , dividend3 ;
		 
		if(income > 10000.0) { // 수익 으로 조건식 
			 dividend1 = income * 0.5; 
			 dividend2 = income * 0.3;
			 dividend3 = income * 0.2;
		} else {
			 dividend1 = income * 1.0; 
			 dividend2 = income * 0;
			 dividend3 = income * 0;
		}
		
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
