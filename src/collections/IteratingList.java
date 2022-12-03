package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratingList {

	public static void main(String[] args) {
		/*
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Dog");
		al1.add("Cat");
		al1.add("Spider");
		al1.add("Pig");
		al1.add("Parrot");
		
		//Loop through this arraylist - using enhanced for loop
		//s is going to represent each element in al1
		for(String s:al1)
		{
			System.out.println(s+ " is my fav animal");
		}
		
		al1.forEach( (temp) -> {System.out.println(temp+" is my fav animal");});
		
		*/
		Map<String,String> m1 = new HashMap<String,String>();
		m1.put("Test","SOAP");
		m1.put("Test1", "XML");
		
		Map<String,String> m2 = new HashMap<String,String>();
		m2.put("Test2","JSON");
		m2.put("Test3", "CSV");
		
		List<Map<String,String>> listOfMaps = new ArrayList<Map<String,String>>();
		listOfMaps.add(m1);
		listOfMaps.add(m2);
		
		for(Map<String, String> map: listOfMaps)
		{
			for(Map.Entry<String, String> entry: map.entrySet())
			{
				System.out.println("Key: "+entry.getKey()+ " Value:"+entry.getValue());
			}
		}
		
	}
	

}
