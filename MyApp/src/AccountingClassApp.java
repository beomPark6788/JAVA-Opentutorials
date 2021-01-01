// �޼ҵ�� �׷����� ���������� �����̴�. 

class Accounting1 {
	public static double valueOfSupply;
	public static double vatRate;
	public static double vat; 
	public static double expenseRate;
	public static double income;
	
	static void print() {
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
	private static double getExpense() { 
		return valueOfSupply * expenseRate;
	}
	private static double getTotal() {
		return valueOfSupply + getVAT(); 
	}
	private static double getVAT() { 
		return valueOfSupply * vatRate; 
	}
}
class Accounting2 {
	public static double valueOfSupply;
	public static double vatRate;
	public static double vat; 
	public static double expenseRate;
	public static double income;
	
	static void print() {
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
	private static double getExpense() { 
		return valueOfSupply * expenseRate;
	}
	private static double getTotal() {
		return valueOfSupply + getVAT(); 
	}
	private static double getVAT() { 
		return valueOfSupply * vatRate; 
	}
}
public class AccountingClassApp {
	
	public static double valueOfSupply = 10000.0;
	private static double vatRate;
	private static double vat; 
	private static double expenseRate;
	private static double income;

	public static void main(String[] args) {
//		Accounting.valueOfSupply = 10000.0;
//		Accounting.vatRate = 0.1; 	
//		Accounting.expenseRate = 0.3; 
//		// ... ���ʰ� �޼ҵ尡 ȣ��ƴ�
//		// ��¼�ٰ� �ٸ� ��ǰ�� ������
//		Accounting.print();
//		// ...
//		Accounting.valueOfSupply = 20000.0;
//		Accounting.vatRate = 0.05;
//		Accounting.expenseRate = 0.2;
//		Accounting.print();
//		// .. 
//		Accounting.valueOfSupply = 30000.0;
//		Accounting.vatRate = 0.2;
//		Accounting.expenseRate = 0.4;
//		Accounting.print();
//		
		// .... Ŭ������ ���θ� �ٲٸ� ���׸� ������ ���ɼ��� ����. 
		
		
		// anotherVariable = ...;
		// anotherMethod = ...;
		// �޼ҵ尡 1�ﰳ�������� ���꼺�� �ް��ϰ� ���� �߸��� �ȴ�.
		// �̶� �����ִ°��� Ŭ�����̴�. 
	
		//������ Ŭ������ �̿��ؼ� �� ���ϰ� ���װ� ���� �ε��� �Ҽ� �ְ� �ȴ�.
		
//		Accounting1.valueOfSupply = 20000.0;
//		Accounting1.vatRate = 0.05;
//		Accounting1.expenseRate = 0.2;
//		Accounting1.print();
//		// .. 
//		Accounting2.valueOfSupply = 30000.0;
//		Accounting2.vatRate = 0.2;
//		Accounting2.expenseRate = 0.4;
//		Accounting2.print();
		
		Accounting1 a1 = new Accounting1(); // new�� ���� AccountŬ������ �����Ѵ�.  a1 ������ Accounting �������� ���ü��ְ� �Ѵ�. 
		// ������ Ÿ���� Accounting1 Ŭ������ �޴´�.
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		// �Ǵٸ� �������� ���鶧�� 
		Accounting1 a2 = new Accounting1(); // new�� ���� AccountŬ������ �����Ѵ�.  a1 ������ Accounting �������� ���ü��ְ� �Ѵ�. 
		// ������ Ÿ���� Accounting1 Ŭ������ �޴´�.  ( �ν��Ͻ� ��� �Ѵ�. - �ν��Ͻ�ȭ �Ѵ�.)
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.2;
		a2.expenseRate = 0.6;
		
		a1.print();
		System.out.println("===============");
		a2.print();
	}
}
