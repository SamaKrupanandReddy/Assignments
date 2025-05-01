package com.cts.creatio.crm.language.basics;

public class Assignment12_PrimeNumber {

	public static void main(String[] args) {
		int primeNumber= 18;
		
		if(primeNumber==1) {
			System.out.println("1 is not a prime number");
		}
		
		for (int i =1;i<=primeNumber;i++) {
			int count = 0;
		for(int j=2;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		
		if(count>1) {
			System.out.println(i +" is not a prime number");
		}
		else {
			System.out.println(i +" is a prime number");
		}
		}
		
	}

}
