
public class AccountingArrayApp {
	public static void main(String[] args) {
			
		// ������ �����غ���   Extract local variable ����� Alt Shift L 
		// �츮�� ����ѰͿ� ������ �ٿ����. 
		// �������� �ѹ��� �ٲ��ָ� ��ü�� ������ش�. ������ ���ø����̼��� �ȴ�. 
			
		double valueOfSupply = Double.parseDouble(args[0]); // String �迭�� double�� �������� double������ ����ȯ 
		double vatRate = 0.1; // �ΰ���ġ�� 
		double expenseRate = 0.3; // ���
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; // ���� = ���ǰ��� - ���� 
		
		/*
		 * double rate1 = 0.5; double rate2 = 0.3; double rate3 = 0.2;
		 */
		// ... 1������ �ڵ尡 �ִٸ�
		//ȯ������ �ڵ尡 �迭�� �ִ�.
		
		double[] dividendRates = new double[3];
		// ���� ������ �����͸� �������� �Ѵ�. 
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.2;
		dividendRates[2] = 0.3;
		
		double dividend1 = income * dividendRates[0]; // ���� x 0.5
		double dividend2 = income * dividendRates[1]; // 
		double dividend3 = income * dividendRates[2];
			
		System.out.println("Value of supply : " + valueOfSupply); // ���ǰ��� 
		System.out.println("VAT : " + vat); // �ΰ���ġ��  10����   0.1�� ������ 
		System.out.println("Total : " + (valueOfSupply + vat)); // ���ǰ��� + �ΰ���ġ�� 	
		System.out.println("Expense : " + expense); // ���     ���ǰ��� - 30����	
		System.out.println("Income : " + income); // ����  		
		System.out.println("dividend 1 : " + dividend1);// ��� 7000 10���� 2 , 10���� 3 , 10���� 5 
		// (10000.0 - 10000.0*0.3) * 0.5);
		System.out.println("dividend : " + dividend2);// ��� 7000 10���� 2 , 10���� 3 , 10���� 5 
		System.out.println("dividend : " + dividend3);// ��� 7000 10���� 2 , 10���� 3 , 10���� 5 	
		// ���θ� ���ϴ°ͺ��� ���� ���ϴ°��� �߿��ϴ�. 
	}
}
