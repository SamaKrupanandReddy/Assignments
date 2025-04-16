package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {

	public static void main(String[] args) {

		// Student Details
		
		Map<String, String> Student1Details = new HashMap<String, String>();
		Student1Details.put("Name", "Jhon Doe");
		Student1Details.put("Age", "20");
		Student1Details.put("Gender", "Male");
		Student1Details.put("Roll Number", "S12345");
		Student1Details.put("Grade", "A");
		Student1Details.put("Major", "Computer Science");
		Student1Details.put("GPA", "3.8");
		Student1Details.put("Email", "john@example.com");
		Student1Details.put("Contact Number", "9999997777");
		Student1Details.put("Address", "123 Elm St");


		Map<String, String> Student2Details = new HashMap<String, String>();
		Student2Details.put("Name", "Jane Smith");
		Student2Details.put("Age", "21");
		Student2Details.put("Gender", "Female");
		Student2Details.put("Roll Number", "S12346");
		Student2Details.put("Grade", "B");
		Student2Details.put("Major", "Mathematics");
		Student2Details.put("GPA", "3.5");
		Student2Details.put("Email", "jane@example.com");
		Student2Details.put("Contact Number", "9876665666");
		Student2Details.put("Address", "456 Oak St");


		Map<String, String> Student3Details = new HashMap<String, String>();
		Student3Details.put("Name", "Mike Brown");
		Student3Details.put("Age", "22");
		Student3Details.put("Gender", "Male");
		Student3Details.put("Roll Number", "S12347");
		Student3Details.put("Grade", "A");
		Student3Details.put("Major", "Physics");
		Student3Details.put("GPA", "3.9");
		Student3Details.put("Email", "mike@example.com");
		Student3Details.put("Contact Number", "8787876546");
		Student3Details.put("Address", "789 Pine St");
		
		
		//Employee Details

		Map<String, String> Employee1Details = new HashMap<String, String>();
		Employee1Details.put("Employee ID", "E001");
		Employee1Details.put("Name", "Alice Green");
		Employee1Details.put("Age", "30");
		Employee1Details.put("Gender", "Female");
		Employee1Details.put("Department", "Engineering");
		Employee1Details.put("Position", "Software Engineer");
		Employee1Details.put("Salary", "75,000");
		Employee1Details.put("Email", "alice@example.com");
		Employee1Details.put("Contact Number", "9876543213");


		Map<String, String> Employee2Details = new HashMap<String, String>();
		Employee2Details.put("Employee ID", "E002");
		Employee2Details.put("Name", "Bob Johnson");
		Employee2Details.put("Age", "35");
		Employee2Details.put("Gender", "Male");
		Employee2Details.put("Department", "Marketing");
		Employee2Details.put("Position", "Marketing Manager");
		Employee2Details.put("Salary", "85,000");
		Employee2Details.put("Email", "bob@example.com");
		Employee2Details.put("Contact Number", "9876543214");


		Map<String, String> Employee3Details = new HashMap<String, String>();
		Employee3Details.put("Employee ID", "E003");
		Employee3Details.put("Name", "Carol White");
		Employee3Details.put("Age", "28");
		Employee3Details.put("Gender", "Female");
		Employee3Details.put("Department", "Sales");
		Employee3Details.put("Position", "Sales Executive");
		Employee3Details.put("Salary", "65,000");
		Employee3Details.put("Email", "carol@example.com");
		Employee3Details.put("Contact Number", "9876543215");

		// Product details

		Map<String, String> Product1Details = new HashMap<String, String>();
		Product1Details.put("Product ID", "P001");
		Product1Details.put("Name", "Laptop");
		Product1Details.put("Category", "Electronics");
		Product1Details.put("Price", "$1,200");
		Product1Details.put("Stock Quantity", "50");
		Product1Details.put("Supplier", "Tech Supplies");
		Product1Details.put("Warranty", "2 years");
		Product1Details.put("Rating", "4.5");
		Product1Details.put("Manufacturing Date", "15-01-2023");
		Product1Details.put("Expiry Date", "15-01-2025");


		Map<String, String> Product2Details = new HashMap<String, String>();
		Product2Details.put("Product ID", "P002");
		Product2Details.put("Name", "Desk Chair");
		Product2Details.put("Category", "Furniture");
		Product2Details.put("Price", "$150");
		Product2Details.put("Stock Quantity", "200");
		Product2Details.put("Supplier", "Office Depot");
		Product2Details.put("Warranty", "1 year");
		Product2Details.put("Rating", "4");
		Product2Details.put("Manufacturing Date", "10-02-2023");
		Product2Details.put("Expiry Date", "N/A");


		Map<String, String> Product3Details = new HashMap<String, String>();
		Product3Details.put("Product ID", "P003");
		Product3Details.put("Name", "Coffee Maker");
		Product3Details.put("Category", "Kitchen");
		Product3Details.put("Price", "$75");
		Product3Details.put("Stock Quantity", "100");
		Product3Details.put("Supplier", "KitchenWorld");
		Product3Details.put("Warranty", "6 months");
		Product3Details.put("Rating", "4.2");
		Product3Details.put("Manufacturing Date", "20-03-2023");
		Product3Details.put("Expiry Date", "20-03-2024");



		Map<String, Map<String, String>> data = new HashMap<String, Map<String, String>>();
		data.put("Student_1", Student1Details);
		data.put("Student_2", Student2Details);
		data.put("Student_3", Student3Details);
		
		data.put("Employee_1", Employee1Details);
		data.put("Employee_2", Employee2Details);
		data.put("Employee_3", Employee3Details);
		
		data.put("Product_1", Product1Details);
		data.put("Product_2", Product2Details);
		data.put("Product_3", Product3Details);
		
		
		System.out.println("Product Details of :- "+data.get("Product_2").get("Supplier"));
	

	}

}
