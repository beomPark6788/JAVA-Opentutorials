
public class AccountingArrayLoopApp {
	public static void main(String[] args) {
			
		double valueOfSupply = Double.parseDouble(args[0]); // String �迭�� double�� �������� double������ ����ȯ 
		double vatRate = 0.1; // �ΰ���ġ�� 
		double expenseRate = 0.3; // ���
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; // ���� = ���ǰ��� - ���� 
		
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
		
		int i = 0; // �ʱ�ȭ
		while(i < dividendRates.length) { // ���ǽ�
			System.out.printf("dividend %d :" + dividendRates[i] , i + 1); // �ݺ��� ���� println ���ٷ� ǥ���Ҽ� �ְ� �ȴ�. 
			System.out.println();
			i++; // �����̸�  �ݺ����� ������ֵ��� ���� 
		}
	}
}
