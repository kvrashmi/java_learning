package maps;

import java.util.*;

public class Map2 {

	public static void main(String[] args) {
		//Maps:
		//Unordered collection - where insertion order is not preserved
		// It stores objects in key value pair
		//Rules for a key:
		//Keys in a same map cannot be duplicated - they must be unique
		//Keys cannot have a null value
		
		
		    //key  value
		Map<String,Integer> m1 = new HashMap<String,Integer>(); //Using interface
		HashMap<String,Integer> m2 = new HashMap<String,Integer>(); //Using class
		
		//How to add entries to a map
		m1.put("USA",1);
		m1.put("Canada",2);
		m1.put("Mexico",4);
		
		System.out.println("M1:"+m1);
		
		m2.put("Canada",4);
		m2.put("Ukraine", 5);
		m2.put("Mexico", 5);
		
		m1.putAll(m2);
		
		System.out.println("M1:"+m1);
		System.out.println("M2:"+m2);
		
		m1.putIfAbsent("Canada", 6);
		m1.putIfAbsent("Cuba", 7);
		
		System.out.println("M1:"+m1);
		
		System.out.println(m1.get("Mexico"));
		System.out.println(m1.get("Kenya"));
		
		System.out.println(m1.getOrDefault("Canada", 1000));
		System.out.println(m1.getOrDefault("Kenya", 1000));
		
		System.out.println(m1.containsKey("India"));
		System.out.println(m1.containsValue(4));
		
		m1.replace("Cuba",10);
		System.out.println("M1:"+m1);
		
		m1.replace("Cuba", 10, 100);
		System.out.println("M1:"+m1);
		
		m1.replaceAll( (key, value) -> value*100 );
		System.out.println("M1:"+m1);
		
		m1.remove("USA");
		System.out.println("M1:"+m1);
		
		m1.remove("Ukraine", 500);
		System.out.println("M1:"+m1);
		
		m2.clear();
		System.out.println("M2:"+m2);
			
		//Iterating map using its keys 
		for(String s: m1.keySet()) 
		{
			// print each key
		      System.out.print(s + " ");
		}
		
		//Iterating map using its values
		for(Integer i: m1.values())
		{
			System.out.println(i + " ");
		}
		
		
		//iterate our map using both key and value
		//Map.Entry<String,Integer>
		for(Map.Entry<String, Integer> e: m1.entrySet()) 
		{
		    System.out.println(e.getKey() + " " + e.getValue());
		}

		Map<String,String> m11 = new HashMap<String,String>();
		m11.put("Test","SOAP");
		m11.put("Test1", "XML");
		
		Map<String,String> m12 = new HashMap<String,String>();
		m12.put("Test2","JSON");
		m12.put("Test3", "CSV");
		
		Map<String,String> m13 = new HashMap<String,String>();
		m13.put("Test4","POM");
		m13.put("Test5", "POI");
		
		//List<String> listOfStrings = new ArrayList<String>();
		List<Map<String,String>> listOfMaps = new ArrayList<Map<String,String>>();
		
		listOfMaps.add(m11);
		listOfMaps.add(m12);
		listOfMaps.add(m13);
		
		
		
		List<String> listOfStrings = new ArrayList<String>();
		for(String x:listOfStrings)
		{
			
		}
		
		for(Map<String,String> eachMap: listOfMaps) //Outer for loop is going to iterate over the list
		{
			for(Map.Entry<String, String> entry: eachMap.entrySet()) // inner for loop is going to iterate over the map.
			{
				System.out.println("Key: "+entry.getKey()+ " Value:"+entry.getValue());
			}
		}

/*
	listOfMaps:
    0:[Key: Test1 Value:XML]
    1:[Key: Test Value:SOAP]
===>2:[Key: Test3 Value:CSV]
	3:[Key: Test2 Value:JSON]
	4:[Key: Test5 Value:POI]
	5:[Key: Test4 Value:POM]

		
Line 124: 	eachMap : element 0 => [Key: Test1 Value:XML]
Line 126:   entry: Key: Test1 Value:XML
Line 128:	entry.getKey => Test1 entry.getValue => XML

Line 124:   eachMap: element 1 => [Key: Test Value:SOAP]
Line 126:   entry: Key: Test Value:SOAP
Line 128:   entry.getKey => Test ,entry.getValue => SOAP

Line 124: 	eachMap: element 2 => [Key: Test3 Value:CSV]
Line 126: 	entry: Key: Test3 Value:CSV
Line 128:   entry.getKey => Test3 entry.getValue => CSV

*/		
	}

}
