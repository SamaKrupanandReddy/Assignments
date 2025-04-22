package com.cts.creatio.crm.language.basics;

public class Assignment7_IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		
		if(creditScore>750) {
			System.out.println("Loan is approved ");
		}
		else if(creditScore<750 && creditScore>650) {
			if(income>=55000.0) {
				System.out.println("Loan is approved ");
			}
			else {
				if(isEmployed==true) {
					if(debtToIncomeRatio<40) {
						System.out.println("Loan is approved ");
					}
					else {
						System.out.println("Loan is rejected");
					}
				}else {
					System.out.println("Loan is rejected");
				}
			}
			
		}else {
			System.out.println("Loan is rejected");
		}
	}

}
