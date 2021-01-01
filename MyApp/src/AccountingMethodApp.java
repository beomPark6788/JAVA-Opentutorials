// 메소드는 그루핑한 정리정돈한 상자이다. 


public class AccountingMethodApp {
	// 전역변수로 지정해서 모든메소드에서 접근할수있다. 
	public static double valueOfSupply = 10000.0; // static끼리는 인스턴스화 하지 않아도 공유 
	private static double vatRate;
	private static double vat; // convert local veriable 전역변수로만듬  
	private static double expenseRate;
	private static double income;

	public static void main(String[] args) {		
		valueOfSupply = 10000.0;
		vatRate = 0.1; 	
		expenseRate = 0.3; 
		print();
		getIncome();
	}
	private static void print() {
		System.out.println("Value of supply : " + valueOfSupply); 
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome()); 	
		System.out.println("dividend 1 : " + getDividend1());
		System.out.println("dividend : " + getDividend2());
		System.out.println("dividend : " + getDividend3());
	}
	private static double getDividend3() {
		return getIncome() * 0.2;
	}
	private static double getDividend2() {
		return getIncome() * 0.3;
	}
	private static double getDividend1() {
		return getIncome()* 0.5;
	}
	private static double getIncome() {
		return valueOfSupply - getExpense();
	}
	private static double getExpense() { // 비용 
		return valueOfSupply * expenseRate;
	}
	private static double getTotal() {
		return valueOfSupply + getVAT(); 
	}
	private static double getVAT() { // 부가가치를 계산하는 메소드 
		return valueOfSupply * vatRate; // 10000.0 * 0.1 
	}
}
