package com.cts.creatio.crm.language.basics;

public class Assignment17_TrianglePattern {

	public static void main(String[] args) {
		int num =5;
		
	for(int i=1;i<=num;i++) {
			
			for(int k=num-i;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");	
			}
			System.out.println(" ");
		
		}
	}

}
