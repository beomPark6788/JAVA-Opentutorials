
public class AccountingIfApp2 {
	public static void main(String[] args) {
					
		double valueOfSupply = Double.parseDouble(args[0]); 
		double vatRate = 0.1; 
		double expenseRate = 0.3; 
		double vat = valueOfSupply * vatRate;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense; 

			
		 double dividend1 , dividend2 , dividend3 ;
		 
		if(income > 10000.0) { // ���� ���� ���ǽ� 
			 dividend1 = income * 0.5; 
			 dividend2 = income * 0.3;
			 dividend3 = income * 0.2;
		} else {
			 dividend1 = income * 1.0; 
			 dividend2 = income * 0;
			 dividend3 = income * 0;
		}
		
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
