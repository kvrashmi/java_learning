package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class AlphabetOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Please enter a text:");
		String s = sc.nextLine(); 
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			if(s.charAt(i)!='\n')
			{
				//check if this key is available in map
				if(m.containsKey(Character.toString(s.charAt(i)))) //if key is already there do this
				{
					int occurance=m.get(Character.toString(s.charAt(i)))+count;
					m.put(Character.toString(s.charAt(i)), occurance);
				}
				else
				{
					m.putIfAbsent(Character.toString(s.charAt(i)),1); // if key is not there, create the key and do this
				}
			}
		}
		System.out.println("Map:"+m);
		
        
		int[] arr = new int[s.length()];
		int i=0;
		for(Map.Entry<String, Integer> entry:m.entrySet())
		{
			arr[i]=entry.getValue();
			i++;
		}
		
		// Initialize maximum element
        int max = arr[0]; 
        // Traverse array elements from second and
        // compare every element with current max
        for (int j = 1; j < arr.length; j++)
        {
            if (arr[j] > max)
            {
                max = arr[j];
            }
        }
        
        System.out.println("Max:"+max);
        for(Map.Entry<String, Integer> entry:m.entrySet())
		{
			if(entry.getValue()==max)
			{
				System.out.println("Highest Occurance:"+entry.getKey());
			}
		}
	}
}

