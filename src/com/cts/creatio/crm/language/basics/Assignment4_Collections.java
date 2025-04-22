package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
	//Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		Map<String, Integer> largestCities = new HashMap<String,Integer>();
		largestCities.put("Hyderabad",121112);
		largestCities.put("Chennai",10000);
		largestCities.put("Pune",12456);
		largestCities.put("Mumbai",659728);
		largestCities.put("Delhi",678912);
		
		System.out.println("Total area of Largest cities "+(largestCities.get("Mumbai")+largestCities.get("Pune")));
		
	//Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> attractions = new LinkedHashSet<String>();
		attractions.add("Charminar");
		attractions.add("Tirupathi");
		attractions.add("Manali");
		attractions.add("GOA");
		attractions.add("Coorg");
		attractions.add("Taj Mahal");
		attractions.add("Gateway of india");
		attractions.add("Jammu");
		attractions.add("Qutub Minar");
		attractions.add("Kutch");
		
		System.out.println("Size of attractions in india "+attractions.size());
		
	//Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.	
		int[] arrayValues = new int[10];
		arrayValues[0] = 4;
		arrayValues[1] = 2;
		arrayValues[2] = 5;
		arrayValues[3] = 20;
		arrayValues[4] = 8;
		arrayValues[5] = 9;
		arrayValues[6] = 19;
		arrayValues[7] = 18;
		arrayValues[8] = 15;
		arrayValues[9] = 12;
		
		System.out.println("Average of elements "+(arrayValues[4]+arrayValues[5])/2);
		
	//Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
		List<String> movies = new ArrayList<String>();
		movies.add("Bahubali 1");
		movies.add("Bahubali 2");
		movies.add("Dangal");
		movies.add("RRR");
		movies.add("Chava");
		
		System.out.println("Third movie in the list "+movies.get(2));
		
		
	}
}
