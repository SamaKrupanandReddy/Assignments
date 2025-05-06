package com.cts.creatio.crm.language.basics;

public class Assignment14_PrintDiamonds {

	public static void main(String[] args) {
		int num =6;
		
		for(int i=1;i<=num;i++) {
			
			for(int k=num-i;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");	
			}
			System.out.println(" ");
		
		}
		
	for(int i=num-1;i>=1;i--) {
			
			for(int k=num-i;k>=1;k--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");	
			}
			System.out.println(" ");
		
		}
		
	}
}
