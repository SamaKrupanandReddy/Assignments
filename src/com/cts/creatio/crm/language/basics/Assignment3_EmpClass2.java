package com.cts.creatio.crm.language.basics;

public class Assignment3_EmpClass2 {
	
	public static void main(String[] args) {
		
		Assignment3_EmpClass1 empDetails = new Assignment3_EmpClass1();
		String[] employeeName= {empDetails.empNames[0],empDetails.empNames[1],empDetails.empNames[2]};
		int[] employeeId = {empDetails.empIds[0],empDetails.empIds[2],empDetails.empIds[2]};
		 
		System.out.println("Employee Name: " +employeeName[0]+" Employee ID: "+employeeId[0]);
		System.out.println("Employee Name: " +employeeName[1]+" Employee ID: "+employeeId[1]);
		System.out.println("Employee Name: " +employeeName[2]+" Employee ID: "+employeeId[2]);
	
	}
	
}
