package com.auto.gi.ProjNameAI;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class LEarnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		learnHashTable();
		learnHashMap();
		
	}
	public static void learnHashTable()
	{
		Hashtable<String, String> ssObj = new Hashtable<String, String>();
		
		Hashtable<Integer, String> isObj = new Hashtable<Integer, String>();
		
		Hashtable<String, Integer> siObj = new Hashtable<String, Integer>();
		
		//ssObj.put(null, "NullKeyVal");
		ssObj.put("", "BlankKeyVal");
		ssObj.put("Place", "");
		ssObj.put("FirstName", "Ritesh");
		ssObj.put("LastName", "Patel");
		ssObj.put("ExtraName", "Marlton");
		ssObj.put("Salary", "10");
		
		System.out.println("Null Key : " + ssObj.get(""));
		System.out.println("FirstName : " + ssObj.get("FirstName"));
		System.out.println("LastName : " + ssObj.get("LastName"));
		System.out.println("ExtraName : " + ssObj.get("ExtraName"));
		System.out.println("Salary : " + ssObj.get("Salary"));
		System.out.println("Salary : " + Integer.valueOf(ssObj.get("Salary")) *20);
		
		System.out.println("*******************************");
		
		System.out.println(ssObj);
		
		Enumeration<String> myKeys = ssObj.keys();
		
		System.out.println("*******************************");
		
		while(myKeys.hasMoreElements())
		{
			String kv = myKeys.nextElement();
			System.out.println(kv + " :- " + ssObj.get(kv));
		}
		
		System.out.println("*******************************");
		
		ssObj.put("FirstName", "Pranav");
		ssObj.put("LastName", "Dave");
		ssObj.put("ExtraName", "Cherry Hill");
		System.out.println("FirstName : " + ssObj.get("FirstName"));
		System.out.println("LastName : " + ssObj.get("LastName"));
		System.out.println("ExtraName : " + ssObj.get("ExtraName"));
		
		ssObj.clear();
		
		System.out.println("FirstName : " + ssObj.get("FirstName"));
		System.out.println("LastName : " + ssObj.get("LastName"));
		System.out.println("ExtraName : " + ssObj.get("ExtraName"));
		
		isObj.put(1, "Patel");
		isObj.put(2, "Dave");
		System.out.println("1 : " + isObj.get(1));
		System.out.println("2 : " + isObj.get(2));
		
		siObj.put("TOTAL", 50);
		siObj.put("PASSED", 40);
		siObj.put("FAILED", 6);
		
		System.out.println("TOTAL : " + siObj.get("TOTAL"));
		System.out.println("PASSED : " + siObj.get("PASSED"));
		System.out.println("NOTCOMPLETED : " + (siObj.get("TOTAL")-siObj.get("PASSED")));
	}


	public static void learnHashMap()
	{
		HashMap<String, String> ssMap = new HashMap<String, String>();
		
		HashMap<Integer, String> isMap = new HashMap<Integer, String>();
		
		HashMap<String, Integer> siMap = new HashMap<String, Integer>();
		
		ssMap.put(null, "NullKey");
		ssMap.put("", "BlankKey");
		ssMap.put("Country", "USA");
		ssMap.put("State", "Guajrat");
		ssMap.put("City", "Gandhinagar");
		//System.out.println("Null Key : " + ssMap.get(""));
		System.out.println("Country : " + ssMap.get("Country"));
		System.out.println("State : " + ssMap.get("State"));
		System.out.println("City : " + ssMap.get("City"));
		
		System.out.println("*******************************");
		
		System.out.println(ssMap);
		
		System.out.println("*******************************");
		
		Set<String> myKeys = ssMap.keySet();
		for(String str : myKeys)
		{
			System.out.println(str + " :- " + ssMap.get(str));
		}
		
		System.out.println("*******************************");		
	}
}
