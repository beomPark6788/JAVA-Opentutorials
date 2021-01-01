
public class AccountingIfUnder10000App3 {  // 만원보다 작을경우 실행 만원보다 크면 기존 앱 실행 
	public static void main(String[] args) {
			
		
			
		double valueOfSupply = Double.parseDouble(args[0]); 
		double vatRate = 0.1; 
		double expenseRate = 0.3; 
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; 
		
		double dividend1 = income * 1; 
		double dividend2 = income * 0;
		double dividend3 = income * 0;
		
		
		System.out.println("Value of supply : " + valueOfSupply); 
		System.out.println("VAT : " + vat); 
		System.out.println("Total : " + (valueOfSupply + vat)); 
		System.out.println("Expense : " + expense); 
		System.out.println("Income : " + income); 	
		System.out.println("dividend 1 : " + dividend1);
		System.out.println("dividend : " + dividend2);
		System.out.println("dividend : " + dividend3);

	}
}
