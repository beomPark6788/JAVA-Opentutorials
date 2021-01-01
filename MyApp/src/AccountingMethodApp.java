// �޼ҵ�� �׷����� ���������� �����̴�. 


public class AccountingMethodApp {
	// ���������� �����ؼ� ���޼ҵ忡�� �����Ҽ��ִ�. 
	public static double valueOfSupply = 10000.0; // static������ �ν��Ͻ�ȭ ���� �ʾƵ� ���� 
	private static double vatRate;
	private static double vat; // convert local veriable ���������θ���  
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
	private static double getExpense() { // ��� 
		return valueOfSupply * expenseRate;
	}
	private static double getTotal() {
		return valueOfSupply + getVAT(); 
	}
	private static double getVAT() { // �ΰ���ġ�� ����ϴ� �޼ҵ� 
		return valueOfSupply * vatRate; // 10000.0 * 0.1 
	}
}
