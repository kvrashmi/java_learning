package strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeleteConsonants {

	//Write a program to delete all consonants from the string 'Hello, have a good day'.
	public static void main(String[] args) {
		
		CharSequence s="Hello, have a good day.";
		Map<Character,Integer> cMap= new HashMap<Character,Integer>();
	    Character[] consonants = {'B','C','D','F','G','H','J','K','L','M','N','P','Q','R','S','T','V','W','X','Y','Z'};
		for(int i=0;i<consonants.length;i++)
		{
			cMap.put(consonants[i],0);
		}
		System.out.println("ConsonantsMap:"+cMap);
		Set<Entry<Character, Integer>> si= cMap.entrySet();
		for(int i=0;i<s.length();i++)
		{
			if(cMap.containsKey(((String) s).toUpperCase().charAt(i)))
			{
				
			}
			
		}
	}

}
