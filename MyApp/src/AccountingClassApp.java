// 메소드는 그루핑한 정리정돈한 상자이다. 

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
//		// ... 수십개 메소드가 호출됐다
//		// 어쩌다가 다른 제품이 들어오면
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
		// .... 클래스의 내부를 바꾸면 버그를 유발할 가능성이 높다. 
		
		
		// anotherVariable = ...;
		// anotherMethod = ...;
		// 메소드가 1억개찍있으면 생산성을 급격하게 떨어 뜨리게 된다.
		// 이때 도와주는것이 클래스이다. 
	
		//복제된 클래스를 이용해서 더 편리하고 버그가 적은 로딩을 할수 있게 된다.
		
//		Accounting1.valueOfSupply = 20000.0;
//		Accounting1.vatRate = 0.05;
//		Accounting1.expenseRate = 0.2;
//		Accounting1.print();
//		// .. 
//		Accounting2.valueOfSupply = 30000.0;
//		Accounting2.vatRate = 0.2;
//		Accounting2.expenseRate = 0.4;
//		Accounting2.print();
		
		Accounting1 a1 = new Accounting1(); // new를 통해 Account클래스를 복제한다.  a1 변수에 Accounting 복제본이 들어올수있게 한다. 
		// 데이터 타입은 Accounting1 클래스만 받는다.
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		
		// 또다른 복제본을 만들때는 
		Accounting1 a2 = new Accounting1(); // new를 통해 Account클래스를 복제한다.  a1 변수에 Accounting 복제본이 들어올수있게 한다. 
		// 데이터 타입은 Accounting1 클래스만 받는다.  ( 인스턴스 라고 한다. - 인스턴스화 한다.)
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.2;
		a2.expenseRate = 0.6;
		
		a1.print();
		System.out.println("===============");
		a2.print();
	}
}
