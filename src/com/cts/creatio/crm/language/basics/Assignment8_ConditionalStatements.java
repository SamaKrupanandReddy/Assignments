package com.cts.creatio.crm.language.basics;

import java.util.List;
import java.util.ArrayList;

public class Assignment8_ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> transcations = new ArrayList<Integer>();
		transcations.add(50000);
		transcations.add(-2000);
		transcations.add(3000);
		transcations.add(-15000);
		transcations.add(-200);
		transcations.add(-300);
		transcations.add(4000);
		transcations.add(-3000);
		
		int creditTransactions = 0;
		int debitTransactions = 0;
		int totalCreditTransactions = 0;
		int totalDebitTransactions = 0;
		int suspiciousTransactions = 0;
		
		for(Integer bankTranscations : transcations) {
			if(bankTranscations>0) {
				creditTransactions++;
				totalCreditTransactions = totalCreditTransactions+ bankTranscations;
				if(bankTranscations>10000) {
					suspiciousTransactions++;
					System.out.println("Suspicious Transcation "+bankTranscations);
				}
			}else {
				debitTransactions++;
				totalDebitTransactions = totalDebitTransactions+ bankTranscations;
				if(bankTranscations<-10000) {
					suspiciousTransactions++;
					System.out.println("Suspicious Transcation "+bankTranscations);
				}
			}
				
		}
		
		System.out.println("Credit Transactions "+creditTransactions);
		System.out.println("Debit Transactions "+debitTransactions);
		System.out.println("Total Credit Amount "+totalCreditTransactions);
		System.out.println("Total Debit Amount "+totalDebitTransactions);
		System.out.println("Suspicious Transactions "+suspiciousTransactions);
		System.out.println("Total Amount "+(totalCreditTransactions+totalDebitTransactions));
		
		
		
		
	}

}
